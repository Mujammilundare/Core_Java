package pack2;
public class Batch
{
	private int roll_no;
	private String name;

	public Batch()
	{
	  roll_no=0;
	  name="unknown";
	}

    public Batch(int rn,String nme)
	{
	   roll_no = rn;
	   name = nme;
	}

  public void displayBatch()
	{
      System.out.println("\nroll_no="+roll_no+"\nName"+name); 
    }
   /* 
	public static void main(String[] args) 
	{
		Batch b1=new Batch();
		b1.displayBatch();
		Batch b2=new Batch(23,"Qudsia");
	    b2.displayBatch();
		//System.out.println("Hello World!");
	}
	*/
}
