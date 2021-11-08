import java.util.ArrayList;
import java.util.List;


public class ListOddToEven
{
	public static int go( List<Integer> ray)
	{
		int g = 0;
      int a = 0;
      int y;
		for (g = 0; g < ray.size(); g++)
		{
			if (ray.get(g)%2 != 0)
			{
				for (a = ray.size() - 1; a > 0; a--)
				{
					if (ray.get(a)%2 == 0)
					{
                   y = a - g;
						return a - g;
					}
				}
			}
		}
		return -1 ;
	}
}