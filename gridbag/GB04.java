import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<APPLET CODE="GB04.class" WIDTH="300" HEIGHT="200"></APPLET>
public class GB04 extends Applet 
	{
   GridBagLayout gbl = new GridBagLayout();
   GridBagConstraints c = new GridBagConstraints();

   public void init() 
	   {
        setup_layout();
      }

   private void setup_layout() 
	   {
      setBackground(Color.yellow);
      setLayout(gbl);
      c.weightx = 1;
      c.weighty = 1;
      makeLabel(0,0,"none", GridBagConstraints.NONE);
      makeLabel(1,0,"horizontal", GridBagConstraints.HORIZONTAL);
      makeLabel(0,1,"vertical", GridBagConstraints.VERTICAL);
      makeLabel(1,1,"both", GridBagConstraints.BOTH);
    }

    private void makeLabel(int x, int y, String label, int fill) 
		{
        Label b = new Label(label, Label.CENTER);
        b.setBackground(Color.cyan);
        b.setForeground(Color.black);
        add(b);
        c.fill = fill;
        c.gridx = x;
        c.gridy = y;
        gbl.setConstraints(b, c);
    }

}

