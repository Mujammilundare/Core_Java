import java.awt.Container;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator extends JFrame 

{
	public Calculator()
	
	{
		super("Calculator");
		
		Container pane = getContentPane();
		pane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		
		
		//Define buttons and captions
		JButton button0 = new JButton("0");
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton buttonPlus = new JButton("+");
		JButton buttonMinus = new JButton("-");
		JButton buttonMultiply = new JButton("x");
		JButton buttonDivide = new JButton("/");
		JButton buttonEquals = new JButton("=");
		JButton buttonCancel = new JButton("C");
		
		//Define display
		JTextField display = new JTextField(10);
		display.setFont(new Font("Ariel",Font.BOLD,18));			
		//display.setEnabled(false);
		display.setHorizontalAlignment(JTextField.RIGHT);
		
		
		//Arrange display and buttons
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 0.4;
		c.weighty = 0.2;
		c.gridwidth =4;
		c.gridheight = 1;
		c.ipadx= 0;
		c.ipady=10;
		c.insets = new Insets(5,5,5,5);
		pane.add(display,c);
		
		c.gridx = 0;
		c.gridy = 3;
		c.weightx = 0.25;
		c.weighty = 0;
		c.gridwidth =1;
		c.gridheight = 1;
		c.ipadx= 0;
		c.ipady=0;
		pane.add(button1,c);
		
		c.gridx = 1;
		c.gridy = 3;
		c.weightx = 0.25;
		c.weighty = 0;
		c.gridwidth =1;
		c.gridheight = 1;
		c.ipadx= 0;
		c.ipady=0;
		pane.add(button2,c);
		
		c.gridx = 2;
		c.gridy = 3;
		c.weightx = 0.25;
		c.weighty = 0;
		c.gridwidth =1;
		c.gridheight = 1;
		c.ipadx= 0;
		c.ipady=0;
		pane.add(button3,c);
		
		c.gridx = 3;
		c.gridy = 3;
		c.weightx = 0.25;
		c.weighty = 0;
		c.gridwidth =1;
		c.gridheight = 1;
		c.ipadx= 0;
		c.ipady=0;
		pane.add(buttonMultiply,c);
		
		c.gridx = 0;
		c.gridy = 2;
		c.weightx = 0.25;
		c.weighty = 0;
		c.gridwidth =1;
		c.gridheight = 1;
		c.ipadx= 0;
		c.ipady=0;
		pane.add(button4,c);
		
		c.gridx = 1;
		c.gridy = 2;
		c.weightx = 0.25;
		c.weighty = 0;
		c.gridwidth =1;
		c.gridheight = 1;
		c.ipadx= 0;
		c.ipady=0;
		pane.add(button5,c);
		
		c.gridx = 2;
		c.gridy = 2;
		c.weightx = 0.25;
		c.weighty = 0;
		c.gridwidth =1;
		c.gridheight = 1;
		c.ipadx= 0;
		c.ipady=0;
		pane.add(button6,c);
		
		c.gridx = 3;
		c.gridy = 2;
		c.weightx = 0.25;
		c.weighty = 0;
		c.gridwidth =1;
		c.gridheight = 1;
		c.ipadx= 0;
		c.ipady=0;
		pane.add(buttonMinus,c);
		
		c.gridx = 0;
		c.gridy = 1;
		c.weightx = 0.25;
		c.weighty = 0;
		c.gridwidth =1;
		c.gridheight = 1;
		c.ipadx= 0;
		c.ipady=0;
		pane.add(button7,c);
		
		c.gridx = 1;
		c.gridy = 1;
		c.weightx = 0.25;
		c.weighty = 0;
		c.gridwidth =1;
		c.gridheight = 1;
		c.ipadx= 0;
		c.ipady=0;
		pane.add(button8,c);
				
		c.gridx = 2;
		c.gridy = 1;
		c.weightx = 0.25;
		c.weighty = 0;
		c.gridwidth =1;
		c.gridheight = 1;
		c.ipadx= 0;
		c.ipady=0;
		pane.add(button9,c);
		
		c.gridx = 3;
		c.gridy = 1;
		c.weightx = 0.25;
		c.weighty = 0;
		c.gridwidth =1;
		c.gridheight = 1;
		c.ipadx= 0;
		c.ipady=0;
		pane.add(buttonPlus,c);
		
		c.gridx = 0;
		c.gridy = 4;
		c.weightx = 0.25;
		c.weighty = 0;
		c.gridwidth =1;
		c.gridheight = 1;
		c.ipadx= 0;
		c.ipady=0;
		pane.add(button0,c);
		
		c.gridx = 1;
		c.gridy = 4;
		c.weightx = 0.25;
		c.weighty = 0;
		c.gridwidth =1;
		c.gridheight = 1;
		c.ipadx= 0;
		c.ipady=0;
		pane.add(buttonCancel,c);
		
		c.gridx = 2;
		c.gridy = 4;
		c.weightx = 0.25;
		c.weighty = 0;
		c.gridwidth =1;
		c.gridheight = 1;
		c.ipadx= 0;
		c.ipady=0;
		pane.add(buttonEquals,c);
		
		c.gridx = 3;
		c.gridy = 4;
		c.weightx = 0.25;
		c.weighty = 0;
		c.gridwidth =1;
		c.gridheight = 1;
		c.ipadx= 0;
		c.ipady=0;
		pane.add(buttonDivide,c);
		
		
		pack();
		setSize(250,225);
		setResizable(false);
		setVisible(true);
		
	}
	
	public static void main(String[] args) 
	
	{
		Calculator app = new Calculator();
	}

}
