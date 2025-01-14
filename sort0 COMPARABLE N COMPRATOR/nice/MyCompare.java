public class MyCompare implements Comparable<MyCompare> 
	{ 
private String name; 
private int id; 
private double totalSalary; 
public int compareTo(MyCompare ob) { 
return this.id - ob.id ; 
} 
public String getName() { 
return name; 
} 
public void setName(String name) { 
this.name = name; 
} 
public double getTotalSalary() { 
return totalSalary; 
} 
public void setTotalSalary(double totalSalary) { 
this.totalSalary = totalSalary; 
} 
public int getId() { 
return id; 
} 
public void setId(int id) { 
this.id = id; 
} 
}
