class Child extends Parent
{
	@Override
	public int calc(int a, int b)
	{
		return (a+1)*b;
	}
	public static void main(String[] args) 
	{
      Child c =  new Child();
	   System.out.println(c.calc(2,3));

	}
}
