package generics;

import java.util.*;

public class ArrayListTest 
{
	public static void main(String[] args) 
	{
		//List listObj = new ArrayList();
		List<String> listObj = new ArrayList<String>();
		
		listObj.add("Java");
		listObj.add(".NET");
		listObj.add("C++");
		//listObj.add(new Integer(20));

		listObj.add("C");
		listObj.add("Java");
		System.out.println("Size of Array List : " +listObj.size());
		
		System.out.println("Element of Array List Before Sorting : " +listObj );

		Collections.sort(listObj);

		System.out.println("Element of Array List After Sorting : " +listObj );
		
	} 
}