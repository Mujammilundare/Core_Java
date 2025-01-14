import java.awt.*;

public class Vertical extends Frame {

    public static void main(String argv[]) {
	new Vertical().show();
    }

    public Vertical() {
	Button btn;
	GridBagLayout g = new GridBagLayout();
	setLayout(g);

	GridBagConstraints g = new GridBagConstraints();
	g.gridx = 0; // note: gridy == RELATIVE 

	for (int n = 1; n <= 8; n++) {
	    btn = new Button("Button " + n);
	    add(btn);
	    g.setConstraints(btn, g);
	}
    }
}

