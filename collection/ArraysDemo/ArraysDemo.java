import java.util.Arrays;

import java.util.Collections;

import java.util.List;

public class ArraysDemo {

public static void main(String[] args) {

String[] a = { "Mango", "Apple", "PineApple", "Grapes" };

List l = Arrays.asList(a);
System.out.println("Unsorted list = "+l);

Collections.sort(l);

System.out.println("Sorted list = "+l);
int i = Arrays.binarySearch(a, "PineApple");

System.out.println("In array PineApple is at the position : " + i);

}
}
