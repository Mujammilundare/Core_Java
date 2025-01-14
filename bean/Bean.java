class Bean 
{

	private int height;
   void setHeight(int h)
	{
        height=h;
	}

   int getHeight()
   {
	return height;
   }

	public static void main(String[] args) 
	{
		Bean b = new Bean();
		b.setHeight(5);
		System.out.println(b.getHeight());
	}
}
