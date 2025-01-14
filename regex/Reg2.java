import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2 
	{
  public static void main(String args[]) throws Exception 
	  {
  String text ="This is the text to be searched " +   "for occurrences of the http:// pattern.";

String pattern = ".*http://.*";

boolean matches = Pattern.matches(pattern, text);

System.out.println("matches = " + matches);
 

  
  }
}