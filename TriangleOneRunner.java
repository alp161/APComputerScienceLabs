//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleOneRunner
{
	public static void main( String args[] )
   {
   	Scanner keyboard = new Scanner(System.in);
   	String choice="";
      String myStr1 = "Yes";
      String myStr2 = "yes";
      String myStr3 = "No";
      String myStr4 = "no";
      int i = 0; 
		do{
			out.print("Enter the size of the triangle : ");
			int big = keyboard.nextInt();
			out.print("Enter a letter : ");
			String value = keyboard.next();

				//static methods can be called using the class name
			System.out.println( TriangleOne.go( value, big ) );
        while(i == 0)
        {
			System.out.print("Do you want to enter more data? ");
			choice=keyboard.next();
         if(choice.equals(myStr1) || choice.equals(myStr2))
         {
         out.print("Enter the size of the triangle : ");
			int big1 = keyboard.nextInt();
			out.print("Enter a letter : ");
			String value1 = keyboard.next();
         System.out.println( TriangleOne.go( value1, big1 ) );
         }
         else if(choice.equals(myStr3)||choice.equals(myStr4))
         {
         break;
          }
          }
		}while(choice.equals("Y")||choice.equals("y"));
	}
}