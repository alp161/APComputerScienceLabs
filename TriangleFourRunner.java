//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleFourRunner
{
   public static void main( String args[] )
   {
   int big = 3;
   int big2 = 4;
   int big3 = 5;
   int big4 = 2;
   int big5 = 1;
   String value = "R";
   String value2 = "B";
   String value3 = "X";
   String value4 = "E";
   String value5 = "T";
   System.out.println( TriangleFour.go( big, value ) );
   System.out.println( TriangleFour.go( big2, value2 ) );
   System.out.println( TriangleFour.go( big3, value3 ) );
   System.out.println( TriangleFour.go( big4, value4 ) );
   System.out.println( TriangleFour.go( big5, value5 ) );
   }
}