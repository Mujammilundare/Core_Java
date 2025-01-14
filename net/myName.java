import java.net.*;

class myName {

  public static void main (String args[]) {

    try {
      InetAddress address = InetAddress.getLocalHost();
      System.out.println("Hello. My name is " +  address.getHostName());
    }
    catch (UnknownHostException e) {
      System.out.println("I'm sorry. I don't know my own name.");
    }

  }

}
