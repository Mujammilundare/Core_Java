import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import javax.swing.text.*; 
import java.awt.event.*;


class GuiChatClient extends JFrame
	{
			private JTextArea jtxa;
			private JTextField jtxf;
			private JButton jbtnsend,jbtnclose;
			private JScrollPane jsp;
			String s="";
			Socket socket;
			DataInputStream dis;
			DataOutputStream dos;
			BufferedReader buf;
			PrintWriter pw;

	public GuiChatClient()
		{
		super("Client ..........");
		setSize(500,500);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setCursor(Cursor.DEFAULT_CURSOR);
	
		

		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

		jtxa=new JTextArea(15,18);
		jtxa.setEditable(false);
		jsp=new JScrollPane(jtxa,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED );
		jsp.setBounds(30,20,400,250);
		
		add(jsp);
		
		jbtnsend=new JButton("Send");
		jbtnsend.setBounds(30,400,100,30);
		add(jbtnsend);
		jbtnsend.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent ae)
		{
			try
			{
			pw.println(jtxf.getText());
			jtxa.append("\nClient::"+jtxf.getText());
			jtxf.setText("");
			}
			catch (Exception e)
			{
			}
			
		}
		});
		

		jbtnclose=new JButton("Close");
		jbtnclose.setBounds(200,400,100,30);
		add(jbtnclose);
		jbtnclose.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent ae)
		{
			try
			{
			System.exit(0);
			}
			catch (Exception e)
			{
			}
			
		}
		});

		jtxf=new JTextField ();
		jtxf.setBounds(30,300,400,60);
		add(jtxf);


		

			Toolkit tk= Toolkit.getDefaultToolkit();
			Dimension d=tk.getScreenSize();
			setLocation(d.width/2-250,d.height/2-250);
			setVisible(true);
	}
	

	public void connect() throws Exception
	{
		try
		{
			socket =new Socket(InetAddress.getLocalHost(),2000);
		System.out.println("Request sent....");
	
		buf=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(socket.getOutputStream(),true);	
			talk();
		}
		catch (Exception e)
			{
				System.out.println(e);
			}
	
		
	}

	public void talk()
	{
		
		while(true)
		{
			try
			{
				String s=buf.readLine();
				jtxa.append("\nServer says::"+s+"\n");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		
	}


	public static void main(String args[])
	{
		try
		{

		GuiChatClient cc=new GuiChatClient();
		cc.connect();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}