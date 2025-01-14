// sys-getProp2.jsl
// System.getProperty example

public class Prop2
{
    public static void main(String[] args)
    {
         String s1  = System.getProperty("os.name","My default");
         // Notice that the property key is misspelled here:
         String s2  = System.getProperty("os-name","My default");

         // Notice that the output of the following statement can be
         // different for different operating systems:         
         System.out.println("The OS name is: " + s1);

         // The following statement displays the default property name:
         System.out.println("The OS name is: " + s2);
    }
}

/*
Output:
The OS name is: Windows XP
The OS name is: My default
*/

