// Java0408.java
// This program introduces the rectangle command.  A rectangle is drawn from
// the top-left (X,Y) coordinate of a rectangle followed by Width and Height using
// <drawRect(X,Y,Width,Height)>.
// The <fillRect> command draws a rectangle filled with solid pixels.


import java.awt.*;
import javax.swing.*;


public class Java0408a
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
		g.drawRect(50,50,100,100);
		g.drawRect(300,50,300,150);
		g.fillRect(50,400,100,100);
		g.fillRect(300,400,300,150);
	}
}