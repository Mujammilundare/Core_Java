import java.awt.*;
import javax.swing.*;

public class  Tutorial extends Panel
{
JButton b1,b2,b3,b4,b5;

GridBagConstraints gbc = new GridBagConstraints();

public Tutorial()
	{
    setLayout(new GridBagLayout());

//	gbc.insets=new Insets(5,5,5,5);
	 
	b1 = new JButton("JButton1");
	gbc.gridx = 0;
    gbc.gridy = 0;

	gbc.gridheight =2;
	gbc.fill=GridBagConstraints.VERTICAL;
	add(b1,gbc);

	b2 = new JButton("JButton2");
	gbc.gridx = 1;
    gbc.gridy = 1;

	gbc.gridheight =1;

	add(b2,gbc);

	b3 = new JButton("JButton3");
	gbc.gridx = 2;
    gbc.gridy = 2;
	gbc.gridheight =1;
	add(b3,gbc);

	b4 = new JButton("JButton4");
	gbc.gridx = 3;
    gbc.gridy = 3;
	
	gbc.gridheight =1;
	
	add(b4,gbc);

	b5 = new JButton("JButton5");
	gbc.gridx = 4;
    gbc.gridy = 4;
    
     gbc.gridwidth = 3;
	gbc.gridheight =1;
	
	gbc.fill=GridBagConstraints.HORIZONTAL;
	add(b5,gbc);
	   
	}


	public static void main(String[] args) 
	{
		Tutorial t = new Tutorial();
		JFrame jf=new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		jf.setSize(500, 500); 
		jf.setVisible(true); 
		jf.add(t);
	
	}
}
