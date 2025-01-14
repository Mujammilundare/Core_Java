//How do I split-up string using regular expression?



import java.util.regex.Pattern; 

public class RegexSplitExample 
	{ 
public static void main(String[] args) { 
// 
// Pattern for finding commas, whitespaces (space, tabs, new line, 
// carriage return, form feed). 
// 
String pattern = "[,\\s]"; 
String colours = "Red,White, Blue Green Yellow, Orange"; 
Pattern pat = Pattern.compile(pattern); 
String[] result = pat.split(colours); 
for (String colour : result) 
	{ 
		System.out.println("Colour = \"" + colour + "\""); 
	} 
} 
}
