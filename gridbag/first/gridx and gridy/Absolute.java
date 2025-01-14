import java.awt.*;

public class Absolute extends Frame {
  

    public Absolute() 
		{
	GridBagLayout g = new GridBagLayout();
	setLayout(g);

	GridBagConstraints gbc = new GridBagConstraints();

	Button  b1 = new Button("Button 1");
	add(b1);
	// set at (0,0)
	gbc.gridx = 0;
	gbc.gridy = 0;
    gbc.fill=GridBagConstraints.VERTICAL;
	gbc.gridwidth=2;
	gbc.gridheight=0;
	
	g.setConstraints(b1, gbc);

	Button b2 = new Button("Button 2");
	add(b2);
	// set at (2,0)
	gbc.gridx = 2;
	gbc.gridy = 0;
	g.setConstraints(b2, gbc);


	Button b3 = new Button("Button 3");
	add(b3);
	// set at (0,2)
	gbc.gridx = 0;
	gbc.gridy = 2;
//
  gbc.weightx=1.0;
	gbc.weighty=0.0;
	
	g.setConstraints(b3, gbc);

	Button b4 = new Button("Button 4");
	add(b4);
	// set at (2,2)
	gbc.gridx = 2;
	gbc.gridy = 2;
	g.setConstraints(b4, gbc);

	Button b5 = new Button("Button 5");
	add(b5);
	// set at (1,1)
	gbc.gridx = 1;
	gbc.gridy = 1;
	g.setConstraints(b5, gbc);

	resize(300, 300);

    }

	public static void main(String[] args) 
	{
		Absolute fm = new Absolute();
		fm.setSize(250,250);
		fm.setVisible(true);
	 
	}

}

