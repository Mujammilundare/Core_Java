 
//import java.util.*;

enum OperatingSystems
	{
       windows, unix, linux, macintosh
   }

public class EnumExample1 
	{
    public static void main(String args[])
    {
        OperatingSystems  os = OperatingSystems.windows;
    
		switch(os) {
            case windows:
                System.out.println("You chose Windows!");
                break;
            case unix:
                System.out.println("You chose Unix!");
                break;
            case linux:
                System.out.println("You chose Linux!");
                break;
            case macintosh:
                System.out.println("You chose Macintosh!");
                break;
            default:
                System.out.println("I don't know your OS.");
                break;
        }
    }
}


