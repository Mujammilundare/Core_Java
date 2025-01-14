
import java.io.*;

public class Example1 
	{
 
	public static void main(String[] args) 
		{
 		BufferedReader br = null;
 		try {
				String line;
			//	br = new BufferedReader(new FileReader("a.txt"));
				
				while ((line = br.readLine()) != null) 
					{
						System.out.println(line);
					}
 
		    } 
			catch (IOException e) 
				{
				e.printStackTrace();
				}
		finally
			{
					try 
						{
						br=null;
							if (br != null)
								br.close();
					   } catch (IOException ex)
						{
						ex.printStackTrace();
						}
					}
 
        	}
}