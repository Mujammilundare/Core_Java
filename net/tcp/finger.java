import java.net.*;
import java.io.*;

public class finger {

  public final static int port = 79;

  public static void main(String[] args) {

    String hostname;
    Socket theSocket;
    DataInputStream theFingerStream;
    PrintStream ps;

    try {
      hostname = args[0];
    }
    catch (Exception e) {
      hostname = "localhost";
    }

    try {
      theSocket = new Socket(hostname, port, true);
      ps = new PrintStream(theSocket.getOutputStream());
      for (int i = 1; i < args.length; i++) ps.print(args[i] + " ");
      ps.print("\r\n");
      theFingerStream = new DataInputStream(theSocket.getInputStream());
      String s;
      while ((s = theFingerStream.readLine()) != null) {
        System.out.println(s);
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }

  }

}
