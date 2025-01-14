//stringbuffer1.java

class stringbuffer1 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer ();
		System.out.println ( "sb = " + sb);
		System.out.println ( "Length = " + sb.length () );
		System.out.println ( "Capacity =  " + sb.capacity ());
		sb.setLength (2);

       System.out.println ( "sb = " + sb);
		System.out.println ( "Length = " + sb.length () );
		System.out.println  ( "Capacity =  " + sb.capacity ());

			sb.setLength (4);
        
		System.out.println ( "sb = " + sb);
		System.out.println ( "Length = " + sb.length () );
		System.out.println  ( "Capacity =  " + sb.capacity ());

	}
}
