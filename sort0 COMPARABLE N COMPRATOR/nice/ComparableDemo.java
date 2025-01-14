import java.util.*;

 class Employee implements Comparable {

    int EmpID;
    String Ename;
    double Sal;
    static int i;

    public Employee() {
        EmpID = i++;
        Ename = "dont know";
        Sal = 0.0;
    }

    public Employee(String ename, double sal) {
        EmpID = i++;
        Ename = ename;
        Sal = sal;
    }

    public String toString() {
        return "EmpID " + EmpID + "\n" + "Ename " + Ename + "\n" + "Sal" + Sal;
    }

    public int compareTo(Object o1) {
        if (this.Sal == ((Employee) o1).Sal)
            return 0;
        else if ((this.Sal) > ((Employee) o1).Sal)
            return 1;
        else
            return -1;
    }
}  




public class ComparableDemo{

    public static void main(String[] args) {

        List ts1 = new ArrayList();
        ts1.add(new Employee ("Tom",40000.00));
        ts1.add(new Employee ("Harry",20000.00));
        ts1.add(new Employee ("Maggie",50000.00));
        ts1.add(new Employee ("Chris",70000.00));
        Collections.sort(ts1);
        Iterator itr = ts1.iterator();

        while(itr.hasNext()){
            Object element = itr.next();
            System.out.println(element + "\n");
            
        }

    }
}  
