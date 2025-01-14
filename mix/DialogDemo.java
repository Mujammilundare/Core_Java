import java.awt.*;
import java.awt.event.*;

 class DialogDemo extends Frame
   {
    Button b;
	TextField tf;
    DialogDemo()
     {
      setLayout(new FlowLayout());
       b=new Button("open");
	   tf=new TextField(20);
	   add(tf);
	   add(b);
       b.addActionListener(new Inner1());
	setSize(400,400);
	show();
       }

	   class Inner1  implements ActionListener
	   {
		    public void actionPerformed(ActionEvent e)
				{
				Inner obj=new Inner();
				obj.setSize(200,100);
				obj.show();
				}
	   }     

       class Inner extends Dialog implements ActionListener
         {
		TextField t;
		Button b1,b2;
		Inner()
		{
		super(new Frame(),"MyDialog",true);
		setLayout(new FlowLayout());
		t=new TextField(10);
		b1=new Button("Ok");
		b2=new Button("Close");
		add(t); add(b1); add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		}

		public void actionPerformed(ActionEvent e)
		 {
			if(e.getSource()==b1)
			 {String s=t.getText();
			  tf.setText(s);
			 }
			  else
			   this.dispose();
		 }
		  }


		  public static void main(String args[])
		   {
		    new DialogDemo();
		    }
		    }
	

     