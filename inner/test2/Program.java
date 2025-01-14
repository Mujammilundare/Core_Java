class Outer 
	{
			Outer() 
					{
				System.out.println("in Outer Ctr");
					}
	
		class Inner 
			{ 
			Inner(){
					System.out.println("in Inner Ctr");
					}
			void method() 
				{ 
				System.out.println("method called"); 
				}
		   }
}

public class Program  extends Outer.Inner{
    Program() {
        new Outer().super();
    }

    public static void main(String[] args)  { 
        Program p = new Program();
        p.method();
    }
}
