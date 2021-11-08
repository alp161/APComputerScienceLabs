import java.util.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class
import java.util.concurrent.TimeUnit; 

// create a timer let the user control how much time they will put in to this
public class Timer
{
   public static void main(String[] args) throws InterruptedException 

   {

   boolean x=true;
    long displayMinutes=0;
    long starttime=System.currentTimeMillis();
   double minumum = 0.00;
   double i = 0.00;
   
   Scanner myObj = new Scanner(System.in);
   System.out.println("TIMER: ENTER TIME");
   double salary = myObj.nextDouble();
   
   while(minumum <= salary){
   TimeUnit.SECONDS.sleep(1);
        long timepassed=System.currentTimeMillis()-starttime;
        long secondspassed=timepassed/1000;
        if(secondspassed==60)
        {
     System.out.println("TIME LEFT " + salary);
     salary--;
     }
   }
   }
}