enum Beer
{
	KF,KO,RC,FO,RG;	
 
	Beer()
	{
		System.out.println("In Enum Constructor!");
	}
}

class Test2
{
	public static void main(String[] args) 
	{
	Beer b = Beer.RC;
	System.out.println("IN Main");
	}
}