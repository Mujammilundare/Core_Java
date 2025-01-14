class  Mute4
{
	public static void main(String[] args) 
	{
    String myString = new String( "old String" );
	String myCache = myString;
	System.out.println( "equal: " + myString.equals( myCache ) );
	System.out.println( "same:  " + ( myString == myCache ) );

	myString = "not " + myString;
	System.out.println( "equal: " + myString.equals( myCache ) );
	System.out.println( "same:  " + ( myString == myCache ) );

	}
}

//What this shows is that variable myString is referencing a new 
//instance of the String class. The contents of the object didn't change; we discarded the instance and changed our reference to a new one with new contents. 