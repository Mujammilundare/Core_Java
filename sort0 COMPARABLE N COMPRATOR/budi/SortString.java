import java.util.Collections;
import java.util.ArrayList;

class  SortString
{

public static void main(String[] args) 
{

ArrayList insects = new ArrayList();
	insects.add("mosquito");
	insects.add("butterfly");
	insects.add("dragonfly");
	insects.add("fly");

int size = insects.size();
for (int i=0; i<size; i++) {
  System.out.println("insect " + i + " : " + (String) insects.get(i));
}

Collections.sort(insects);

for (int i=0; i<size; i++) {
  System.out.println("insect " + i + " : " + (String) insects.get(i));
}
	}
}
