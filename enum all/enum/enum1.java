//Whenever an ENUM is complied in Java, two static methods are added by compiler 
//called valueOf() and values(). We can use valueOf() method to convert any 
//String value to ENUM. For example lets say we have an ENUM called Weekdays.


class  enum1
{

public enum Weekdays 
	{ 
	MONDAY, 
	TUESDAY, 
	WEDNESDAY, 
	THURSDAY, 
	FRIDAY, 
	SATURDAY, 
	SUNDAY 
  }

//Weekdays w;

public static void main(String[] args) 
	{


Weekdays ob = Weekdays.SUNDAY;
System.out.println(ob);
Weekdays weekday = Weekdays.valueOf("MONDAY");
System.out.println(weekday);
	}



}
