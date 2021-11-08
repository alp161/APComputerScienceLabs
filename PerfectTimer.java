import java.util.concurrent.TimeUnit;
import java.util.Scanner; 
 public class PerfectTimer {

public static void main(String[] args) throws InterruptedException 
{
 Scanner stop = new Scanner(System.in);
 Scanner start = new Scanner(System.in);
    // String input
    String Stop = "stop";
    String Start = "start";
    String start1 = start.nextLine(); 
    boolean x=true;
    long displayMinutes=0;
    long starttime=System.currentTimeMillis();
    System.out.println("Timer:");
 if(start1.equals(Start))
 {
    while(x)
    {
        TimeUnit.SECONDS.sleep(1);
        long timepassed=System.currentTimeMillis()-starttime;
        long secondspassed=timepassed/1000;
        if(secondspassed==60)
        {
            secondspassed=0;
            starttime=System.currentTimeMillis();
        }
        if((secondspassed%60)==0)
        {
        displayMinutes++;
}
    System.out.println(displayMinutes+"::"+secondspassed);
    }
    
  }
}
}

