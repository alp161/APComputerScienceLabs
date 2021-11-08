//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleThreeRunner
{
   public static void main( String args[] )
   {
   int i;
   int big = 3;
   int big2 = 7;
   int big3 = 1;
   int big4 = 5;
   int big5 = 4;
   String value = "A";
   String value2 = "X";
   String value3 = "R";
   String value4 = "T";
   String value5 = "W";
   System.out.println( TriangleThree.go( big, value ) );
   System.out.println( TriangleThree.go( big2, value2 ) );
   System.out.println( TriangleThree.go( big3, value3 ) );
   System.out.println( TriangleThree.go( big4, value4 ) );
   System.out.println( TriangleThree.go( big5, value5 ) );
   }
}