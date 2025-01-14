


public class AddTest
	{
int result=0;

void add(int... x)  // u will have to overload
{
	int result=0;  //see what happens

	for(int i:x)
	{
		result=result+i;
	}
	System.out.println("Addition is "+" "+result);
}

public static void main(String[] args) 
	{
	AddTest at=new AddTest();
	at.add(10,20);
	at.add(10,20,30);
	at.add(10,20,30,40);
	}
}
