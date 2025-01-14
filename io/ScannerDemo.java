import java.util.*;

class ScannerDemo 
{
	public static void main(String[] args) 
	{

Scanner sc =new Scanner(System.in);
System.out.print("enter ur name: ");
String s=sc.next();
System.out.println("Hello!"+s);


int a=sc.nextInt();
int b=sc.nextInt();
int sum=a+b;
System.out.println("The total is "+sum);


	}
}


//System.out.println(sc.nextInt()+sc.nextInt());
