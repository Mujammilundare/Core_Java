import java.net.*;
import java.io.*;

public class clientTester {

  public static void main(String[] args) {

    int thePort;
    ServerSocket ss;
    Socket theConnection;
    
    try {
      thePort = Integer.parseInt(args[0]);
    }  
    catch (Exception e) {
      thePort = 0;
    }
    
    try {
      ss = new ServerSocket(thePort);
      System.out.println("Listening for connections on port " + ss.getLocalPort());

      while (true) {
        theConnection = ss.accept();
        System.out.println("Connection established with " + theConnection);
        InputThread it = new InputThread(theConnection.getInputStream());
        it.start();
        OutputThread ot = new OutputThread(theConnection.getOutputStream(), it);
        ot.start();
        // need to wait for ot and it to finish 
        try {
          ot.join();
          it.join();
        }
        catch (InterruptedException e) {
        } 
      }
    }
    catch (IOException e) {
    
    }
  
  }

}

class InputThread extends Thread {
  
  InputStream is;
  
   public InputThread(InputStream is) {
     this.is = is;
   }

   public void run()  {
   
     try {
       while (true) {
         int i = is.read();
         if (i == -1) break;
         char c = (char) i;
         System.out.print(c);
       }
     }
     catch (IOException e) {
       System.err.println(e);
     }
   
   }

}

class OutputThread extends Thread {
  
  PrintStream ps;
  DataInputStream is;
  InputThread it;
    
   public OutputThread(OutputStream os, InputThread it) {
     ps = new PrintStream(os);
     this.it = it;
     is = new DataInputStream(System.in);
   }

   public void run() {

     String line;
     try {
       while (true) {
         line = is.readLine();
         if (line.equals(".")) break;
         ps.println(line);
       }   
     }
     catch (IOException e) {
     
     }
      it.stop();
   }

}
