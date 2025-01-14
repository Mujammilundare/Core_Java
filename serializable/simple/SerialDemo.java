import java.io.*;  


class Dog implements Serializable
{
	transient  int height=2;
	 String name="Sheru";
}


class  SerialDemo
{

	public static void main(String[] args)  throws Exception
	{


Dog dog= new Dog();

FileOutputStream fout=new FileOutputStream("kumar.txt");  
ObjectOutputStream out=new ObjectOutputStream(fout);  
out.writeObject(dog);  
out.flush();  
System.out.println("successfully serialized..");  

ObjectInputStream in=new ObjectInputStream(new FileInputStream("kumar.txt"));  
 Dog d=(Dog)in.readObject();  
 System.out.println(d.height+" "+d.name);  
  in.close();  


		
	}
}
