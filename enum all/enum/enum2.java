 class Spec
	{ 
          enum Ports { TCP, DNS, LDAP } // Declaring enum inside the class. 
          Ports p; 
		  int i;
   } 

public class enum2 
	{ 
public static void main( String[] args )
	{ 
    Spec s = new Spec(); 
	System.out.println(s.i);
  ; // Using enum which is inside the class Spec. 
	System.out.println(Spec.Ports.TCP);
		System.out.println(s.p.TCP);
		
     }  
}
