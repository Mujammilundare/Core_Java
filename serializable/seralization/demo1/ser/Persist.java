import java.io.*;
class Persist{
 public static void main(String args[])throws Exception{
 
  Student s1 =new Student(108,"Tom");

  FileOutputStream fout=new FileOutputStream("ankit.txt");
  ObjectOutputStream out=new ObjectOutputStream(fout);

  out.writeObject(s1);
  out.flush();

  System.out.println("success");
 }
}