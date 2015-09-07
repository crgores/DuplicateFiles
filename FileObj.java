// Stores the file as a md5 hash String and integer as size
public class FileObj {
   private String md5;
   private int size;
   
   public FileObj(String md5, int size) {
      this.md5 = md5;
      this.size = size;
   }
   
   public boolean equals(Object other) {
      return (other instanceof FileObj) &&
             ((FileObj)other).md5.equals(this.md5) &&
             ((FileObj)other).size == this.size;
   }
   
   public int hashCode() {
      int result = size;
      for (char val : md5.toCharArray())
         result = 37 * result + (int) val;
      return result;
   }
   
   public String toString() {
      return md5 + " " + size;
   }
}
