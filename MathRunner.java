//(c) A+ Computer Science
//www.apluscompsci.com
import java. util. Scanner; 
public class MathRunner
{
	public static void main( String[] args )
	{
   String myStr1 = "total";
   String myStr2 = "avreage";
   Scanner myObj = new Scanner(System. in);
   System.out.println("What are you looking for total or avreage :");
   String string = myObj.nextLine();
   System.out.println("Enter first:");
   int Int1 = myObj.nextInt(); 
   System.out.println("Enter second:");
   int Int2 = myObj.nextInt(); 
   Math d = new Math(Int1,Int2);
   if(string.equals(myStr1))
   {
    System.out.println( d.total( Int1 ,Int2 ) );
   }
   else if(string.equals(myStr2))
   {
   System.out.println( d.getavg() );
   }
  

		//add test cases	
		//use the examples on the lab handout			
	}
}