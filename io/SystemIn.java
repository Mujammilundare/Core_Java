// sys-in.jsl
// System.in example

public class SystemIn
{
    public static void main(String[] args) throws java.io.IOException
    {
         char c = (char)System.in.read();
         System.out.print("You typed: " + c);
    }
}

