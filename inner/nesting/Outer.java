class Outer 
{
			Outer()
				{
				   System.out.println("Outer");
				}

 class Inner
			{
			Inner()
				{
				   System.out.println("Inner");
				}

						 class InnerMost
								{
									InnerMost()
									{
										   System.out.println("InnerMost");
									}
						Outer.Inner.InnerMost m(){System.out.println("m");return new Outer.Inner.InnerMost(); }

								}


			}

	public static void main(String[] args) 
	{
	
new Outer().new Inner().new InnerMost().m();


	}
}
