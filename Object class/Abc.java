class Abc //extends Object 
{
	public static void main(String[] args) 
	{
		Object ob = new Abc();
		System.out.println("Hello World!"+ob);
		System.out.println(ob.hashCode());
		System.out.println(new Xyz().hashCode());
		System.out.println(new Xyz().hashCode());
	}

	public String toString()
	{
		return "God";
	}

  

}


class Xyz
{
};