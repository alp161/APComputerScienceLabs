import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go( List<Integer> ray)
	{
      int first = ray.get(0);
		int sum = 0;
		for (int i = 0; i < ray.size(); i++)
		{
			if (ray.get(i) > first)
			{
				sum += ray.get(i);
			}
		}
		if(sum == 0)
      {
      return -1;
      }
      else 
      {
      return sum;
      }
      
	}
}