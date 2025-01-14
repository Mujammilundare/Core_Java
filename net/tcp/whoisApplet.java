import java.applet.Applet;
import java.awt.*;
import java.net.*;
import java.io.*;

public class whoisApplet extends Applet {

  public final static int port = 43;
  public final static String hostname = "whois.internic.net";

  TextField searchString;
  TextArea detailView;
  List names;
  Button findButton;
  CheckboxGroup searchIn;
  CheckboxGroup searchFor;
  Checkbox exactMatch;

  public static void main(String[] args) {
  
    whoisApplet a = new whoisApplet();
    a.init();
    a.start();
  
    Frame appletFrame = new Frame("whois");
    appletFrame.add("Center", a);
    appletFrame.resize(500,300);
    appletFrame.move(50,50);
    appletFrame.show();

  }

  public void init() {
  
    setLayout(new BorderLayout());
    // The TextArea in the center will expand to fill the
    // center of the BorderLayout
    detailView = new TextArea(12, 40);
    detailView.setEditable(false);
    names = new List(12, false);
    Panel CenterPanel = new Panel();
    CenterPanel.setLayout(new GridLayout(1, 2, 10, 10));
    CenterPanel.add("Center", names);
    CenterPanel.add(detailView);
    add("Center", CenterPanel);   
    
    // You don't want the buttons in the south and north
    // to fill the entire sections so add Panels there
    // and use FlowLayouts in the Panel
    Panel NorthPanel = new Panel();
    Panel NorthPanelTop = new Panel();
    NorthPanelTop.setLayout(new FlowLayout(FlowLayout.LEFT));
    NorthPanelTop.add(new Label("Whois: "));
    searchString = new TextField(30);
    NorthPanelTop.add("North", searchString);
    exactMatch = new Checkbox("Exact Match", null, true);
    NorthPanelTop.add(exactMatch);
    NorthPanel.setLayout(new BorderLayout(2,1));
    NorthPanel.add("North", NorthPanelTop);
    Panel NorthPanelBottom = new Panel();
    NorthPanelBottom.setLayout(new GridLayout(1,2,5,5));
    NorthPanelBottom.add(initRecordType());
    NorthPanelBottom.add(initSearchFields());
    NorthPanel.add("Center", NorthPanelBottom);
    Panel SouthPanel = new Panel();
    findButton = new Button("Find");
    SouthPanel.add("South", findButton);
    add("South", SouthPanel);
    add("North", NorthPanel);
      
  }
  
  public Panel initRecordType() {
  
    Panel p = new Panel();
    p.setLayout(new GridLayout(6, 2, 5, 2));
    searchFor = new CheckboxGroup();
    p.add(new Label("Search for:"));
    p.add(new Label(""));
    p.add(new Checkbox("Any", searchFor, true));
    p.add(new Checkbox("Network", searchFor, false));
    p.add(new Checkbox("Person", searchFor, false));
    p.add(new Checkbox("Host", searchFor, false));
    p.add(new Checkbox("Domain", searchFor, false));
    p.add(new Checkbox("Organization", searchFor, false));
    p.add(new Checkbox("Group", searchFor, false));
    p.add(new Checkbox("Gateway", searchFor, false));
    p.add(new Checkbox("ASN", searchFor, false));
    return p;
  
  }

  public Panel initSearchFields() {
  
    Panel p = new Panel();
    p.setLayout(new GridLayout(6, 1, 5, 2));
    searchIn = new CheckboxGroup();
    p.add(new Label("Search In:"));
    p.add(new Checkbox("All", searchIn, true));
    p.add(new Checkbox("Name", searchIn, false));
    p.add(new Checkbox("Mailbox", searchIn, false));
    p.add(new Checkbox("Handle", searchIn, false));
    return p;
  
  }

  public boolean action(Event e, Object o) {
  
    if (e.target == searchString || e.target == findButton) {
      lookUpNames(searchString.getText());
      return true;
    }
    else if (e.target == names) {
      getFullRecord(names.getSelectedItem());
      return true;
    }
    else {
      return false;
    }
  
  }
  
  public String makeSuffix() {
  
    String suffix = "";
    if (!exactMatch.getState()) suffix = "."; 
    return suffix;
  
  }
  
  public String makePrefix() {
  
    String searchForLabel = searchFor.getCurrent().getLabel() + " ";
    String searchInLabel = searchIn.getCurrent().getLabel() + " ";
    if (searchInLabel.startsWith("A")) searchInLabel = ""; 
    if (searchForLabel.startsWith("A")) searchForLabel = ""; 
    return searchForLabel + searchInLabel + "$";
  
  }

  public void lookUpNames(String name) {
  
    Socket theSocket;
    DataInputStream theWhoisStream;    
    PrintStream ps;
    String s;
    
    try {
      theSocket = new Socket(hostname, port, true);
      ps = new PrintStream(theSocket.getOutputStream());
      theWhoisStream = new DataInputStream(theSocket.getInputStream());
      /* A reader noticed that the folowing line had a redundant call to 
         searchString.getText(). I've fixed it below */      
//    ps.print(makePrefix() + searchString.getText() + makeSuffix() + "\r\n");
      ps.print(makePrefix() + name + makeSuffix() + "\r\n");
      names.clear();
      while ((s = theWhoisStream.readLine()) != null) {
        names.addItem(s);
      }
    }  
    catch (IOException e) {
      System.err.println(e);
    }

  }

  public void getFullRecord (String summary) {
  
    Socket theSocket;
    DataInputStream theWhoisStream;    
    PrintStream ps;
    String s;
    String handle = getHandle(summary);
  
    try {
      theSocket = new Socket(hostname, port, true);
      ps = new PrintStream(theSocket.getOutputStream());
      theWhoisStream = new DataInputStream(theSocket.getInputStream());
      ps.print("!" + handle + "\r\n");
      detailView.setText("");
      while ((s = theWhoisStream.readLine()) != null) {
        detailView.appendText(s + "\n");
      }
    }  
    catch (IOException e) {
      System.err.println(e);
    }
  
  }

  String getHandle(String s) {
  
    int begin = s.indexOf("(") + 1;
    int end = s.indexOf(")", begin);
    
    return s.substring(begin,end);
  
  }

}
