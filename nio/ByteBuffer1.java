import java.io.*;
import java.nio.*;
import java.nio.channels.*;

//A non-direct ByteBuffer is one where the contents are stored in the normal memory. A direct ByteBuffer is one where the contents are stored in some I/O device such as a disk drive or video board. 

class  ByteBuffer1
{
	public static void main(String[] args) 
	{
ByteBuffer buf = ByteBuffer.wrap(new byte[10]);
boolean isDirect = buf.isDirect();  // false
System.out.println(isDirect);
buf = ByteBuffer.allocate(10);
isDirect = buf.isDirect();          // false
System.out.println(isDirect);

buf = ByteBuffer.allocateDirect(10);
isDirect = buf.isDirect();          
		
System.out.println("Hello World!");
	}
}
