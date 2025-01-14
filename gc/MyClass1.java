// sys-gc1.jsl
// System.gc example

public class MyClass1
{
    public static void main(String[] args)
    {
        System.gc();
        System.out.println("Cleanup done!");
    }
}

/*
Output:
Cleanup done!
*/

