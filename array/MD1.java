public class MD1
	{ 
public static void main(String args[])
	{ 
int arr[][] = { { 2, 1, 3 },
	                         { 1, 3, 2 },
	                         { 3, 2, 1 }
                           }; 

for (int row = 0; row < arr.length; row++) 
	{ 
			for (int col = 0; col < arr[row].length; col++) 
				{ 
					System.out.print(arr[row][col]); 
				} 
       System.out.println(); 
     }  
} 

	}