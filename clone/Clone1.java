class Clone1  implements Cloneable  
{

   void meth()
	{
	   System.out.println("i love vannila and butter scotch");
	}


	public static void main(String[] args) throws CloneNotSupportedException
	{
		Clone1 c1=new Clone1();
		Clone1 c2=(Clone1)c1.clone();
		System.out.println(c1);
		System.out.println(c2);
		c1.meth();
		c2.meth();
		
 }
}
