
import java.io.*;
import java.net.*;

public class MyClient 
	{
public static void main(String[] args) 
	{
try{	
Socket s=new Socket("localhost",6666);

PrintWriter out=new PrintWriter(s.getOutputStream());
out.println("God is great!!");
out.flush();
s.close();

}catch(Exception e){System.out.println(e);}
}
}
