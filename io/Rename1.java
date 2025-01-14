import java.io.*;

class Rename1  
{  
public static void main(String[] args)  throws IOException
	{

      //System.out.println(args[0]);
   // for (int i = 0;i<args.length;i++ )
		//{
	    File f1 = new File("d:\\divya\\Name.txt");
	    File f2 = new File("d:\\divya\\Rename.txt");

	if(f1.exists())
		{
		System.out.println(f1.getName()+" exists");
		f1.renameTo(f2);
		System.out.println("Renamed file name is "+f2.getName());
		System.out.println(" Now deleting  old file "+f1.getName());
		f1.delete();
		}
	else
			{
              System.out.println(" The file "+f1.getName()+" does not exists");
		      // break;
			}
	
		
 //System.out.println("check");
		//} //end of for loop			       

}
	}


