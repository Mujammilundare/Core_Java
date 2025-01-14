import java.awt.*;
import java.awt.event.*;
public class GBCal extends Frame{
    Panel pTimes=new Panel();
    Panel pAps=new Panel();
    TextField txTimes=new TextField("09.00");
    TextField txAps=new TextField("Meet the boss");
    GridBagLayout gbl=new GridBagLayout();
    GridBagConstraints gbc=new GridBagConstraints();
    public static void main(String argv[]){
    GBCal gbc=new GBCal();
    gbc.setLayout(new FlowLayout());
}

public GBCal() {
    pTimes.add(txTimes);
    pAps.add(txAps);
    setLayout(gbl);
    gbc.gridx=0;
    gbc.gridy=0;
    pTimes.setBackground(Color.pink);
    add(pTimes,gbc);
    gbc.gridx=1;
    gbc.gridy=0;

gbc.ipadx=30;
//For the times and
gbc.ipadx=100;
//For the appointments


    pAps.setBackground(Color.lightGray);
    add(pAps,gbc);
    setSize(300,300);
    setVisible(true);
    }
}


