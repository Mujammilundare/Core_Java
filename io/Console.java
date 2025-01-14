import java.util.Arrays;
import java.io.Console;

public final class Console 
	{
  public static final void main(String[] args)
	  {
	Console console = System.console();
    String username = console.readLine("User Name? ");
    console.printf("Welcome, %1$s.", username);
	  }
} 

