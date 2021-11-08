import java.util.*;
import java.util.Random;
import java.util.ArrayList;

// if 10 is smaller than one of the numbers in the arraylist delete the number and if it is smaller than one of the numbers in the arraylist than add count by one 
public class List1
{
   public static void main(String[] args)
   {
   Random rn = new Random();
   int answer = rn.nextInt(10) + 1;
   String letter = "";
   int count = 0;
   int c = 0;
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(5);
    myNumbers.add(12);
    
    ArrayList<String>  myLetters = new ArrayList<String>();

    myLetters.add("Youtube");
    myLetters.add("Facebook");
    myLetters.add("Instagaram");
    myLetters.add("Tiktok");
    myLetters.add("Telogram");
    myLetters.add("Text");

    
       for(int i = myNumbers.size() - 1; i >= 0; i--)
       {
         if(10  < myNumbers.get(i) )
         {
           myNumbers.remove(i);
         }
         else if(10 == myNumbers.get(i))
         {
           c = 10;
         }
         else{ 
         count++;
         System.out.println(count);
         System.out.println();
         } 
       }
       for(int l = myLetters.size() - 1; l >= 0; l--)
       {
      if(answer == 10)
      {
       letter = myLetters.get(5);
      }
      else{
      letter = "UNKNOWN";
      }
    }
    System.out.println("The numbers less than 10 = " + myNumbers); 
     System.out.println("The social media is " +  letter); 
  }
}