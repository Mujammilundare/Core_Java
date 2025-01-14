import pack1.Student;
import pack2.Batch;

public class TestStu 
{
	public static void main(String[] args) 
	{
		Batch b1=new Batch();
		b1.displayBatch();
		Batch b2=new Batch(23,"Qudsia");
	    b2.displayBatch();
		Student s1=new Student ();
		s1.displayStudent ();
		Student  s2=new Student (23,"Qudsia");
	    s2.displayStudent();

	}
}
 