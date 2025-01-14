interface Inter{}
class Xyz{}
class Abc implements Inter	{}
class Sad{}

public class Test
		{
public static void main(String[] args) 
	{
Abc a = new Abc();
Xyz  x = new Xyz();
Sad s = new Sad();

System.out.println( a instanceof Object);
System.out.println( a instanceof Inter);
System.out.println( x instanceof Xyz);
System.out.println( x instanceof Inter);
//System.out.println(b instanceof Object);
//System.out.println(s instanceof Object[]); 
//byte[] can not cast to Object[]
//System.out.println(b instanceof byte); 
//byte is primitive type

}

}

