interface Parent
{
    void bap();
	
}

class  Child  implements Parent
{
   void bap()
	{
	   System.out.println("beta");
    }

	public static void main(String[] args) 
	{
//		Parent p =  new Parent();
//	    Child c =  new Child();

      Parent p =  new Child();
	  p.bap();

	    

	
	}
}
