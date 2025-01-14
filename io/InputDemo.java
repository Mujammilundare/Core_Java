import java.io.*;

class InputDemo 
{
	public static void main(String[] args) //throws IOException
	{

		try
		{
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter ur name");
System.out.println("ur name is  Mr."+br.readLine());

	
		}
		catch (Exception e)
		{
			System.out.println();

		}


}
}

