import java.io.*;

//JDK 6 or early version gives error try without catch
//In JDK7, finally is no longer required. The file will be closed automatically after try block.


public class Example2 
	{
	public static void main(String[] args) 
		{
		try (BufferedReader br = new BufferedReader(new FileReader("a.txt")) )
		{
 			String line;
 			while ((line = br.readLine()) != null) 
				{
				 System.out.println(line);
			    }
 
		} catch (IOException e) 
			{
			e.printStackTrace();
		    } 
 
	}
}