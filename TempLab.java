import java.util.Scanner;


public class TempLab
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("OK, mate, what's the temperature outside? ");
		int temp = in.nextInt();
		
		// write the code to complete the lab 
		
		 if ( temp > -21 && temp < 111  )
        {
           System.out.println ( "Looks good for...");
           sports( temp );
        }
        else //check for appropriate input 
        {
           System.out.println ( "I'm sorry, sports can't be played at that temperature." );
        }
    } 


 // sports
 //This method takes the temperature as a paramater
 //and uses testing if statements to determine
 // the best sport for that temperature.

    static  void sports ( int temp )
    {
        if ( temp >= 75)
        {
           System.out.println ("Swimming");
        }
        if ( temp > 60 && temp <= 85 )
        {
           System.out.println( "Tennis");
        }
        if ( temp > 32 && temp <= 70 )
        {
           System.out.println ( "Soccer");
        }
        if( temp > 10 && temp <=32 )
        {
           System.out.println ( "Skiing" );
        }
        if (temp <= 10 )
        {
           System.out.println ( "Checkers");
        }  
      
	}
}



