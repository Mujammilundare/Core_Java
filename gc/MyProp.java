// sys-getProp1.jsl
// System.getProperty example
//Returns the system property associated with a specified key. 


public class MyProp
{
    public static void main(String[] args)
    {
         String s  = System.getProperty("os.version");

         // Notice that the output of the following statement can be
         // different for different machines:         
         System.out.print("The OS version for this machine is: " + s);
    }
}

/*
Output:
The OS version for this machine is: 5.1
*/

