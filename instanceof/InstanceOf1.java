class A
	{ 
     int i, j; 
      } 

class B 
	{ 
      int i, j; 
     } 

class C extends A 
	{ 
     int k; 
     } 
class D extends A 
	{ 
       int k; 
   } 

class InstanceOf1
	{ 
public static void main(String args[]) 
	{ 
A a = new A(); 
B b = new B(); 
C c = new C(); 
D d = new D(); 

System.out.println(a instanceof A); 

System.out.println(b instanceof B); 

System.out.println(c instanceof C); 


System.out.println(c instanceof A); 


System.out.println(a  instanceof C); 
System.out.println(); 


// compare types of derived types 
A ob; 
ob = d; // A reference to d 


System.out.println(ob instanceof D); 
System.out.println(); 

ob = c; // A reference to c 


System.out.println(ob instanceof D); 

System.out.println(ob instanceof A); 
System.out.println(ob instanceof C); 
System.out.println(); 
// all objects can be cast to Object 

System.out.println(a instanceof Object); 

System.out.println(b instanceof Object); 

System.out.println(c instanceof Object); 

System.out.println(d instanceof Object); 

} 
}
