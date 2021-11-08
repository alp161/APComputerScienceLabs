
// Java0410.java
// This program uses the <drawArc> and <fillArcs> methods.
// Method <drawArc(X,Y,Width,Height,Start,Degrees)> uses the first four
// parameters in the same manner as the <drawOval> method.  Start is the
// degree value of the arc-start and Degrees is the number of degrees the arc travels.
// Start (0 degrees) is at 3:00 o'clock and positive degrees travel counter-clockwise.


import java.awt.*;
import javax.swing.*;


public class Java0410a
{
	public static void main(String...args)
	{
		JFrame j = new JFrame();  //JFrame is the window; window is a depricated class
		MyPanel m = new MyPanel();
		j.setSize(m.getSize());
		j.add(m); //adds the panel to the frame so that the picture will be drawn
			      //use setContentPane() sometimes works better then just add b/c of greater efficiency.

		j.setVisible(true); //allows the frame to be shown.

		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the dialog box exit when you click the "x" button.
	}

}

class MyPanel extends JPanel 
{
	MyPanel()
	{
		setSize(800, 600);
		setVisible(true); //it's like calling the repaint method.
	}
	
	public void paintComponent(Graphics g)
	{
    	g.drawArc(50,50,100,100,0,180);
		g.fillArc(200,50,100,100,0,270);
		g.drawArc(350,50,100,100,0,360);
		g.fillArc(500,50,100,100,0,-180);

		g.drawArc(50,250,100,200,0,180);
		g.fillArc(200,250,100,200,0,270);
		g.drawArc(350,250,200,100,0,360);
		g.fillArc(350,400,200,100,0,-180);
	
	}
}