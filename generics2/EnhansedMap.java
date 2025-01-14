
import java.util.*;

class  EnhansedMap
{
public static void main(String[] args) 
{

Map<Integer, String> map = new HashMap<Integer, String>();

Integer key1   = 123;
String  value1 = "cow";

map.put(key1, value1);
//or
map.put(123, value1);  //autoboxing

System.out.println(map.get(123));




// iterate keys.
Iterator<Integer> i   = map.keySet().iterator();  

while(i.hasNext())
	{
  Integer key   = i.next();
  String  value = map.get(key);

  System.out.println(key+" and   "+value);
 }


Iterator<String>  ii = map.values().iterator(); //// values() and a diamond

while(ii.hasNext()){
  String value = ii.next();
  System.out.println(value);
}

System.out.println("******************");

for(Integer k : map.keySet()) {
    String val = map.get(k);
    System.out.println("" + k + ":" + val);
}

for(String v : map.values()) {
    System.out.println(v);
}





	}
}
