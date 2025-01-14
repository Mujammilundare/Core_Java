enum my {ONE,TWO,THREE};


class my
{
public static final my  ONE=new my();
public static final my TWO=new my();
public static final  my THREE=new my();
}



class EnDemo 
{
 
	public static void main(String[] args) 
	{

//my ob = my.ONE;
System.out.println(my.ONE);
	//	System.out.println(my.ONE);

	//	my ob =  my.ONE;
	//	System.out.println(ob);


 // for (my m: my.values())
 //     System.out.println(m);

//System.out.println();
	}


	 //Java compiler automatically generates static values() method for every enum in java.
   //values() method returns array of enum constants in the same order.
}
 

 