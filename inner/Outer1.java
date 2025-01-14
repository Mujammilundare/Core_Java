class Outer1
{
 class Inner 
				{
				Inner()
					{
					System.out.println("Inner");
     				}
			    }

	public static void main(String[] args) 
	{
  
  Outer1 o =  new Outer1();
  Inner in =  o.new Inner();     

  new Outer1().new Inner();     

Outer1.Inner inn =   new Outer1().new Inner();   
  
     }

}
