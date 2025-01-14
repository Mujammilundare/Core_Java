import java.util.*;

class Person implements Comparable{
    int age;

    public void setAge(int age){    
        this.age=age;
    }
    public int getAge(){    
        return this.age;    
    }

    public int compareTo(Object ob){
        if(!(ob instanceof Person)){
            throw new ClassCastException("Invalid object");
        }

        int age = ((Person) ob).getAge();

        if(this.getAge() > age)    
            return 1;
        else if ( this.getAge() < age )
            return -1;
        else
            return 0;

    }
 }
 public class ComparableExample{

    public static void main(String args[]){

        Person one = new Person();        
        one.setAge(35);

        Person two = new Person();        
        one.setAge(30);

        if(one.compareTo(two) > 0) {        
            System.out.println("Person one is elder than Person two!");

        } else if(one.compareTo(two) < 0) {        
            System.out.println("Person one is younger than Person two!");        

        } else if(one.compareTo(two) == 0) {        
            System.out.println("Both Persons are same!");        
        }
     }
 }
