//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleFour
{
	public static String go( int size, String let )
	{
		String output="";
		for (int i = size; i > 0; i --) {
			for (int spaces = 0; spaces < size - i; spaces++) {
				output += " ";
			}
			for (int character = i; character > 0; character--) {
				output += let;
			}
			output += "\n";
		}
		return output+"\n";
	}
}