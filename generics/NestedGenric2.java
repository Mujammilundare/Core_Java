/*A generic type is itself a type and can be used as a type variable.
For example, if you want your List to store lists of strings:
List<List<String>> myListOfListsOfStrings; 
To retrieve the first string from the first list in myList, you would use:
String s = myListOfListsOfStrings.get(0).get(0); 
*/


import java.util.ArrayList;
import java.util.List;

public class NestedGenric2
	{
  public static void main(String[] args) 
	  {
    List<String> list1 = new ArrayList<String>();
    list1.add("cow");
    list1.add("buffalow");
    list1.add("sheep");

   List<List<String>> list2 = new ArrayList <List<String>>();
    list2.add(list1);
	
	
   List <List<List<String>>>  list3 = new ArrayList < List<List<String>>>();
	list3.add(list2);

    String s = list3.get(0).get(0).get(0);    
	System.out.println(s);

    String s1 = list3.get(0).get(0).get(1);    
	System.out.println(s1);

  }
}