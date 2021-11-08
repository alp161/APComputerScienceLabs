//(c) A+ Computer Science
//www.apluscompsci.com

public class GermRunner
{
	public static void main( String[] args )
	{
    Germs d = new Germs( "germs" );
   System.out.println( d.GermNumbers( 7 ) );
   d.increasenumber();
   d.increasenumber();
   System.out.println( d.GermNumbers( 11 ) );
   System.out.println( d.getName() );
   d.increasenumber();
   d.increasenumber();
   d.increasenumber();
   d.increasenumber();
   System.out.println( d. GermNumbers( 8 ) );
   Germs g = new Germs( "number of germs", 3 );
   System.out.println( g.getName() );
   System.out.println( g. GermNumbers( 5 ) );

		//add test cases	
		//use the examples on the lab handout			
	}
}