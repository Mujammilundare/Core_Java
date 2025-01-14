import java.util.LinkedHashMap;
 
public class LinkedHashMap1 
	{
   public static void main(String[] args) {
     LinkedHashMap hm = new LinkedHashMap();
    hm.put("1","One");
    hm.put("2","Two");
    hm.put("3","Three");
   
    /*
      To check whether a particular key exists in LinkedHashMap use
      boolean containsKey(Object key) method of LinkedHashMap class.
      It returns true if the LinkedHashMap contains mapping for specified key
      otherwise false.
    */
   
    boolean blnExists = hm.containsKey("3");
    System.out.println("3 exists in LinkedHashMap ? : " + blnExists);
  }
	}