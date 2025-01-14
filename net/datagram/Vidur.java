import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
/*
* @version 1.0 02/26/07
* @author rajiv gupta
*/

public class Vidur extends JFrame implements ActionListener, MenuListener
{  	 
	JDesktopPane jdp;
	Container cp;

	JMenuBar jmb;

	JMenu jFile,jEdit; 
	JMenu jAdd;		
	JMenu jUpdate;
	JMenu jView;
	JMenu jUtility;
	JMenu jHelp;
	    
	JMenuItem jNew , jOpen,jExit;
	JMenuItem jMember,jRes,jTask,jProject,jSearch,jCont;
	JMenuItem jMemup,jResup,jTaskup,jPassup;
	JMenuItem jCal,jRev,jRep;
	JMenuItem jmHelp,jAbout;

   //for tollbar
	JToolBar toolBar	= new JToolBar();
	JPanel northPanel	= new JPanel();   //required for toolbar

	JButton[] toolbarButton=new JButton[5];
	String [] toolbarImages= {"note","open","print","about", "exit"};
	String [] toolbarTip= {"New","Open","Print","About", "Exit"};
  
	Font f = new Font("Times New Roman",Font.BOLD,14);

//	ProjDataEntry pde;
  	//StudMarksEntry sme;
	Dimension screenSize;
	
             

public Vidur()
{

super("-----`------");

jdp=new JDesktopPane();
setContentPane(jdp); //set  the jdp to content pane 
cp=getContentPane();
cp.setLayout(new BorderLayout());  //makes the toolbar visible

//pde=new ProjDataEntry();
//sme=new StudMarksEntry();
//jdp.add(sdet);
//jdp.add(sme);

jmb=new JMenuBar();

 jFile=new JMenu("File"); 
 jEdit=new JMenu("Edit");
 jView=new JMenu("View"); 	
 jUtility=new JMenu("Utilities");  
 jHelp=new JMenu("Help"); 
 jAdd= new JMenu("Add");
 jUpdate= new JMenu("Update");

 //setting  the font of menu's
jFile.setFont(f);
jEdit.setFont(f);
jView.setFont(f);
jUtility.setFont(f);
jHelp.setFont(f);
jAdd.setFont(f);
jUpdate.setFont(f);
//setJMenuBar(mb);
setJMenuBar(menuBar());//ask to sir


//set the layout of the toolbar
northPanel.setLayout(new BorderLayout());  //adding buttons to the toolbar		
addButtons(toolBar);//adding the toolbar to the panel
northPanel.add("North", toolBar);//adding the panel to the contentpane
cp.add("North",northPanel);				


 Toolkit t=Toolkit.getDefaultToolkit();
 Dimension d =t.getScreenSize();	//get the screen width & height	
 int width=d.width;
 int height=Toolkit.getDefaultToolkit().getScreenSize().height;
 setBounds(0, 0, width, height); 
     
 setTitle("VIDUR -- PROJECT MANAGEMENT SYSTEM");       	
       	/*
       	Makes the Window visible. If the Window   	and/or its owner are not yet displayable,
       	both are made displayable. The Window will   	be validated prior to being made visible.
       	If the Window is already visible, this will 	bring the Window to the front.
       	*/
       	show();
     	//add the window listener
WindowListener l=new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
int confirm=JOptionPane.showOptionDialog(null,"Do You Want To exit?","Exit Information",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
			if (confirm==0)
				{
				dispose();
				System.exit(0);
			}	
}
	};
addWindowListener(l);
}

private JMenuBar menuBar(){
    	//Data Menu
		jNew = new JMenuItem("New");
		/*
		Set the key combination which invokes the Menu Item's action listeners without
		navigating the menu hierarchy. It is the		UIs responsibility to do install the correct action.
		*/
		jNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
		//add the action listener
		jNew.addActionListener(this);
		//add this menuitem to the Algo Menu
		jFile.add(jNew);	

		jOpen = new JMenuItem("Open");
		jOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        jOpen.setHorizontalTextPosition(JMenuItem.RIGHT);
        jOpen.setFont(f);

		jOpen.addActionListener(this);
       //jOpen.setBorder(new BevelBorder(BevelBorder.RAISED));  //looks good
		jFile.add(jOpen);	
       //j.setBorder(new BevelBorder(BevelBorder.RAISED));  //looks good

		jFile.addSeparator();

  jExit = new JMenuItem("Exit");
		jExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
		jExit.setFont(f);
		jExit.addActionListener(this);
		jFile.add(jExit);	
//************************************
 jEdit.add(jAdd);
 jEdit.add(jUpdate);

jMember = new JMenuItem("Member");
		//jMember.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.ALT_MASK));
		jMember.addActionListener(this);
		jMember.setFont(f);
		jAdd.add(jMember);	

jRes = new JMenuItem("Resource");
		//jRes.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.ALT_MASK));
		jRes.addActionListener(this);
		jRes.setFont(f);
		jAdd.add(jRes);
		
jTask = new JMenuItem("Task");
		//jTask.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.ALT_MASK));
		jTask.addActionListener(this);
		jTask.setFont(f);
		jAdd.add(jTask);
		


jMemup = new JMenuItem("Member");
		//jMemup.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.ALT_MASK));
		jMemup.addActionListener(this);
		jMemup.setFont(f);
		jUpdate.add(jMemup);	

jResup = new JMenuItem("Resource");
		//jResup.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.ALT_MASK));
		jResup.addActionListener(this);
		jResup.setFont(f);
		jUpdate.add(jResup);
		
jTaskup = new JMenuItem("Task");
		//jTaskup.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.ALT_MASK));
		jTaskup.addActionListener(this);
		jTaskup.setFont(f);
		jUpdate.add(jTaskup);

jPassup = new JMenuItem("Password");
        jPassup.addActionListener(this);
		jPassup.setFont(f);
		jUpdate.add(jPassup);
/*******************************************************************************/

  jProject = new JMenuItem("Project");
		//jmiReport.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.ALT_MASK));
		jProject.addActionListener(this);
		jProject.setFont(f);
		jView.add(jProject);
		
 jSearch = new JMenuItem("Search");
		//jmiPrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.ALT_MASK));
		jSearch.addActionListener(this);
		jSearch.setFont(f);
		jView.add(jSearch);	

jCont = new JMenuItem("Contacts");
		//jmiPrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.ALT_MASK));
		jCont.addActionListener(this);
		jCont.setFont(f);
		jView.add(jCont);
//*************************************************************

jCal = new JMenuItem("Calender");
		jCal.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.ALT_MASK));
		jCal.addActionListener(this);
		jCal.setFont(f);
		jUtility.add(jCal);	
		jUtility.addSeparator();

jRev = new JMenuItem("Review");
		jRev.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
		jRev.addActionListener(this);
		jRev.setFont(f);
		jUtility.add(jRev);	

jRep = new JMenuItem("Report");
		jRep.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.ALT_MASK));
		jRep.addActionListener(this);
		jRep.setFont(f);
		jUtility.add(jRep);	

//*********************************************************

jmHelp = new JMenuItem("Help");
		//jmiHelp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.ALT_MASK));
		jmHelp.addActionListener(this);
		jmHelp.setFont(f);
		jHelp.add(jmHelp);
		
jAbout = new JMenuItem("About");
		//jmiAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
		jAbout.addActionListener(this);
		jAbout.setFont(f);
		jHelp.add(jAbout);	
/********************************************/

        jEdit.add(jAdd);
        jEdit.add(jUpdate);

		jmb.add(jFile); 
		jmb.add(jEdit); 	
		jmb.add(jView);
		jmb.add(jUtility);
		jmb.add(jHelp);
		return jmb;
	}
	
void addButtons(JToolBar toolBar) 
		{
        for (int i=0;i<toolbarButton.length;i++)
			{
        	toolbarButton[i] = new JButton(new ImageIcon("images/"+toolbarImages[i]+".gif"));
	        toolbarButton[i].setToolTipText(toolbarTip[i]);
	        toolbarButton[i].addActionListener(this);
	    		toolBar.add(toolbarButton[i]);
	     }        
    }

	public void actionPerformed(ActionEvent e)
		{
    	if ((e.getSource()== jNew)||(e.getSource()==toolbarButton[0]))
			{
//			Student_Details std=new Student_Details();	
//  Personal_Details std = new Personal_Details();
		//	jdp.add(std);	
		//	jdp.moveToFront(std);
		//jdp.remove(jdp.getSelectedFrame());
//);
		jdp.getSelectedFrame().setVisible(false);
		}
			
		else if ((e.getSource()==jOpen)||(e.getSource()==toolbarButton[1]))
			{
		//	projscreen smd=new projscreen();	
		//	jdp.add(smd);	
			//jdp.moveToFront(smd);
			}

       
	   // Opening Screen Link

	   else if ((e.getSource()==jNew)||(e.getSource()==toolbarButton[1]))
			{
                 
			//Marks_Details smd=new Marks_Details();	
		//	jdp.add(smd);	
		///	jdp.moveToFront(smd);

			}



		else if ((e.getSource()== jExit)||(e.getSource()==toolbarButton[4]))
			{
int confirm=JOptionPane.showOptionDialog(null,"Do You Want To exit?","Exit Information",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
			if (confirm==0)
				{
				dispose();
				System.exit(0);
			}	
		}
//----------------------------------
//		else if ((e.getSource()== jmiPrint)||(e.getSource()==toolbarButton[3]))//***********
			;		
		/*
		else if(e.getSource()==jmiCalc)
			{
	    Container contentPane = calci.getContentPane();
	contentPane.setLayout(new BorderLayout());
		calci.setTitle("Calculator");
		calci.setSize(241, 217);
		calci.pack();
		calci.setLocation(400, 250);
		calci.setVisible(true);
		calci.setResizable(false);

			}//end of elseif

else if(e.getSource()==jmiCal)
			{
			System.out.print("in cal");
			 TableFromDatabase td=new TableFromDatabase();
			  jdp.add(td);	
			  jdp.moveToFront(td);
			System.out.print("out of  cal");
		     }
	*/
		/* if(e.getSource()==jmiThought)
			{
			System.out.println("11111"); 
		JOptionPane.showMessageDialog(null,""+new JOptionMessage().getMessage(), "Thought for Today",JOptionPane.PLAIN_MESSAGE);
			}
		else if(e.getSource()==jmiAbout )//|| e.getSource()==toolbarButton[3]) //********
			{
				System.out.println("Before about"); 
				new About(null);
			//	jdp.moveToFront(About);
				System.out.println("after about");
			}

		else if(e.getSource()==jHelp)	
			{
			new Help(this);
			}
			
		//else if(e.getSource()==jmiWeb )
		//	{}
		*/
	}




/*
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
System.out.println(str);
if(str.equals("Exit"))
{
System.exit(0);
}

if(str.equals("StudentDataEntry"))
{

jdp.add(sde);
sde.setSize(screenSize);
sde.setOpaque(true);
sde.setVisible(true);
sde.setClosable(true);
sde.setMaximizable(true);
sde.setResizable(false);
sde.setTitle("StudentDataEntry");
//sde.setBackground(c1);

}

if(str.equals("StudentMarksEntry"))
{

jdp.add(sme);
sme.setSize(screenSize);
sme.setOpaque(true);
sme.setVisible(true);
sme.setClosable(true);
sme.setMaximizable(true);
sme.setResizable(false);
sme.setTitle("Student Marks Entry");
//sme.setBackground(c1);

}

}
*/


public void menuSelected(MenuEvent e){	}

public void menuDeselected(MenuEvent e){	}

public void menuCanceled(MenuEvent e){  }
	




public static void main(String args[])
{
//new SplashScreen();
Vidur mft=new Vidur();
//LoginDialog dlg=new LoginDialog(null);

/*Toolkit t=Toolkit.getDefaultToolkit();
 Dimension d =t.getScreenSize();	//get the screen width & height	
 int width=d.width;
 int height=Toolkit.getDefaultToolkit().getScreenSize().height;
dlg.setBounds(200,200, width, height); 
System.out.println(width);
System.out.println(height);
*/


//if(!dlg.succeeded())
		//	{
		//		System.out.println("User Cancelled Login");
		//		System.exit(1);
		//	
		//	}
			//System.out.println("user "+dlg.getLoginName()+" has Logged in");
			
}		
} 
                