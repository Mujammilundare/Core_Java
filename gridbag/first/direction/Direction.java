import java.awt.*;

public class Direction extends Frame 
	{ 
    Button btn1, btn2, btn3, btn4, btn5, btn6;
    GridBagLayout gb;   
    GridBagConstraints gbc;

   
    void makeButtons() {
	btn1 = new Button("Button 1"); add(btn1);
	btn2 = new Button("Button 2"); add(btn2);
	btn3 = new Button("Button 3"); add(btn3);
	btn4 = new Button("Button 4"); add(btn4);
	btn5 = new Button("Button 5"); add(btn5);
	btn6 = new Button("Button 6"); add(btn6);
    }

    public Direction()
    {
	gb = new GridBagLayout();
	setLayout(gb);
	gbc = new GridBagConstraints();

	makeButtons();

	// use defaults for btn1
	gb.setConstraints(btn1, gbc);

	// btn2 below btn1
	gbc.gridx = 0; // gridy is still RELATIVE
	gb.setConstraints(btn2, gbc);

	// btn3 below of btn2 - reuse constraint
	gb.setConstraints(btn3, gbc);

	// btn4 right of btn2
	gbc.gridx = GridBagConstraints.RELATIVE;
	gbc.gridy = 1;
	gb.setConstraints(btn4, gbc);

	// btn5 right of btn4
	gbc.gridx = GridBagConstraints.RELATIVE;
	gbc.gridy = 2;
	gb.setConstraints(btn5, gbc);

	// btn6 down and to right of btn5
	gbc.gridx = 2;
	gbc.gridy = 3;
	gb.setConstraints(btn6, gbc);

	resize(400, 200);
    }

	 public static void main(String argv[])
    {
	 new Direction().show();
    }

}

