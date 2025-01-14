class Parent 
	{   
	}

class Child extends Parent 
	{
  public void print() 
	  {
        System.out.println("log");
      }
}
class Program 
	{
    public static void main(String[] args) {
      Child c = new Child();
//	  Parent p =new Parent();

      // Child type reference can be assigned to Parent type without casting      
   Parent p = c; 
     // Parent type reference has to be casted before assigned to Child type
//    c = (Child)p;
//Child c1=(Child)p;
	  
	  ((Child)p).print(); // method only defined in Child type
    }
}
