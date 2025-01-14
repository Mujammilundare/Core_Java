import java.util.*;
 
public class SortTest
{
	public static void main(String args[])
	{
		new SortTest();
	}
 
	public SortTest()
	{
		//fill some employee objects
		ArrayList list = new ArrayList();
		list.add(new Employee(500,"AA",150000));
		list.add(new Employee(504,"CC",120000));
		list.add(new Employee(503,"DD",100000));
		list.add(new Employee(130,"BB",100000));
 
		System.out.println("Initial List :");
		print(list);
		System.out.println("\n");
 
		Collections.sort(list);
 
		System.out.println("Sorted List :");
		print(list);
		System.out.println("\n");
 
	}
 
	public void print(ArrayList list)
	{
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			Employee emp = (Employee) it.next();
			System.out.println(emp);
		}
	}
}
 
class Employee implements Comparable
{
	public int id;
	public String name;
	public double salary;
 
	public Employee(int id, String name,double salary )
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
 
	public int compareTo(Object object)
	{
		int value=0;
 
		Employee emp = (Employee) object;
 
		if(this.id > emp.id)
			value = 1;
		else if(this.id < emp.id)
			value = -1;
		else if(this.id == emp.id)
			value = 0;
 
		return value;
	}
 
	public String toString()
	{
		return this.id +", "+this.name+", "+this.salary;
	}
}


/*
In Java you can do sorting by implementing 2 interfaces
1) Comparable
2) Comparator

Here we will see sorting example using Comparable Interface. As an example we will be sorting objects of Employee class.

When using comaprable interface make sure the object class
which you are sorting implements comaprable interface and override compareTo method correctly.

As I was more used to Java 1.4, I didnt followed any Java Generics implemetation.

SortTest is main class that will actually creaate an array list and fill it with some random Employee objects.

Employee is class that will implement compareTo method. I have added simple if-else control structure that will decide what to return on the basis of employee id.
less : -1           equal : 0           greater : 1



Limitations:

Objects should be mutally comparable. i.e you can not compare objects of different classes. 
Using comparable binds sorting to one perticular strategy.
e.g. In above example we have sorted using employee id to compare. now if we need to sort on employee name it will be difficult. 

*/