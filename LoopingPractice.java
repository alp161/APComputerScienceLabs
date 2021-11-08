public class LoopingPractice
{
   public static void main (String [] args)
   {
   int loopVal;
   int end_value = 50;
   int addition = 0; 
   int n = 1; 
   for(n=1; n<= 4; n++) 
   {
   System.out.println("Alp"); 
   
   }  
  while(n<10)
  {
  System.out.println("Bayrak"); 
  n++;
  }
   for(loopVal = 10; loopVal <= end_value; loopVal+=2)
   {
   addition = addition + loopVal;
   }
   System.out.println("Total = " + addition);
   }
}