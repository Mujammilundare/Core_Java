import java.text.ParseException; 
import java.text.SimpleDateFormat; 
import java.util.Date; 

public class StringToDate
	{ 
public static void main(String args[]) throws ParseException
	{ 

SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy"); 
String dateString="11/12/2010"; 
Date d=sdf.parse(dateString); 
System.out.println(d); 
} 
}
