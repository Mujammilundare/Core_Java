import java.io.*;

class Dog implements Serializable
{
 int i= 10;
 int j= 20;
}



class SerializeDemo
{
public static void main(String arg[]) throws Exception
{
Dog d = new Dog();


FileOutputStream fos = new FileOutputStream("abc.ser");
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(d);
System.out.println("object written to file..");

FileInputStream fis = new FileInputStream("abc.ser");
ObjectInputStream ois = new ObjectInputStream(fis);
Dog d1 = (Dog)ois.readObject();
System.out.println(d1.i);
System.out.println(d1.j);
}
}

