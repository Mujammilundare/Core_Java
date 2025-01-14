public class Emp 
	{

	Address ob;

void display(Address ob)
	{
		System.out.println(ob.city+" "+ob.state+" "+ob.country);
    }

public static void main(String[] args)
	{
Emp e=new Emp();
Address ob1=new Address("patna","Bihar","india");
e.display(ob1);
	
}
}
