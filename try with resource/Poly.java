
class PolyA
	{ 
	private int f() { return 0; } 
	public int g() { return 3; } 
   } 
class PolyB extends PolyA { 
	private int f() { return 1; } 
	public int g() { return f(); } 
} 
class PolyC extends PolyB { 
	public int f() { return 2; } 
} 


public class Poly 
	{ 
	public static void main(String args[]) 
		{ 
		PolyA ref1 = new PolyC(); 
		PolyB ref2 = (PolyB)ref1; 
		System.out.println(ref2.g()); // This prints 1 
	// If f() is not private in PolyB, then prints 2 
	} 
} 
