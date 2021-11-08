// Lab32ast.java
// The student version of the Lab32a assignment.


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab32ast
{
    public static void main(String args[])
    {
        Windows win = new Windows();
        win.setSize(1000,750);
        win.addWindowListener(new WindowAdapter() {public void
        windowClosing(WindowEvent e) {System.exit(0);}});
        win.show();
        Graphics g= win.getGraphics();
        win.drawSquare(g);
          g.drawRect(75, 50, 150, 150);
        g.drawRect(125, 100, 150, 150);
        g.drawLine(75, 50, 125, 100);
        g.drawLine(225, 50, 275, 100);
        g.drawLine(75,  200,  125,  250);
        g.drawLine(225,  200,  275,  250);
    }
}


class Windows extends Frame
{

    public void drawSquare(Graphics g)
    {
      
    }


}