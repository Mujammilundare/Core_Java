package pack1;
public class Student 
{
    
	private int roll_no;
	private String name;

	public Student ()
	{
	  roll_no=0;
	  name="unknown";
	}

    public Student (int rn,String nme)
	{
	   roll_no=rn;
	   name=nme;
	}

	public void displayStudent ()
	{
      System.out.println("\n roll_no="+roll_no+"\n Name"+name); 
    }
   /* 
	public static void main(String[] args) 
	{
		Student s1=new Student ();
		s1.displayStudent ();
		Student  s2=new Student (23,"Qudsia");
	    s2.displayStudent();
		//System.out.println("Hello World!");
	}
	*/
}

	
