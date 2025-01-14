 
import java.util.Iterator;
import java.util.ArrayList;
 
public class RemoveElementIterator {
 
  public static void main(String[] args) {
   
    //create an ArrayList object
    ArrayList al = new ArrayList();
   
    //populate ArrayList object
    al.add("1");
    al.add("2");
    al.add("3");
    al.add("4");
    al.add("5");
   
   
    System.out.println("ArrayList before removal : ");
    for(int i=0; i< al.size(); i++)
      System.out.println(al.get(i));
     
    //get an Iterator
    Iterator iter = al.iterator();
   //remove 2 from ArrayList using Iterator's remove method.
    String strElement = "";
    while(iter.hasNext())
		{
      /*
        Iterator's next method returns an Object so we need to cast it into
        appropriate class before using it.
      */
      strElement = (String)iter.next();
     // if(strElement.equals("2"))
      //{
        /*
          Remove an element using remove() method of Iterator
          Remove method removes an element from underlying collection and
          it may throw a UnsupportedOperationException if the remove
          operation is not supported.
        */
        iter.remove();
        //break;
  //    }
     
     
     
    }
   
    System.out.println("ArrayList after removal : ");
    for(int i=0; i< al.size(); i++)
     System.out.println(al.get(i));
 
  }
}
