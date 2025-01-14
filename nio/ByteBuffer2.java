import java.io.*;
import java.nio.*;
import java.nio.channels.*;


class  ByteBuffer2
{
	public static void main(String[] args) throws Exception
	{
RandomAccessFile file = new RandomAccessFile("a.txt", "rw");
FileChannel inChannel = file.getChannel();

//create buffer with capacity of 48 bytes
ByteBuffer buf = ByteBuffer.allocate(48);

int bytesRead = inChannel.read(buf); //read into buffer.
System.out.println("bytesRead"+(bytesRead));

while (bytesRead != -1)
	{

  buf.flip();  //make buffer ready for read

  while(buf.hasRemaining())
	  {
      System.out.print((char) buf.get()); // read 1 byte at a time
     }

  buf.clear(); //make buffer ready for writing
//  bytesRead = inChannel.read(buf);
}
file.close();


	}
}
