import java.util.Iterator;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> s=new Stack<String>();

        s.push("a");
        s.push("c");
        s.push("e");
        s.push("d");

        Iterator it=s.iterator();

        System.out.println("Size before pop() :"+s.size());

        while(it.hasNext())
        {
            String iValue=(String)it.next();
            System.out.println("Iterator value :"+iValue);
        }

        // get and remove last element from stack
        String value =(String)s.pop();

        System.out.println("value :"+value);

        System.out.println("Size After pop() :"+s.size());

    }
}
