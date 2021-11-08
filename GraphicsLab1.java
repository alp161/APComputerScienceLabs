// GraphicsLab1
// The AWT Graphics Program
// This is the student, starting version of GraphicsLab1


import java.awt.*;
import javax.swing.*;

public class GraphicsLab1
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
		setSize(1000, 800);
		setVisible(true); //it's like calling the repaint method.
	}
	
	public void paintComponent(Graphics g)
	{
		// DRAW CUBE
g.drawRect(75, 50, 150, 150);
g.drawRect(125, 100, 150, 150);
g.drawLine(75, 50, 125, 100);
g.drawLine(225, 50, 275, 100);
g.drawLine(75,  200,  125,  250);
g.drawLine(225,  200,  275,  250);

		// DRAW SPHERE
g.drawOval(100, 75, 150, 150);
g.drawArc(120, 75, 130, 150, 90, 181);
g.drawArc(100, 75, 130, 150, 270, 181);
g.drawArc(135, 75, 90, 150, 90, 181);
g.drawArc(125, 75, 90, 150, 270, 181);
g.drawArc(160, 75, 30, 150, 90, 181);
g.drawArc(160, 75, 30, 150, 270, 181);
g.drawArc(100, 90, 150, 140, 0, 181);
g.drawArc(100, 70, 150, 140, 180, 181);
g.drawArc(100, 105, 150, 100, 0,181);
g.drawArc(100, 95, 150, 100, 180, 181);
g.drawArc(100, 125, 150, 60, 0, 181);
g.drawArc(100, 115, 150, 60, 180, 181);


		// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
g.drawOval(675, 300, 200, 200);
g.drawLine(775, 300, 675, 400);
g.drawLine(775, 300, 840, 475);
g.drawLine(675, 400, 840, 475);
g.drawOval(709, 338, 94, 94);


		// DRAW APCS
//A
g.fillRect(40, 375, 25, 125);
g.fillRect(40, 375, 75, 25);
g.fillRect(40, 425, 75, 25);
g.fillRect(90, 375, 25, 125);
//P
g.fillRect(140, 375, 75, 25);
g.fillRect(140, 375, 25, 125);
g.fillRect(190, 375, 25, 70);
g.fillRect(165, 420, 25, 25);

//C
g.fillRect(260, 375, 55, 25);
g.fillRect(260, 475, 55, 25);
g.fillRect(240, 375, 25, 125);

//S
g.fillRect(340, 375, 75, 25);
g.fillRect(340, 375, 25, 75);
g.fillRect(340, 430, 75, 25);
g.fillRect(390, 450, 25, 45);
g.fillRect(340, 480, 75, 25);

		// DRAW PACMEN FLOWER
g.fillArc(475, 350, 75, 75, 135, 270);
g.fillArc(425, 400, 75, 75, 225, 270);
g.fillArc(475, 450, 75, 75, 315, 270);
g.fillArc(525, 400, 75, 75, 45, 270);
	}
}
