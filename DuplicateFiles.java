// One day a google engineer was looking at files stored for the their project,
// and found that there were a lot of duplicate files. The engineer wrote a
// method to count unique files in the directory.
//
// Files are stored in anothe document as lines of text.
// The files are stored as a md5 hashes followed by file sizes.

// This program will print out the count of files found in that document
// and print out the resulting number of duplicate files found.
//
// it does this by using an Object called FileObj which stores the
// md5 and size as fields and allows for sorting and usage of sets with that
// object.

import java.util.*;
import java.io.*;

public class DuplicateFiles {
   
   public static void main(String[] args) throws FileNotFoundException {
      //Set<String> allFiles = new HashSet<String>();
      Set<FileObj> allFiles = new HashSet<FileObj>();
      Scanner s = new Scanner(new File("file_data"));
      
      int lineCount = 0;
      while (s.hasNextLine()) {
         lineCount++;
         String[] line = s.nextLine().split(" ");
         FileObj curFile = new FileObj(line[0], Integer.parseInt(line[1]));
         allFiles.add(curFile);
         //allFiles.add(s.nextLine());
      }
      System.out.println("total files      : " + lineCount);
      System.out.println("unique files     : " + allFiles.size());
      System.out.println("no. of duplicates: " + (lineCount - allFiles.size()));
   }
}
