/*
The strictfp keyword ensures that you will get the same result on every platform
if you perform operations in the floating-point variable. 
The precision may differ from platform to platform that is
why java programming language have provided the strictfp keyword,
so that you get same result on every platform
*/

//The strictfp keyword can be applied on  classes ,interfaces and methods,.

class  Strictfp1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

strictfp interface M{}//strictfp applied on interface
strictfp class A{}//strictfp applied on class

class B
	{
    strictfp  void m(){}//strictfp applied on method
   }


//The strictfp keyword can not be applied on abstract methods, variables or constructors.
/*
class C
	{
		strictfp abstract void m();//Illegal combination of modifiers
   }

class D
	{
		strictfp int data=10;//modifier strictfp not allowed here
     }

class E
	{
		strictfp E(){}//modifier strictfp not allowed here
    }

*/