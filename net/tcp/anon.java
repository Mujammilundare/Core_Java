import java.net.*;
import java.io.*;

public class anon {

  public static void main(String[] args) {

    try {
      ServerSocket httpd = new ServerSocket(0);
      System.out.println("This server runs on port " + httpd.getLocalPort());
    }
    catch (IOException e) {
      System.err.println(e);
    }

  }

}
