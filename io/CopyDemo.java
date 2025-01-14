import java.io.*;

class  CopyDemo
{

	public static void main(String[] args) throws IOException
	{
	FileInputStream fin = new FileInputStream(new File("a.txt")); 
    FileOutputStream fos = new FileOutputStream(new File("b.txt"));

int  c;
	while((c=fin.read())!= -1) 
		{ 
        System.out.print((char)c);
		 fos.write(c);
		}
	 System.out.println("data copied!");


	}
}
