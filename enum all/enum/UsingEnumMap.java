import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import static java.lang.System.out;

public class UsingEnumMap 
	{
enum Day
	{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

public static void main(String[] args) 
	{
int[] freqArray = { 12, 34, 56, 23, 5, 13, 78 };

// Create a Map of frequencies
Map<Day, Integer> ordinaryMap = new HashMap<Day, Integer>();

for (Day day : Day.values()) 
	{
			ordinaryMap.put(day, freqArray[day.ordinal()]);
  }
out.println("Frequency Map: " + ordinaryMap);
// Create an EnumMap of frequencies
EnumMap<Day, Integer> frequencyEnumMap = new EnumMap<Day, Integer>(
ordinaryMap);
// Change some frequencies
frequencyEnumMap.put(Day.MONDAY, 100);
frequencyEnumMap.put(Day.FRIDAY, 123);
out.println("Frequency EnumMap: " + frequencyEnumMap);
// Values
Collection<Integer> frequencies = frequencyEnumMap.values();
out.println("Frequencies: " + frequencies);
// Keys
Set<Day> days = frequencyEnumMap.keySet();
out.println("Days: " + days);
}
}