import java.util.Stack;

public class StackDemo
{
        public static void main(String args[])
        {
                Stack lifo = new Stack();

				for (int i = 1; i <= 10; i++)
                {
                      lifo.push ( new Integer(i) );
                }

                // Last in first out means reverse order
                while ( !lifo.empty() )
                {
                        System.out.print ( lifo.pop() );
                        System.out.print ( ',' );
                }

                // Empty, let's lift off!
                System.out.println (" LIFT-OFF!");
        }
}

