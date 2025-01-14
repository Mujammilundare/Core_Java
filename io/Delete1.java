import java.io.*;

class Delete1  
{  
	public static void main(String[] args)  throws IOException
	{

    File f1 = new File("d:\\Abc.java");


	if(f1.exists())
		{

        String str=f1.getName();
		System.out.println("xxxxxx");
		if(str.endsWith(".java") )
			{
		 // System.out.println("Name :"+f1.getName());
			System.out.println(" Now deleting  file "+f1.getName());
		    f1.delete();
			}
			else
			{
				System.out.println("extension check karo!");
			}
		}
	else
			{
              System.out.println(" The file "+f1.getName()+" does not exists");
		     }
		
 
		}					       

}
	
