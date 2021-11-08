//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

public class LineRunner
 {
 public static void main( String[] args )
  {
   //add test cases		
		Line line1 = new Line(2,8,12,3);
		line1.setCoordinates(3,7,12,4);
		line1.calculateSlope();
		line1.print();
		
		Line line2 = new Line(3,5,12,12);
		line2.setCoordinates(3, 4, 13, 3);
		line2.calculateSlope();
		line2.print();
		
		Line line3 = new Line(6,4,2,4);
		line3.setCoordinates(4,3,2,2);
		line3.calculateSlope();
		line3.print();
		
		Line line4 = new Line(2,12,5,4);
		line4.setCoordinates(2,6,6,3);
		line4.calculateSlope();
		line4.print();
		
		Line line5 = new Line(11,11,23,91);
		line5.setCoordinates(12,11,21,93);
		line5.calculateSlope();
		line5.print();
  }
}