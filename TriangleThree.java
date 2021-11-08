//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleThree
{
	public static String go( int size, String let )
	{
	String output = "";

		for (int i = 1; i <= size; i++) {
			for (int j = size - 1; j >= i; j--) {
				output += " ";
			}

			for (int j = i - 1; j >= 0; j--) {
				output += let;
			}

			output += "\n";
		}

		return output + "\n";
	}
}