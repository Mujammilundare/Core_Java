enum my {
	                      ONE(11),TWO(22),THREE(33) ;
						  
						  int i;  //VAR
						 private my(int ii)  //CTR
							{i=ii;	}
						  
						  void meth() {  } //METH
            };


class EnDemo0 
{
	public static void main(String[] args) 
	{



		for (my m: my.values() )
		{
			System.out.println(m.name());
			System.out.println(m.i);
		}

	}
}
				