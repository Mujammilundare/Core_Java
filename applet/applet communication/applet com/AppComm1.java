

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class AppComm1 extends JApplet {
	JComboBox cboColours;
	Color color;
	
	public void init(){
		setLayout(null);
		color = Color.red;
		
		//cboColours = new JComboBox(new String[]{"Red","Green","Blue","Grey","Black","White"});
		cboColours = new JComboBox();
		cboColours.addItem("Red");
		cboColours.addItem("Green");
		cboColours.addItem("Blue");
		cboColours.setBounds(20,30,100,20);
		add(cboColours);
		
		cboColours.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				if("Red".equals(cboColours.getSelectedItem()))
			color = color.black;
		else if("Green".equals(cboColours.getSelectedItem()))
				color = color.blue;
		else if("Blue".equals(cboColours.getSelectedItem()))
					color = color.red;
		else
				color = color.green;
			
				
				JApplet a = (JApplet)getAppletContext().getApplet("Appcomm2");
				a.repaint();
			}
		});
		
		
	}
	
	public Color getColor(){
		return color;
	}
}
