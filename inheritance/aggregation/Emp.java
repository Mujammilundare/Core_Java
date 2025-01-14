//Aggregation represents HAS-A relationship
/*
When use Aggregation?
Code reuse is also best achieved by aggregation when there is no is-a relationship. 
Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects
involved; otherwise, aggregation is the best choice. 
*/



public class Emp
	{
	int id;
	String name;
	Address address;

public Emp(int id, String name,Address address) 
	{
			this.id = id;
			this.name = name;
			this.address=address;
    }

void display()
	{
			System.out.println(id+" "+name);
			System.out.println(address.city+" "+address.state+" "+address.country);
	}

public static void main(String[] args) 
	{
Address address1=new Address("kanpur","UP","india");
Address address2=new Address("nagpur","UP","india");

Emp e=new Emp(11,"tom",address1);
Emp e2=new Emp(12,"jerry",address2);
	
e.display();
e2.display();
	
}
}
