//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListTotal
{
	public static int go( List<Integer> ray )
	{
		int total = 0;
for(int i = 0; i < ray.size(); i++)
    total += ray.get(i);
return total;
	}
}