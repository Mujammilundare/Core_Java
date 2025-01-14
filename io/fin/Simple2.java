import java.io.*;
class Simple2{
 public static void main(String args[]){
  try{
   FileWriter fw=new FileWriter("abc.txt");
   fw.write("my name is dr. gupta");
   fw.flush();

   fw.close();
  }catch(Exception e){System.out.println(e);}
  System.out.println("success");
 }
}
