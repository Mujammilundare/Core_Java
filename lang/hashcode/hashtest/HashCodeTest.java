import java.util.*;

class Employee
	{
	private String name;
 
	public Employee(String name) 
		{
		   this.name = name;
	   }
 
	public String toString() 
		{
		return name;
	   }

/*@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}
		Employee emp = (Employee) obj;
		if (this.name == emp.name) {
			return true;
		}
		return false;
	}
 
	@Override
	public int hashCode() {
		return name.hashCode();
	}
*/


}



class EmployeeId 
	{
	private String id;
 
	public EmployeeId(String id) {
		this.id = id;
	}
 
	public String toString() {
		return id;
	}
/*
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj.getClass() != getClass()) {
			return false;
		}
		EmployeeId empId = (EmployeeId) obj;
		if (this.id == empId.id) {
			return true;
		}
		return false;
	}
 
	@Override
	public int hashCode() {
		return id.hashCode();
	}
*/
} 


public class HashCodeTest 
	{
	public static void main(String[] args) 
		{
		Map<EmployeeId, Employee>	employees = new HashMap<EmployeeId, Employee>();
		employees.put(new EmployeeId("111"), new Employee("Johny"));
		employees.put(new EmployeeId("222"), new Employee("Jeny"));	// Line A
		employees.put(new EmployeeId("333"), new Employee("Jessie"));
		Employee emp = employees.get(new EmployeeId("222"));// Line B

		/*
 because the default implementation of equals() in the Object class considers the new EmployeeId("222") in the put statement and new EmployeeId("222") in the get statement as two different instances, and hence the call to get() in Line B returns null.
*/

		System.out.println(emp); // Line C
		}
	}
	
