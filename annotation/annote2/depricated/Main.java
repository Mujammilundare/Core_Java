import java.util.Calendar;
import java.util.Date;

public class Main
	{
/**
   * Get current system date.
   * 
   * @return current system date.
   * @deprecated This method will removed in the near future.
   */
  @Deprecated
  public static Date getDate()
	  {
			return new Date();
	 }

  public static int getMonthFromDate() 
	  {
			return Calendar.getInstance().get(Calendar.MONTH);
    }


  public static void main(String[] args) 
	  {
    System.out.println(getDate());
   System.out.println(getMonthFromDate());
     }

  
}

