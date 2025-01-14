// sys-runF2.jsl
// System.runFinalizersOnExit example
//Runs the garbage collection when the application exits. 


public class MyClass
{
    public static void main(String[] args)
    {
        System.runFinalizersOnExit(false);
        System.out.println("Cleanup done!");
    }
}

/*
Output:
Cleanup done!
*/

