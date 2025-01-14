import java.io.*;

public class InOutErr 
	{ 
public static void main(String args[]) 
	{ 
try { 
BufferedReader reader = new BufferedReader(System.in); 
String filename = reader.readLine(); 

InputStream input = new FileInputStream(filename); 
System.out.println("File opened..."); 

} catch (IOException e){ 
System.err.println("Where is that file?"); 
} 
} 
}
