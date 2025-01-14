public class EnumMethods
	{

public enum Laptops
	{
	SONY(1), HP(2), DELL(3), TOSHIBA(4), ACER(5), IBM(6);

	private int rating;
	
	Laptops(int rating)
		{
		this.rating = rating;
	     }
	public int getRating()
		{
		return rating;
	   }
};

public static void main(String[] args) 
	{
	Laptops rated	= Laptops.DELL;
	System.out.println("Using enum method to get the rating of laptop.");
	System.out.println();
	switch (rated) {
		case SONY:
			System.out.println("The laptop rating is " + Laptops.SONY.getRating());
			break;
		case HP:
			System.out.println("The laptop rating is " + Laptops.HP.getRating());
			break;
		case DELL:
			System.out.println("The laptop rating is " + Laptops.DELL.getRating());
			break;
		case TOSHIBA:
			System.out.println("The laptop rating is " + Laptops.TOSHIBA.getRating());
			break;
		case ACER:
			System.out.println("The laptop rating is " + Laptops.ACER.getRating());
			break;
		case IBM:
			System.out.println("The laptop rating is " + Laptops.IBM.getRating());
			break;
		default:
			System.out.println("The laptop has got no rating.");
			break;
	}
}
}