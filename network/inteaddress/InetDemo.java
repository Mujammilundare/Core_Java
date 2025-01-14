import java.io.*;
import java.net.*;

public class InetDemo{
public static void main(String[] args) throws Exception
			{
		InetAddress ip=InetAddress.getByName("localhost");

		System.out.println(ip);
		System.out.println("Host Name: "+ip.getHostName());
		System.out.println("IP Address: "+ip.getHostAddress());

		}
}