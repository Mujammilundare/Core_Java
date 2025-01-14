import java.net.*;
import java.io.*;

public class lookForLocalPorts {

  public static void main(String[] args) {
    
    ServerSocket theServer;

    for (int i = 1024; i <= 65535; i++) {
      try {
        // the next line will fail and drop into the catch block if
        // there is already a server running on port i
        theServer = new ServerSocket(i);
        theServer.close();
      }
      catch (IOException e) {
        System.out.println("There is a server on port " + i + ".");
      } // end try
    } // end for

  }
  
}
