import java.io.*;

class DePersist
	{
 public static void main(String args[])throws Exception{
  
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("outputfile.txt"));
  Student s=(Student)in.readObject();
  System.out.println(s.id+" "+s.name);

  in.close();
 }
}