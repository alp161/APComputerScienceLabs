//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class BoxRunner
{
   public static void main( String args[] )
   {
      Box test = new Box(3);
      System.out.print(test);
      System.out.println();
      test.setSize(4);
      System.out.print(test);
      System.out.println();
      test.setSize(5);
      System.out.print(test);
      System.out.println();
      test.setSize(2);
      System.out.print(test);
      System.out.println();
      test.setSize(1);
      System.out.print(test);
	}
}