import java.io.*;

class Buffred
{
public static void main(String arg[])throws Exception
{
FileReader fr = new FileReader("abc.txt");
BufferedReader br = new BufferedReader(fr);
String s = br.readLine();
while(s != null)
{
System.out.println(s);
s = br.readLine();
}
br.close();
}
}
//Note:- When ever we r closing BufferedReader ,
//automatically underlying FileReader object will be closed.
