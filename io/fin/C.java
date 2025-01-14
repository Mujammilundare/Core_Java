import java.io.*;

class C
	{
public static void main(String args[]) throws Exception
	{

FileInputStream fin=new FileInputStream("abc.txt");
FileOutputStream fout=new FileOutputStream("jatina.txt");
int i;  
  while((i=fin.read())!=-1)  
//    System.out.println((char)i);  
fout.write(i);  
   

      fout.close(); 
   fin.close(); 


System.out.println("data copied!!");


}
}