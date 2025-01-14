public class Precedence2 
	{ 
  final public static void main(String args[]) 
	  { 
	int array[] = new int[5]; 
	int index = 0; 
	array[index] = index = 3; 
	for (int c = 0; c < array.length; c++) 
	
	System.out.println(array[c]);	
	System.out.println("index is " + index); 
	  }
} 
