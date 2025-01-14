import java.util.StringTokenizer; 
class STDemo
	{ 
static String in = "title=Java-Samples;" + 
								"author=Guptaji;" + 
								"publisher= java-samples.com;" + 
								"copyright=2007;"; 

public static void main(String args[]) 
	{ 
StringTokenizer st = new StringTokenizer(in); 

while(st.hasMoreTokens()) 
	{ 
			String key = st.nextToken(); 
//			String val = st.nextToken(); 
			System.out.println(key); 
	} 
} 
}


/*
StringTokenizer(String str) 
StringTokenizer(String str, String delimiters) 
StringTokenizer(String str, String delimiters, boolean delimAsToken)
 
In all versions, str is the string that will be tokenized.
In the first version, the default delimiters are used.
In the second and third versions, delimiters is a string that specifies the delimiters. 
In the third version, if delimAsToken is true, then the delimiters are also returned as tokens when the string is parsed. Otherwise, the delimiters are not returned. 


Delimiters are not returned as tokens by the first two forms. Once you have created a StringTokenizer object, the nextToken( ) method is used to extract consecutive tokens.
The hasMoreTokens( ) method returns true while there are more tokens to be extracted. 

Since StringTokenizer implements Enumeration, the hasMoreElements( ) and nextElement( ) methods are also implemented, and they act the same as hasMoreTokens( ) and nextToken( ), respectively.

Here is an example that creates a StringTokenizer to parse "key=value" pairs. Consecutive sets of "key=value" pairs are separated by a semicolon.



*/