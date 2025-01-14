/*
AbstractSequentialList class is an abstract class and it extends the class AbstractList. 
This class reduces the effort needed to implement List interface returned by a 'sequential access' data store

*/


import java.util.AbstractSequentialList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class AbstractSequentialListDemo extends AbstractSequentialList 
	{

List list;
AbstractSequentialListDemo(){
list=new LinkedList();
}

public void add(int i)
	{
list.add(i);
System.out.println(list);
}

public ListIterator listIterator(int i) 
	{
ListIterator li=list.listIterator();
while(li.hasNext()){
System.out.println(li.next());
}

return null;
}

public int size() 
	{
System.out.println(list.size());
return 0;

}

public static void main(String... args){

AbstractSequentialListDemo asl=new AbstractSequentialListDemo();
System.out.println("List = ");
for(int i=5; i>=0; i--)
asl.add(i);
System.out.println("Size of list =");
asl.size();
System.out.println("Displaying list using listIterator");
asl.listIterator();
}

}
