import java.net.*;
import java.io.*;


public class lookForPorts2 {

  public static void main(String[] args) {
    
    Socket theSocket;
    String host = "localhost";

    if (args.length > 0) {
      host = args[0];
    }

    try {
      InetAddress theAddress = InetAddress.getByName(host);
      for (int i = 1024; i < 65536; i++) {
        try {
          /* The following line has been changed.  The book used host instead
          of theAddress which works as expected does not test the polymorphic
          constructor variant this section discusses. */
          theSocket = new Socket(theAddress, i);
          System.out.println("There is a server on port " + i + " of " + host);
        }  // end try
        catch (IOException e) {
          // must not be a server on this port
        } // end catch
      } // end for
    } // end try
    catch (UnknownHostException e) {
      System.err.println(e);
    } // end catch

  }  // end main
  
}  // end lookForPorts2
