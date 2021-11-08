//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

public class Line
{
	private int xOne;
   private int yOne;
   private int xTwo;
   private int yTwo;
	private double slope;

	public Line(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1,y1,x2,y2);
		
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{

		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;

	}

	public void calculateSlope( )
	{

		slope = ((double)yTwo - (double)yOne) / ((double)xTwo - (double)xOne); 

	}

	public void print( )
	{
		System.out.println("The slope is " + slope);


	}
}