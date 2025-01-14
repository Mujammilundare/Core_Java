import java.util.*;
import java.util.concurrent.*;

public class NavigableMap2
	{
  public static void main(String[] args) 
	  {
  NavigableMap <Integer, String>nm = new    ConcurrentSkipListMap<Integer, String>();
  nm.put(1, "January");
  nm.put(2, "February");
  nm.put(3, "March");
  nm.put(4, "April");
  nm.put(5, "May");
  nm.put(6, "June");
  nm.put(7, "July");
  nm.put(8, "August");
  nm.put(9, "September");
  nm.put(10, "October");
  nm.put(11, "November");
  nm.put(12, "December");
  //Displaying all data
  System.out.println("Data in the navigable map: " +    nm.descendingMap()+"\n");
  //Retrieving first data
  System.out.print("First data: " + nm.firstEntry()+"\n");
  //Retrieving last data
  System.out.print("Last data: " + nm.lastEntry()+"\n\n");
  //Retrieving the nreatest less than or equal to the given key
  System.out.print("Nearest less than or equal to the given key: "   + nm.floorEntry(5)+"\n");
  //Retrieving the greatest key strictly less than the given key
  System.out.println("Retrieving the greatest key strictly less than    the given key: " + nm.lowerEntry(3));
  //Retrieving a key-value associated with the least key   strictly greater than the given key
  System.out.println("Retriving data from navigable map greter than    the given key: " + nm.higherEntry(5)+"\n");
  //Removing first
  System.out.println("Removing First: " + nm.pollFirstEntry()); 
  //Removing last
  System.out.println("Removing Last: " + nm.pollLastEntry()+"\n");
  //Displaying all data
  System.out.println("Now data: " + nm.descendingMap());
  }
} 