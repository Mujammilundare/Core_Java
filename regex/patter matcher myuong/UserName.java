import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
/*
^                    # Start of the line
  [a-z0-9_-]	     # Match characters and symbols in the list, a-z, 0-9, underscore, hyphen
             {3,15}  # Length at least 3 characters and maximum length of 15 
$                    # End of the line


*/

class  UserName
{
public static void main(String[] args) 
	{
   String username = "^[a-z0-9_-]{3,15}$";
   Pattern pattern = Pattern.compile(username);
   Matcher     matcher = pattern.matcher("1bk");
   System.out.println(matcher);
   System.out.println(matcher.matches());
	}
}


//valid "rajiv34", "rajiv_2002","rajiv-2002" ,"bk3-4_rajiv"

//invalid  "bk","bk@rajiv","rajiv123456789_-