
class DeprecatedClass 
	{

@Deprecated 
	  public void doSomething() 
	  {
         // Really... do something...
      }

  public void doSomethingElse() 
	  {
       // Do something else (and presumably better)
     }
}

           

public class DeprecatedTester extends DeprecatedClass 
	{

  public void doSomething() 
	  {
    // Overrides a deprecated method
     }
}
      