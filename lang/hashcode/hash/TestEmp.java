public class TestEmp
{
public static void main(String[] args) 
{
//Emp emp1 = new Emp(23);
//System.out.println("emp1.hashCode()--->>>"+emp1.hashCode());

//int originalHashCode = System.identityHashCode(emp1);
//System.out.println("Original hashCode of Emp---->>>"+originalHashCode);

Emp emp1 = new Emp(23);
Emp emp2 = new Emp(23);
System.out.println("emp1.equals(emp2)--->>>"+emp1.equals(emp2));





}
}