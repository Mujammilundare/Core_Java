import java.awt.*;
import java.applet.*;

//////<APPLET CODE="PaddingApplet.class" WIDTH="300" HEIGHT="200"></APPLET>

public class PaddingApplet extends Applet {

    public PaddingApplet() {
	GridBagLayout gridbag = new GridBagLayout();
	setLayout(gridbag);

	GridBagConstraints constraints = new GridBagConstraints();

	Button  btn1 = new Button("Button 1");
	add(btn1);
	constraints.gridx = 0;  // add in column order
	gridbag.setConstraints(btn1, constraints);

	Button btn2 = new Button("Button 2");
	add(btn2);
	constraints.ipady = 20;
	gridbag.setConstraints(btn2, constraints);

	Button btn3 = new Button("Button 3");
	add(btn3);
	constraints.ipady = 0; // reset to default
	gridbag.setConstraints(btn3, constraints);

	Button btn4 = new Button("Button 4");
	add(btn4);
	constraints.insets.top = 20;
	constraints.insets.bottom = 50;
	gridbag.setConstraints(btn4, constraints);

	Button btn5 = new Button("Button 5");
	add(btn5);
	constraints.insets.top = 0;  // reset to default
	constraints.insets.bottom = 0;  // reset to default
	gridbag.setConstraints(btn5, constraints);

	resize(300, 300);
    }
}

