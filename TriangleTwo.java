//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

public class TriangleTwo
{
	public static String go( int size, String let )
	{
   String output = "";
   for (int i = size; i >= 1; i--)
{ 
     output += "\n";
    for (int c = 1; c <= i; c++)
        {
         output += let;
         } 
		}
		return output;
	}
}