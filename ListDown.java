import java.util.*;
import java.util.ArrayList;

public class ListDown
{
   public static boolean go( List<Integer > numArray )
   {
       for(int i = 1; i < numArray.size(); i++)
       {
         if(numArray.get(i) > numArray.get(i-1))
         {
         return false;
         }
       }
     return true;
    }
} 