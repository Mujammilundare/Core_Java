/*

@MySingleValueType(value=”xyz”) OR the short form
@MySingleValueType(”xyz”)
*
* Date: 03/22/2009
*/
public @interface MySingleValueType 
	{
         String value() default "abc";
     }