import java.io.*;

class  FIS
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream f= new FileInputStream("Z:/guptaji/guptaji/io/a.txt");
   		FileOutputStream fout= new FileOutputStream("Z:/guptaji/guptaji/io/chagan.txt");

int i=0;
while ((i=f.read())!=-1)
	{  
      fout.write(i);
	//	System.out.println((char)i);
   }

 

	}
}
