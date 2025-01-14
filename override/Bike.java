class Vehicle
	{
		//static method cannot be overridden because 
		//static belongs to class area and instance belongs to heap area. 

       void run()
		   {
		   System.out.println("Vehicle is running");
		   }
  }

  class Bike extends Vehicle
	  {
		int  run()
			{
				 System.out.println("Bike is running safely");
				 return 0;
			}

  public static void main(String args[])
	  {
        Bike obj = new Bike();
       obj.run();
      }
}