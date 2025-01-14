enum Beer
{
	KF,RC,KO,FO;
}
class EnumDemo2
{
	public static void main(String[] args) 
	{
		Beer b = Beer.RC;
		switch(b)
		{
		case KF:
		System.out.println("Kids Stuff!");
		break;
 
		case RC:
		System.out.println("Its Ok!");
		break;
 
		case KO:
		System.out.println("I am knocked out !");
		break;
 
		case FO:
		System.out.println("r u kidding me ?");
		break;
 
		default:
		System.out.println("Rest are not good!");
 
	}}}