import java.io.*;
class Test1
{
public static void main(String arg[])
{
Test1 s = new Test1();
//s.finalize();
s = null;
System.gc();
System.out.println("End of main method");
}
public void finalize()
{
System.out.println("finalize method");
//System.out.println(10/0);
			try
			{
			throw new IOException();	
			}
			catch ( Exception e)
			{
			System.out.println("ouch!!"+e);
			
			}
}

}
