 
import java.io.*;
 
public class MarkFileReadOnly {
 
  public static void main(String[] args) {
   

    File file = new File("C://FileIO//demo.txt");
   
    /*
     * To mark a particular file or directory as a read only, use
     * boolean setReadyOnly() method of Java File class.
     *
     * This method returns true if the operation was successful.
     */
    
     boolean blnMarked  = file.setReadOnly();
    
     System.out.println("Was file marked read only ?: " + blnMarked);
    
     //check whether file is readonly or not using canWrite method
     System.out.println("Is file writable ?: " + file.canWrite());
  }
}
 
