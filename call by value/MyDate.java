import java.util.*;
class MyDate
{
/*	//int d=20,m=10,y=2012;
	int dd,mm,yy;
	public MyDate(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	*/
	public static void main(String[] args)
	{
		Date d1=new Date("1/3/2101");
		Date d2=new Date("2/1/2014");
		System.out.println("Before Swap is "+d1+" "+d2);
		swap(d1,d2);
		System.out.println("After Swap is "+d1+" "+d2);
	}
	public static void swap(Date m1,Date m2)
	{
		Date temp;
		temp=m1;
		m1=m2;
		m2=temp;
	}

}