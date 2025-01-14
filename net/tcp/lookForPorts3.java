import java.net.*;
import java.io.*;

public class lookForPorts3 {

  public static void main(String[] args) {
    
    Socket theSocket;
    String host = "localhost";

    if (args.length > 0) {
      host = args[0];
    }

    try {
      InetAddress theAddress = InetAddress.getByName(host);
      for (int i = 1; i <= 65535; i++) {
       try {
         // the next line will fail and drop into the catch block if
         // the connection to the specified port is refused by the remote 
         // host
         theSocket = new Socket(theAddress, i);
         System.out.println("There is a server on port " + i + " of " + host);
         theSocket.close();
       }
       catch (IOException e) {
         // must not be a server on this port
       }
      } // end for
    } // end try
    catch (UnknownHostException e) {
      System.err.println(e);
    }

  }
  
}
