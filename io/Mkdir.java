import java.io.*;

class  Mkdir
{
	public static void main(String[] args) throws Exception
	{
	File f = new File ("d:\\mayuri");
	f.mkdir();
	//f.createNewFile();
System.out.println("success");
	}
}
