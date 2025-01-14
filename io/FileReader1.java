import java.io.*;

class FileReader1
{
public static void main(String arg[])throws Exception
{
File f = new File("pongal.txt");
FileReader fr = new FileReader(f);

System.out.println(fr.read());

char [] ch2 = new char[(int) (f.length())];
System.out.println(ch2.length);

fr.read(ch2);

for(char ch1: ch2)
	{
		System.out.print(ch1);
	}
}
}
/*
The usage of FileReader and FileWriter is in efficient because

#While writing the data by using FileWriter, program is responsible to insert line separators manually.
# We can read the data character by character only by using FileReader. If increases the number of I/O operations and effect performance.
To overcome these problems sun people has introduced BufferedReader and BufferedWriter 

*/