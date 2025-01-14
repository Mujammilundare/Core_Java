import java.util.Arrays;
import java.io.Console;
//JDK 1.6, the java.io.Console class.

public final class ConsoleDemo
	{
  public static final void main(String[] args)
	  {
	Console console = System.console();
    String username = console.readLine();
	System.out.println(username);

 //   console.printf("Welcome, %1$s", username);
	  }
} 

