import java.util.Arrays; 
  
public class ComparableExample 
	{ 
  
    public static void main(String[] args) 
		{ 
  
        MyCompare[] MyCompare = new MyCompare[4]; 
  
        MyCompare[0] = new MyCompare(); 
        MyCompare[0].setName("Amita"); 
        MyCompare[0].setId(1); 
        MyCompare[0].setTotalSalary(11500.57); 
  
        MyCompare[1] = new MyCompare(); 
        MyCompare[1].setName("Bablu"); 
        MyCompare[1].setId(4); 
        MyCompare[1].setTotalSalary(11500.25); 
  
        MyCompare[2] = new MyCompare(); 
        MyCompare[2].setName("Charmi"); 
        MyCompare[2].setId(3); 
        MyCompare[2].setTotalSalary(97342.543); 
  
        MyCompare[3] = new MyCompare(); 
        MyCompare[3].setName("Dhaval"); 
        MyCompare[3].setId(2); 
        MyCompare[3].setTotalSalary(9500.450); 
  
        System.out.println("Before Sorting through Comparable"); 
        for (int i = 0; i < MyCompare.length; i++) { 
            System.out.println("S.No:"+(i + 1)+"   "
                    + MyCompare[i].getName()+" Total Salary: "
                    + MyCompare[i].getTotalSalary()); 
        } 
  
        Arrays.sort(MyCompare); 
  
        System.out.println("After Sorting by Comparable"); 
  
        for (int i = 0; i < MyCompare.length; i++) { 
            System.out.println("S.No:" + (i + 1) + "   "
                    + MyCompare[i].getName() + " Total Salary: "
                    + MyCompare[i].getTotalSalary()); 
        } 
    } 
}