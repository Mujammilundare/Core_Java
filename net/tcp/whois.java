import java.net.*;
import java.io.*;

public class whois {

  public final static int port = 43;
  public final static String hostname = "whois.internic.net";

  public static void main(String[] args) {

    Socket theSocket;
    DataInputStream theWhoisStream;
    PrintStream ps;

    try {
      theSocket = new Socket(hostname, port, true);
      ps = new PrintStream(theSocket.getOutputStream());
      for (int i = 0; i < args.length; i++) ps.print(args[i] + " ");
      ps.print("\r\n");
      theWhoisStream = new DataInputStream(theSocket.getInputStream());
      String s;
      while ((s = theWhoisStream.readLine()) != null) {
        System.out.println(s);
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }

  }

}
