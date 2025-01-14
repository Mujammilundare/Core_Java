import java.applet.*;
import java.awt.*;

/*
<applet code="ButtonEvent0" width=200 height=200>
</applet>
*/
public class ButtonEvent0  extends Applet
	{
       public void init()
			{
              Button b= new Button("Click here!");
               add(b);

Checkbox c= new Checkbox("Click here!");
               	   add(c);


Choice co =  new Choice();
co.add("Choco bar");
co.add("Vannila");
co.add("ButterScotch");
add(co);

Label l = new Label("Kripya naam Enter karien");
TextField tf = new TextField(23);
	add(l);
	add(tf);

TextArea ta = new TextArea();
add(ta);


			}
				              
}

