class MyClass implements Runnable {
void run(String str) {
System.out.println(str);
}
}
class TestQuestion {
public static void main(String s[]) 
	{
MyClass obj = new MyClass();
Thread t = new Thread(obj); 
	}
	}