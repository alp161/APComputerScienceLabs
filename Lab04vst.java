// Lab04vst.java
// Student version of the Lab04 assignment.


import java.awt.*;
import javax.swing.*;

public class Lab04vst
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
	
	public void paint(Graphics g) {
		int width = 980;
		int height = 630;
      
      this.setSize(1000, 650);

		g.drawRect(10, 10, width, height);
      g.drawRect(200, 200, 600, 250);
   
      // Big Top Left
      int x1 = 990;
      int y1 = 10;
      int x2 = 10;
      int y2 = 10;
      
      for (int k = 1; k < 47; k++) {
         g.drawLine(x1, y1, x2, y2);
         y2 += 12;// our hight from the rectangle 
     // our width from the rectangle
         x1 -= 20;
	   }
      
      // Big Top Right
      x1 = 10;
      y1 = 10;
      x2 = 990;
      y2 = 10;
      
      for (int k = 1; k < 47; k++) {
         g.drawLine(x1, y1, x2, y2);
         y2 += 12;// our hight from the rectangle 
     // our width from the rectangle
         x1 += 20;
	   }
      
      // Big Bottom Left
      x1 = 990;
      y1 = 640;
      x2 = 10;
      y2 = 640;
      
      for (int k = 1; k < 47; k++) {
         g.drawLine(x1, y1, x2, y2);
         y2 -= 12;// our hight from the rectangle 
     // our width from the rectangle
         x1 -= 20;
	   }
      
      // Big Bottom Right
      x1 = 10;
      y1 = 640;
      x2 = 990;
      y2 = 640;
      
      for (int k = 1; k < 47; k++) {
         g.drawLine(x1, y1, x2, y2);
         y2 -= 12;// our hight from the rectangle 
          x1 += 20; // our width from the rectangle
	   }
   }
   }
