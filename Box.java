//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Box
{
	 private int size;

	public Box()
	{
    setSize(0);
	}

	public Box(int count)
	{
    setSize(count);
	}

	public void setSize(int count)
	{
    size = count;
	}

	public String toString()
	{
		String output="";

      for(int x = 1; x<=size; x++)
      {
         for(int y=x; y<=size; y++ )
          output = output + "*";
         for(int z=x; z>0; z--)
          output = output + "#";
          output = output + "\n";
      }
		return output;
	}
   
   }