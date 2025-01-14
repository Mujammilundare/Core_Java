import java.net.*;
import java.io.*;


class weblog {

  public static void main(String args[]) {

    String thisLine;
    String thisIP;
    String theRest;
    int index;
    InetAddress thisAddress;
    byte[] address;

    try {

      FileInputStream fin =  new FileInputStream(args[0]);
      DataInputStream myInput = new DataInputStream(fin);

        while ((thisLine = myInput.readLine()) != null) {
          index = thisLine.indexOf(" ", 0);
          thisIP = thisLine.substring(0, index);
          theRest = thisLine.substring(index, thisLine.length());
          try {
            thisAddress = InetAddress.getByName(thisIP);
            address = thisAddress.getAddress();
            System.out.println(InetAddressFactory.newInetAddress(address).getHostName() + theRest);
          }
          catch (UnknownHostException e) {
            System.out.println(thisLine);
          }
       } // while loop ends here
    }
    catch (IOException e) {
      System.out.println("Exception: " + e);
    }

  }  // end main

}
