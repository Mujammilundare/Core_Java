
class Demo
{

public  void meth1() 
	{
		System.out.println("null and void");
	}

public int meth2(int i,int j) 
	{
		return i+j;
	}

public String[] meth3() 
	{
        String str[ ]= {"Tom", "Jerry", "Dic"};
        return str;
	}

public void  meth4(String arr1[ ]) 
	{
	       System.out.println(arr1[2]);
	}


public Abc meth5() 
	{
    	Abc ob =new Abc();
		return ob;
	}


public void meth6(Abc obj) 
	{
	   obj.m();
	}


public Abc [ ] meth7() 
	{
	  Abc a1 = new Abc();
  	  Abc a2 = new Abc();
  	  Abc a3 = new Abc();

Abc array[]={a1,a2,a3,null};
    return array;
	}



	public static void main(String args [] ) 
	{
		Demo ob = new  Demo();
		ob.meth1();
	    		
		int c=ob.meth2(10,20); 
		System.out.println(c);

		String arr[ ]=ob.meth3(); 
       System.out.println(arr[0]);

        String arr1[ ]= {"Tom", "Jerry", "Dic"};
           ob.meth4(arr1);

		Abc a=ob.meth5();
		a.m();
				

    	Abc obj =new Abc();
                ob.meth6(obj);


	  Abc array[ ]=ob.meth7(); 
           array[0].m();

	}
}

class Abc
{
	void m()
		{
			System.out.println("hi!");
		}
}
















