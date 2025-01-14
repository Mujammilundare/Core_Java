class Parent 
	{   
     public void pa() 
	  {
        System.out.println("parent...");
      }
	}

class Child extends Parent 
	{
  public void ch() 
	  {
        System.out.println("child...");
      }

	public static void main(String[] args) 
		{
      //Child c = new Child();
	//  c.ch();
      // Child type reference can be assigned to Parent type without casting      
      Parent p = new Child();  //upcasting
//	  p.pa();
//	  p.ch();
     // Parent type reference has to be casted before assigned to Child type
    //Child c =(Child) new Parent();  // downcasting    // c.ch();
	 //c.pa();
	( (Parent)p).pa();
//	( (Parent)p).ch();
	 // ((Child)p).print(); // method only defined in Child type
       
	   }
}
