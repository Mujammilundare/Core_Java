class Base 
	{
        void m(int a, float b) 
			{ System.out.println("display");}
}

class Sub extends Base 
	{
//@ Override
void m(float a, int b)
		{System.out.println("dont display"); }

	public static void main(String[] args) 
	{
         Sub s = new Sub();
                  s.m(5.0f,2);
	}
}
