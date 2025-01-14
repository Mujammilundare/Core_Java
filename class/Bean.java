class  Bean
{
	int height;

	void setHeight(int ht)  //mutator
	{
	     height=ht;
	}
    
   int  getHeight()  //accessor
	{
         return height;
	}

	public static void main(String[] args) 
	{
		    Bean b =new Bean();
			b.setHeight(110);
    		System.out.println(b.getHeight());
	}
}
