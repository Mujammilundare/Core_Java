import java.io.*;

class Dog implements Serializable
{
     Cat c = new Cat();
}

class Cat implements Serializable
{
     Rat r = new Rat();
}

class Rat implements Serializable
{
int j= 20;
}

class SerializeTree
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
System.out.println(d1.c.r.j);
}
}
