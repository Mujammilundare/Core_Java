
import java.io.*;

class FileWriter1
{
public static void main(String arg[])throws Exception
{

File f = new File("pongal.txt");
System.out.println(f.exists());

//Instead of overriding if u have to perform append then we 
//have to use the following constructors.


FileWriter fw = new FileWriter(f,true);

System.out.println(f.exists());

fw.write(97);
fw.write("run\nsoftware\n");
char [] ch1 = {'a','b','c'};
fw.write(ch1);

fw.flush();
fw.close();

}
}

