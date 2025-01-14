/**
*Developed under jdk1.5
*/
import javax.swing.*;
import java.awt.*;
class TestGridBagLayout extends JFrame
{
	TestGridBagLayout()
	{
		/**
		*	this line would have been
		*	getContentPane().setLayout(new GridBagLayout());	
		*	if it were any version prior to jdk1.5
		*/
		setLayout(new GridBagLayout());
		

		JButton jb1=new JButton("one");
		JButton jb2=new JButton("two");
		JButton jb3=new JButton("three");
		JButton jb4=new JButton("four");
		JButton jb5=new JButton("five");
		JButton jb6=new JButton("six");

		GridBagConstraints gbc=new GridBagConstraints();

		gbc.gridx=0;
		gbc.gridy=0;
		/**
		*	this line would have been
		*	getContentPane().add(jb1,gbc);	
		*	if it were any version prior to jdk1.5
		*/
		add(jb1,gbc);

		gbc.gridx=1;
		gbc.gridy=0;
		/**
		* unless u specify horizontal, the component will occupy 2 grids but will not fill the space
		* as in jb6
		*/
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridwidth=2;
		add(jb2,gbc);

		/**
		*GridBagLayout honors preferred size since three is the biggest component
		* in this grid(x=0) the width of the grid is that of jb3
		*/
		gbc.fill=GridBagConstraints.NONE;		
		gbc.gridwidth=1;
		gbc.gridx=0;
		gbc.gridy=1;
		add(jb3,gbc);
		
		gbc.gridx=1;
		gbc.gridy=1;
		add(jb4,gbc);

		gbc.gridx=2;
		gbc.gridy=1;
		gbc.fill=GridBagConstraints.VERTICAL;
		gbc.gridheight=2;
		add(jb5,gbc);

		gbc.fill=GridBagConstraints.NONE;		
		gbc.gridheight=1;
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=2;
		add(jb6,gbc);

		setSize(300,300);
		show();
	}
	public static void main(String args[])
	{
		new TestGridBagLayout();
	}
}