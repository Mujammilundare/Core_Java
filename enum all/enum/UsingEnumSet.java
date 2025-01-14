import java.util.EnumSet;
import static java.lang.System.out;

public class UsingEnumSet 
	{
enum Day 
	{
MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public static void main(String[] args) 
	{
		EnumSet<Day> allDays = EnumSet.range(Day.MONDAY, Day.SUNDAY);
		out.println("All days: " + allDays);
		EnumSet<Day> weekend = EnumSet.range(Day.SATURDAY, Day.SUNDAY);
		out.println("Weekend: " + weekend);
		EnumSet<Day> oddDays = EnumSet.of(Day.MONDAY, Day.WEDNESDAY,Day.FRIDAY, Day.SUNDAY);
		out.println("Odd days: " + oddDays);
		EnumSet<Day> evenDays = EnumSet.complementOf(oddDays);
		out.println("Even days: " + evenDays);
		EnumSet<Day> weekDays = EnumSet.complementOf(weekend);
		out.println("Week days: " + weekDays);
}
}