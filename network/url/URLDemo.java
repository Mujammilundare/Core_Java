import java.io.*;
import java.net.*;

public class URLDemo{
public static void main(String[] args)throws MalformedURLException
	{

URL url=new URL("http://www.website.com:8080/rajiv/index.jsp");

System.out.println("Protocol: "+url.getProtocol());
System.out.println("Host Name: "+url.getHost());
System.out.println("Port Number: "+url.getPort());
System.out.println("File Name: "+url.getFile());

}
}