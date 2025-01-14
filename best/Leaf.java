//: c04:Leaf.java
// Simple use of the "this" keyword.

public class Leaf 
	{
//static Test monitor = new Test();
int i = 0;
Leaf increment() 
	{
			i++;
		return this;
     }

void print() 
	{
           System.out.println("i = " + i);
     }

public static void main(String[] args) 
	{
Leaf x = new Leaf();

x.increment().increment().increment().print();
//monitor.expect(new String[] {"i = 3"});
}
} ///:~