/******** Garbage collection *********/
class Test
{
Test t;
static int i=1;

protected void finalize()
{
System.out.println("Garbage collected from object" + i);
i++;
}

public static void main(String args[])
	{
Test t1=new Test();
Test t2=new Test();
Test t3=new Test();

//No Object Is Eligible for GC

t1.t=t2; //No Object Is Eligible for GC
t2.t=t3; //No Object Is Eligible for GC
t3.t=t1; //No Object Is Eligible for GC

t1=null;
//No Object Is Eligible for GC (Coz t2 still have a reference)

t2=null;
//No Object Is Eligible for GC (Coz t3 still hava a reference)

t3=null;
//All the 3 Object Is Eligible for GC (None of them have a reference)

System.gc();
//System.runFinalizersOnExit(true);
}

}

