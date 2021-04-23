//Evan White

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloSwing extends JFrame implements ActionListener
{
	private JPanel pane; //declare panel variable
	private JButton button; //declare button variable
	private JLabel label; //declare label variable
	
	private String labelMessage = "Number of button clicks: ";
	private int numClicks = 0;
	
	public static void main(String[] args) 
	{	
		JFrame frame = new HelloSwing(); //instance of HelloSwing class
		frame.setPreferredSize(new Dimension(600, 400));
		
		frame.pack();
		frame.setVisible(true);
		
		WindowListener w = new WindowAdapter()
		  {
		    public void windowClosing(WindowEvent e)
		    {
		       System.exit(0);
		    }
		  };
		frame.addWindowListener(w);
	}
	
	HelloSwing()
	{
		//construct components
		button = new JButton("Click Me");
		label = new JLabel (labelMessage + "0 ");
		
		//construct JPanel component
		pane = new JPanel();                       // Top, left, bottom, right
		pane.setBorder(BorderFactory.createMatteBorder(25, 25, 25, 25, Color.CYAN));
		pane.setLayout(new GridLayout(2, 1));
		
		//add the two components to JPanel
		pane.add(button);
		pane.add(label);
		
		//set JPanel to be the content pane
		setContentPane(pane);
		button.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		numClicks++;
		label.setText (labelMessage + numClicks);
	}

}
