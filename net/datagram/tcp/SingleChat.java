import java.awt.*;
import java.net.*;
import java.io.*;
import java.awt.event.*;

public class SingleChat extends Frame {

        Label l1 = new Label("Text to Send :");
        Label l2 = new Label("Text received :");
        TextField sendText = new TextField(30);
        TextArea receivedText = new TextArea();
        int port = 5001;
        Socket sock = null;
        DataOutputStream remoteOut = null;

        public SingleChat() {
            this.setSize(new Dimension(400, 200));
            this.setLayout(new FlowLayout());
            this.addWindowListener(new WindowAdp());

            sendText.addActionListener(new TextHandler());

            this.add(l1);
            this.add(sendText);
            this.add(l2);
            this.add(receivedText);
            this.show();
        }

        public static void main(String args[]) {
          String s = null;

          if(args.length > 0) 
            s = args[0];
            SingleChat chat = new SingleChat();
          

          if(s == null)
            chat.server();
          else
            chat.client(s);
            
        }

        class WindowAdp extends WindowAdapter {
          public void windowClosing(WindowEvent we){
            System.exit(0);
          }
        }

        public void server() {
          ServerSocket serverSock = null;

          try {

            InetAddress serverAddr = InetAddress.getByName(null);
            displayMsg("Waiting  for Connection on " +serverAddr.getHostName() + " on port " + port);

            serverSock = new ServerSocket(port, 1);
            sock = serverSock.accept();
            displayMsg("Accepted connection from " + sock.getInetAddress().getHostName());
            remoteOut = new DataOutputStream(sock.getOutputStream());
            new SingleChatReceive(this).start();
          }
          catch(Exception ex) {
            System.out.println(ex);
          }
          finally {
            if(serverSock != null) {
              try {
                serverSock.close();
              }
              catch(Exception ex){}
            }
          }
        }


        void displayMsg(String s) {
          this.setTitle(s);
        }

        class SingleChatReceive extends Thread {
          SingleChat chat;
          DataInputStream remoteIn;
          boolean listening = true;

          public SingleChatReceive(SingleChat chat) {
            this.chat = chat;
          }

          public synchronized void run() {
            String s;
            try {
              remoteIn =  new DataInputStream(chat.sock.getInputStream());

              while(listening) {
                s = remoteIn.readUTF();
                chat.receivedText.setText(s);
              }
            }
            catch(Exception ex) {
              System.out.println(ex);
            }
            finally {
              try {
                if(remoteIn != null)
                  remoteIn.close();
              }
              catch(Exception ex) {}
            }
          }
        }

        private void client(String serverName) {
            try {
              if(serverName.equals("local"))
                serverName = null;

              InetAddress serverAddr = InetAddress.getByName(serverName);
              sock = new Socket(serverAddr.getHostName(), port);
              remoteOut = new DataOutputStream(sock.getOutputStream());

              displayMsg("Connected to server " + serverAddr.getHostName() + " on port " + port);

              new SingleChatReceive(this).start();
            }
            catch(Exception ex) {
              System.out.println(ex);
            }
        }

        class TextHandler implements ActionListener {

            public void actionPerformed(ActionEvent ae) {
                try {
                    remoteOut.writeUTF(sendText.getText());
                    sendText.setText("");
                }
                catch(Exception ex) {
                  System.out.println(ex);
                }
            }
        }

        public void finalize() throws Throwable {
            try {
              if(remoteOut != null)
                remoteOut.close();
              if(sock != null)
                sock.close();
            }
            catch(Exception ex) {
            }
            super.finalize();
        }
}


