import java.util.*;


class  VectorCap
{
	public static void main(String[] args) 
	{
 
   Vector v = new Vector();
//ArrayList v=new ArrayList();

System.out.println("size before:"+v.size());     
System.out.println("capacity before"+v.capacity());     

for (int i=0;i<21;i++ )
	  v.add(i);

System.out.println("size after:"+v.size());     
//System.out.println("capacity after"+v.capacity());     

System.out.println("elements are:"+v);     

	}
}
