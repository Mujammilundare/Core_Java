import java.util.*;

public class Stack1
	{
  public static void main(String[] args) {
  
  Stack s=new Stack();
  s.push(new Integer(10));
  s.push("a");
  System.out.println("The contents of Stack is" + s);
  System.out.println("The size of an Stack is" + s.size());
  System.out.println("The number poped out is" + s.pop());
  System.out.println("The number poped out is " + s.pop());
  //System.out.println("The number poped out is" + s.pop());
  System.out.println("The contents of s is" + s);
  System.out.println("The size of an s is" + s.size());
  }
} 