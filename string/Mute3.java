import java.awt.*;

class  Mute3 
{
	public static void main(String[] args) 
	{
	Point myPoint = new Point( 0, 0 );
	System.out.println( myPoint );
	myPoint.setLocation( 1.0, 0.0 );
	System.out.println( myPoint );

	String myString = new String( "old String" );
	System.out.println( myString );
	myString.replaceAll( "old", "new" );
	System.out.println( myString );	}
}
