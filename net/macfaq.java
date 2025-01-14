/* Since the book was written, www.macfaq.com has moved off of
spacecadet.cnet.com onto a new host. Thus if you run this you
won't get the results shown in the book. */

import java.net.*;

class macfaq {

  public static void main (String args[]) {

    try {
      
	  InetAddress macfaq = InetAddress.getByName("www.google.com");
      InetAddress spacecadet = InetAddress.getByName("www.google.com");
	  System.out.println(macfaq);
	  System.out.println(spacecadet);

      if (macfaq.equals(spacecadet)) 
		  {
        System.out.println ("www.macfaq.com is the same as spacecadet.cnet.com");
      }
      else {
        System.out.println
          ("www.macfaq.com is not the same as spacecadet.cnet.com");
      }
    }
    catch (UnknownHostException e) 
		{
      System.out.println("Host lookup failed.");
    }

  }

}
