 import java.awt.* ; 
 import java.io.InputStream ; 
 import java.io.DataInputStream ; 
 import java.net.URL ; 

//<APPLET CODE="tipsFile1.class" WIDTH="200" HEIGHT="200"></APPLET>

 public class tipsFile1 extends java.applet.Applet 
	 { 
      String s ; 	// String to store File
      TextArea t1 = new TextArea("") ; 

     
     public void init() 
		 {
          setLayout(new GridLayout(1,1)) ; 
          add(t1) ;                       
          readFile("tipsFile1.java") ;      // read a file (this source code) 
          t1.setText(s) ;                   // Put text in a TextArea 
     } 

     // readFile  
     public void readFile(String f) 
		 { 
          s = new String("") ; 
          // define InputStream 
          DataInputStream fis = null ; 
          // open stream 
          try { 
               fis = new DataInputStream( (new URL( getCodeBase(), f )).openStream() ) ; 
          } catch( Exception e ) { 
               s = "readFile : " + f + "\r\n --> Exception : " + e ; 
               return ; 
          } 

          String sS = new String("") ; 
           // read loop 
          while ( true ) { 
               try { 
                    sS = fis.readLine() ; 	
                    if (sS != null) 
                         s = s + "\r\n" + sS ; 
                    else  
                         break ; // end of file 
               } catch( Exception e ) { 
                         break ; 
               }     
           } 
     } 
  } 