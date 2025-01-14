public class Program 
	{
  private int count;
    public Program(int ballcount)
		{
            count=ballcount;
       }

  public static void main(String argv[]){
    Program s = new Program(99);
    //System.out.println(count); //compile time error
    //add(10);  //compile time error
    System.out.println(s.count);
    s.add(10);
    System.out.println(s.count);
  }

  private void add(int num) 
	  {
    count += num;
  }
}
