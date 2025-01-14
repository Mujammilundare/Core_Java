enum Beer
{
	KF(100),KO(85),RC(90),FO;	

	int price;
	
	Beer()
	{
		this.price = 70;
	}
	Beer(int price)
	{
		this.price = price;
	}
	
	public int getPrice()
	{
		return price;
	}
}
class Test3
{
	public static void main(String[] args) 
	{
	Beer[] b = Beer.values();
	for(Beer b1 : b)
		{
	System.out.println(b1 + " ....... " +b1.getPrice());
	}}}