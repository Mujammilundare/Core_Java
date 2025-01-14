import java.awt.*;
import java.applet.Applet;
//<applet code="flowdemo2.class" height = 75 width=175> </applet>

public class flowdemo2 extends Applet 
{ 
	Button b1, b2, b3,b4,b5,b6;
	public void init()

{
     GridLayout flow = new GridLayout(2,3);
	    setLayout(flow);

		b1 = new Button("A");
       b2 = new Button("B");
		b3 = new Button("C");
        b4 = new Button("Aa");
       b5 = new Button("Bb");
		b6 = new Button("Cc");

		add(b1);
		add(b2);
		add(b3);
			add(b4);
		add(b5);
		add(b6);

}
}
//     FlowLayout flow = new FlowLayout(FlowLayout.RIGHT);
//	    setLayout(flow);

//  GridLayout flow = new GridLayout(2,3);
//	    setLayout(flow);
