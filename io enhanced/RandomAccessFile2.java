import java.io.*;

 class RandomAccessFile2
 {
public  static void main(String[] args) throws IOException
		{
    File file = new File("RandomAccessFile2.java");
    RandomAccessFile raf = new RandomAccessFile(file, "rw");

            // Read a character
 
			byte ch = raf.readByte();
           System.out.println("Read first character of file: " + (char)ch);

            System.out.println("Read full line: " + raf.readLine());

            raf.seek(file.length());

            // Append to the end of the file
   //         raf.write(1000);
            raf.writeBytes("This is end of the world!! DoomsDay!!");

            raf.close();    
			}

 }