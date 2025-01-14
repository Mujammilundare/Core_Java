class Demo
{
	void add(int i, int j)
	{
		System.out.println("sum"+(i+j));
	}

  void  add(float i, float j)
	{
		System.out.println("sum"+(i+j));
	}
}

class Overload2 
{
	public static void main(String[] args) 
	{
         Demo d =new Demo();
		 d.add(10,20);
		 d.add(10.2f,3.3f);
	}
}
