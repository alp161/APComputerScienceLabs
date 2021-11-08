public class alp1
 {
  private int xOne;
  private int yOne;
  private int xTwo;
  private int yTwo;
  private double slope;

 public alp1(int x1, int y1, int x2, int y2)
 {
   xOne = x1;
   yOne = y1;
   xTwo = x2;
   yTwo = y2; 

 }

 public void setCoordinates(int x1, int y1, int x2, int y2)
 {
  xOne = (int) x1;
  yOne = (int) y1;
  xTwo = (int) x2; 
  yTwo = (int) y2;

 }

public void calculateSlope( )
{
   slope = (yTwo - yOne) / (xTwo - xOne); 


}

public void print( )
{

    System.out.println( "The slope is " + slope); 

  }
}