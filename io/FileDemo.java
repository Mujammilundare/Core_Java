import java.io.*;
class FileDemo 
{
	public static void main(String[] args) 
	{
		File f = new File("Z:/guptaji/guptaji/io/FileDemo.java");
    	System.out.println(f.getName());
 	

     	System.out.println(f.getParent());
		System.out.println(f.exists());

		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
	}
}
