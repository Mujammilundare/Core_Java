import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo implements Comparator<ComparatorDemo>, Comparable<ComparatorDemo>
		{

  String name;
  int age;

  ComparatorDemo() {
  }

  ComparatorDemo(String n, int a) {
    this.name = n;
    this.age = a;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int compareTo(ComparatorDemo e) {
    return (this.name).compareTo(e.name);
  }

  public int compare(ComparatorDemo cd, ComparatorDemo cd1) {
    return cd.age - cd1.age;
  }

  public static void main(String[] args) {

    List<ComparatorDemo> l = new ArrayList<ComparatorDemo>();

    System.out.println("list sorted by name in increasing order");

    l.add(new ComparatorDemo("Piyush", 5));
    l.add(new ComparatorDemo("Tom", 4));
    l.add(new ComparatorDemo("Titu", 7));
    l.add(new ComparatorDemo("Dom", 9));
    l.add(new ComparatorDemo("Bipul", 25));
    l.add(new ComparatorDemo("Vinay", 26));
    l.add(new ComparatorDemo("Rajesh", 29));
    l.add(new ComparatorDemo("Ankit", 27));

    Collections.sort(l);

    System.out.println("\tName \t Age\n");
    for (ComparatorDemo c : l)
      System.out.println("\t" + c.getName() + "\t  " + c.getAge());
    Collections.sort(l, new ComparatorDemo());
    System.out.println(" ");

    System.out.println("list sorted by age in increasing order");

    System.out.println("\tName \t Age\n");
    for (ComparatorDemo c1 : l)
      System.out.println("\t" + c1.getName() + "\t  " + c1.getAge());

  }

}


