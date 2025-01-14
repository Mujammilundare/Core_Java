import java.io.*;

class  Listdir
{
public static void main(String[] args) //throws IOException
	{
File f = new File("c:\\");
String [ ] s = f.list();

for(String s1: s)
{
System.out.println(s1);
}

	}
}
