//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(letter);
		setAmount(amount);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		int amtPlacer = amount;
		for (int x = 0; x<amtPlacer; x++ ) 
		{
			amount = amtPlacer-x;
			char letterPlacer = letter;
			while (amount > 0 ) 
			{
				for (int y = amount+x; y>0; y-- ) 
				{
					output = output + letterPlacer;
				}
				output = output + " ";
				amount = amount - 1;
				if (letterPlacer == 'Z') 
				{
					letterPlacer = 'A';
				} 
				else 
				{
					letterPlacer = (char) (letterPlacer + 1);
				}
				
			}
			output = output + "\n";
			
		}
		
	
		return output;
	}
}