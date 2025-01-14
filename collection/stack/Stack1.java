import java.util.*;


public class Stack1 {

    public static void main(String[] args) {

   Stack s=new Stack();

       s.push("cow");
        s.push("dog");
        s.push("cat");
        s.push("man");
        s.push("rat");
       

		System.out.println(s);
s.pop();
		System.out.println(  s.peek());
s.pop();
		System.out.println(  s.peek());


    }
}
