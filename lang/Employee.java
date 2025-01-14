
class Employee extends Object
{
	void meth()
	{
		System.out.println("in meth..");
	}
	public static void main(String[] args) 
	{
              Object ob=new Employee();
			  ob.meth();
			  Employee e=(Employee)ob;
			  e.meth();

	}
}
