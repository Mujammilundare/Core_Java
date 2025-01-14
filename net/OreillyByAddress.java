// Example 4.2

import java.net.*;

class OreillyByAddress {

  public static void main (String args[]) {

    try {
      InetAddress address = InetAddress.getByName("204.29.207.217");
      System.out.println(address);
    }
    catch (UnknownHostException e) {
      System.out.println("Could not find 204.29.207.217");
    }

  }

}
