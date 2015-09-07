# DuplicateFiles

One day a google engineer was looking at files stored for the their project,  and found that there were a lot of duplicate files. The engineer wrote a  method to count unique files in the directory. Files are stored in anothe document as lines of text.The files are stored as a md5 hashes followed by file sizes.

This program will print out the count of files found in that document  and print out the resulting number of duplicate files found. It does this by using an Object called FileObj which stores the  md5 and size as fields and allows for sorting and usage of sets with that  object.

