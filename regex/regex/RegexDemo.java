import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
  
public class RegexDemo 
	{ 
    public static void main(String[] args) { 
        /* 
         * To create a Pattern instance we must call the static method  
         * called compile() in the Pattern class. Pattern object is  
         * the compiled representation of a regular expression. 
         */ 
        Pattern pattern = Pattern.compile("lazy"); 
  
        /* 
         * The Matcher class also doesn't have the public constructor  
         * so to create a matcher class the Patter's class matcher()  
         * method. The Matcher object it self is the engine that match  
         * the input string against the provided pattern. 
         */
        Matcher matcher = pattern.matcher(" The lazy dog and the lazy cat lazy Lazy"); 
  
        while (matcher.find()) 
			{ 
       System.out.println(matcher.group()); 

        } 
    } 
}