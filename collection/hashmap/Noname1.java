import java.util.*;  
class Simple
	{  
 public static void main(String args[])
	 {  
   
  HashMap hm=new HashMap();  
  
  hm.put(100,"Amit");  
  hm.put(101,"Vijay");  
  hm.put(102,"Rahul");  
  
  Set set=hm.entrySet();  

  Iterator itr=set.iterator();  
  
  while(itr.hasNext()){  
   Map.Entry m=(Map.Entry)itr.next();  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  