interface Inter
{
	void meth1();
	void meth2();
	void meth3();
	void meth4();

}

class Adapter implements Inter
{
	public void meth1(){}
	public void meth2(){}
	public void meth3(){}
	public 	void meth4(){}

}

class  User extends Adapter
{
	public void meth4()
		{
		   System.out.println("Wow! meth4");
		}


	public static void main(String[] args) 
	{
       User u =  new User();
	   u.meth4();
	}
}
