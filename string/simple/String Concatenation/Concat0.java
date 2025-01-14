/*There are two ways to concat string objects: 
By + (string concatenation) operator 
By concat() method 
*/
//Example of string concatenation operator

class Concat0
	{
 public static void main(String args[]){
 
   String s="Sachin"+" Tendulkar";
   System.out.println(s);//Sachin Tendulkar
   //String s=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString();



   String s1=50+30+"Sachin"+40+40;
   System.out.println(s1);//80Sachin4040

 }
}

