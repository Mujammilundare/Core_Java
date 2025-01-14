//Example of substring() method
/*
startIndex:starts from index 0(inclusive). 
endIndex:starts from index 1(exclusive). 

public String substring(int startIndex):  
public String substring(int startIndex,int endIndex): 

*/
class SubString{
 public static void main(String args[]){
 
   String s="Sachin Tendulkar";
   System.out.println(s.substring(6));//Tendulkar
   System.out.println(s.substring(0,6));//Sachin
 }
}

