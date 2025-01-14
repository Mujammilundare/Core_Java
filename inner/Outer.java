class Outer 
{
private static int i=100;

static class Inner
			{
			Inner()
				{
				   System.out.println("Inner"+i);
				}
			}
public static void main(String[] args) 
	{

		Inner in =  new Inner();
	}
}
