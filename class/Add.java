class Demo
{
	void meth()
	{
		System.out.println("in empty");
	}

	void meth(int i)
	{
		System.out.println("in one parame"+i);
	}

	void meth(double j)
	{
		System.out.println("in one parame"+j);
	}

}


class  Add
{
	public static void main(String[] args) 
	{

      Demo ob1 = new Demo();
ob1.meth();
ob1.meth(10);


	}
}
