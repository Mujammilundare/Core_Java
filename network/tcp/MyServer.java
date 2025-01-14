import java.io.*;
import java.net.*;

public class MyServer 
	{
public static void main(String[] args) throws Exception
	{

ServerSocket ss=new ServerSocket(6666);

System.out.println("before");
Socket s=ss.accept();//establishes connection 
System.out.println("after");

BufferedReader in=new BufferedReader(new InputStreamReader (s.getInputStream()));
String	str=in.readLine();
System.out.println("message= "+str);


ss.close();
}
}
