/*
Java Comparable example.
This Java Comparable example describes how java.util.Comparable
interface is implemented to compare user defined classe's objects.
*/
 
import java.util.*;
 
/*
Comparable interface is used to make user defined class's objects comparable.
This interface declares one method compareTo(Object object)
and determines how objects can be compared to with each other.
*/
 
/*
Implement java.util.Comparable interface to make class objects comparable.
*/
 
class Employee implements Comparable{
    
    private int age;
    
    public void setAge(int age){    
        this.age=age;
    }
    
    public int getAge(){    
        return this.age;    
    }
    
    /*
    
    Signature of compareTo method is,    
    public int compareTo(Object object).
    
    compareTo method should return 0 if both objects are equal,
    1 if first grater than other and -1 if first less than the
    other object of the same class.
    
    */
    
    public int compareTo(Object otherEmployee){
    
        /*
        If passed object is of type other than Employee, throw ClassCastException.
        */
       
        if(!(otherEmployee instanceof Employee)){
            throw new ClassCastException("Invalid object");
        }
       
        int age = ((Employee) otherEmployee).getAge();
       
        if(this.getAge() > age)    
            return 1;
        else if ( this.getAge() < age )
            return -1;
        else
            return 0;
    
    }
 
}
 
public class JavaComparableExample{
    
    public static void main(String args[]){
       
        /*
        Create two different Employee objects, so that we can compare them.
        */
       
        Employee one = new Employee();        
        one.setAge(40);
       
        Employee two = new Employee();        
        one.setAge(30);
       
        /*
        Use compareTo method to determine which employee is younger
        */
       
        if(one.compareTo(two) > 0) {        
            System.out.println("Employee one is elder than employee two!");
       
        } else if(one.compareTo(two) < 0) {        
            System.out.println("Employee one is younger than employee two!");        
       
        } else if(one.compareTo(two) == 0) {        
            System.out.println("Both employees are same!");        
        }
    
    }
 
}
 
/*
OUTPUT of the above given Java Comparable Example would be:
Employee one is elder than employee two!
*/