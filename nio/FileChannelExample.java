 import java.io.FileInputStream;  
 import java.io.FileNotFoundException;  
 import java.io.IOException;  
 import java.nio.ByteBuffer;  
 import java.nio.channels.FileChannel;  

 public class FileChannelExample 
	 {  

     public static void main(String args[]){  

         FileInputStream fis = null;  

         try {  

             fis = new FileInputStream("a.txt");  
            FileChannel fileChannel = fis.getChannel();  

            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);  

            int bytes = fileChannel.read(byteBuffer);  

            while(bytes!=-1)
				{  
                 byteBuffer.flip();  
                  while (byteBuffer.hasRemaining())
					  {  
                       System.out.print((char)byteBuffer.get());  
                     }  
                 byteBuffer.clear();  
                 bytes = fileChannel.read(byteBuffer);  
             }  
             if(fis!=null){  
                 fis.close();  
             }  
         } catch (FileNotFoundException e) {  
             e.printStackTrace();  
         } catch (IOException e) {  
            e.printStackTrace();  
         }  

     }  
 } 
