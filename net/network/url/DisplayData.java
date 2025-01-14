import java.io.*;
import java.net.*;

public class DisplayData {
public static void main(String[] args){
try{

URL url=new URL("http://localhost:8080/");

URLConnection con=url.openConnection();
InputStream stream=con.getInputStream();



int i;
while((i=stream.read())!=-1)
	{
System.out.print((char)i);
}


}catch(Exception e){System.out.println(e);}
}
}