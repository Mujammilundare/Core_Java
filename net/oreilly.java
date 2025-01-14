import java.net.*;

class oreilly {

  public static void main (String args[]) {

    try {
      InetAddress address = InetAddress.getByName("www.google.com");
      System.out.println(address);
    }
    catch (UnknownHostException e) {
      System.out.println("Could not find www.oreilly.com");
    }

	  }

}
