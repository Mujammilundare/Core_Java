import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class City implements Comparable<City>
	{
   String name;
        
   public City(String name) {
    this.name = name;
   }

   public String getName() {
    return name;
   }

   public void setName(String name) {
    this.name = name;
   }
    
   @Override
   public int compareTo(City c) {
    return this.getName().compareTo(c.getName());
   }
}

/**
 * List sort using Comparable interface example
 */

public class ListSortComparableExample 
	{
  public static void main(String[] args) 
	  {
         //You can use here any List implementation
         //ArrayList, Vector, LinkedList
     List<City> cities = new ArrayList<City>();
     
     cities.add(new City("New York"));
     cities.add(new City("London"));
     cities.add(new City("Paris"));
            
    System.out.println("Ascending name:");
    Collections.sort(cities);
	for (City i : cities) 
		{
            System.out.println(i.getName());
        }
   }
}

