import java.net.*;
import java.io.*;
import java.util.*;

public class Redirector extends Thread {

  Socket theConnection;
  static String theSite;
  
  public Redirector(Socket s) {
    theConnection = s;
  }

  public static void main(String[] args) {

    int thePort;
    ServerSocket ss;
    
    try {
      theSite = args[0];
    }
    catch (Exception e) {
      theSite = "http://www.ora.com";
    }
    
    // trim trailing slash
    if (theSite.endsWith("/")) {
      theSite = theSite.substring(0, theSite.length()-1);
    }
    
    try {
      thePort = Integer.parseInt(args[1]);
    }  
    catch (Exception e) {
      thePort = 80;
    }
    
    try {
      ss = new ServerSocket(thePort);
      System.out.println("Redirecting connections on port " + ss.getLocalPort()
        + " to " + theSite);

      while (true) {
        Redirector rd = new Redirector(ss.accept());
        rd.start();
      }
    }
    catch (IOException e) {
    
    }
  
  }  // end main

  public void run() {
    try {
      PrintStream os = new PrintStream(theConnection.getOutputStream());
      DataInputStream is = new DataInputStream(theConnection.getInputStream());
      String get = is.readLine();
      // The StringTokenizer parses out the requested document
      // so a proper URL can be built for the document at
      // the new site
      StringTokenizer st = new StringTokenizer(get);
      st.nextToken();  // the method, e.g. "GET" or "POST"
      String theFile = st.nextToken();
      
      // Does the client understand HTTP/1.0 or later?
      try {
        if (st.nextToken().startsWith("HTTP/")) {
          // wait for a blank line
          while (true) {
            String thisLine = is.readLine();
            if (thisLine.trim().equals("")) break; 
          }
 
          // Send the HTTP 1.0 Header
          os.print("HTTP/1.0 302 FOUND\r\n");
          Date now = new Date();
          os.print("Date: " + now + "\r\n");
          os.print("Server: MiniRedirector 1.0\r\n");
          os.print("Location: " + theSite + theFile + "\r\n");        
          os.print("Content-type: text/html\r\n\r\n");
        } // end if
     } // end try
     catch (NoSuchElementException e) {
       // No big deal. This client
       // doesn't understand HTTP/1.0
       // so don't send a MIME header
     }
      // Not all browsers support redirection so we need to 
      // produce HTML that says where the document has moved to.
      os.println("<HTML><HEAD><TITLE>Document moved</TITLE></HEAD>");
      os.println("<BODY><H1>Document moved</H1>");
      os.println("The document " + theFile + 
        " has moved to <A HREF=\"" + theSite + "\">" + theSite + 
        "</A>. Please update your bookmarks<P>");
      os.println("</BODY></HTML>");
      theConnection.close();
    }
    catch (IOException e) {
    
    }

  }  // end run

}
