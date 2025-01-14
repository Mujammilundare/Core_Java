class  Intern
{
	public static void main(String[] args) 
	{
     String s1 = "JavaWorld";
    String s2 = ("Java" + new String ("World")).intern ();
System.out.println(s1);
System.out.println(s2);

	}
}
