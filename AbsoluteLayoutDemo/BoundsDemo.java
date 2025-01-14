import java.awt.*;

class BoundsDemo extends Frame
{
	Label rn,nm,ad,cn;
	TextField trn,tnm,tad,tcn;
	Button b;

	BoundsDemo()
	{
		setLayout(null);

		rn=new Label("Roll No:");
		rn.setBounds(100,100,100,20);

		trn=new TextField(20);
		trn.setBounds(150,100,200,20);

		nm=new Label("Name");
		nm.setBounds(100,150,100,20);

		tnm=new TextField(20);
		tnm.setBounds(150,150,200,20);

		ad=new Label("Address");
		ad.setBounds(100,200,100,20);

		tad=new TextField(20);
		tad.setBounds(150,200,200,20);

		cn=new Label("Contact No. ");
		cn.setBounds(100,250,100,20);

		tcn=new TextField(20);
		tcn.setBounds(150,250,200,20);

		b=new Button("Submit");
		b.setBounds(130,300,100,20);




		add(rn);
		add(trn);
		add(nm);
		add(tnm);
		add(ad);
		add(tad);
		add(cn);
		add(tcn);
		add(b);

		setSize(700,700);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		new BoundsDemo();
	}
}
