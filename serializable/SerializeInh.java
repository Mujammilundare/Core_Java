import java.io.*;

class Animal implements Serializable
{
int i = 10;
}

class Dog extends Animal
{
int j = 20;
}

class SerializeInh
{
public static void main(String arg[])throws Exception
{
Dog d = new Dog();
FileOutputStream fos = new FileOutputStream("abc.ser");
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(d);

FileInputStream fis = new FileInputStream("abc.ser");
ObjectInputStream ois = new ObjectInputStream(fis);
Dog d1 = (Dog)ois.readObject();
System.out.println(d1.i);
System.out.println(d1.j);
}
}
