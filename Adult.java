class Human{
private int a;
private int t;
private int g;

   public  Human()
   {
   a = 10;
   t = 15;
   g = 6;
   }
   public Human(int age, int time,int game)
   {
   a= age; 
   t= time;
   g = game;
   }
   public String getAge()
   {
   return "I am " + a + " year old";
   }
   public String getTime()
   {
   return "I have been playing for " + t + " Hours";  
   }
   
   public String getGames()
   {
    return "I have played " + g + " games ";
   }
   
   
}
 class Kid extends Human
{
private int h;
private String ho;

public Kid()
{
h = 157;
ho = "Playing video games";
}
public Kid(int height, String hobbies)
{
h = height;
ho = hobbies;
}
public Kid(int age, int time,int game,int height, String hobbies )
{
super(age,time,game);
height = h;
hobbies = ho;

}
/*
public String getAge()
   {
   return "I am " + a + " year old";
   }
   public String getTime()
   {
   return "I have been playing for " + t + " Hours";  
   }
   
   public String getGames()
   {
    return "I have played " + g + " games ";
   }
*/
   public String getHeight()
   {
   return "My height is " + h + " cm";
   }
   public String getHobbie()
   {
   return "My hobbie is " + ho;
    
   }
 class Adult extends Human 
{
private int w;
private String j;

public Adult()
{
w = 12;
j = "Doctor";
}
public Adult(int WorkHours, String job)
{
w = WorkHours;
j = job;
}
public Adult(int age, int time,int game, int WorkHours, String job )
{
super(age,time,game);
w = WorkHours;
j = job;
}
  public String getWorkHours()
   {
   return "I work for  " + w + " Hours";
   }
   public String getjob()
   {
   return "My job is " + j;
    
   }
   
}
}


/*
public class Human{
private int a;
private int t;
   public  Human( int ba , int bt)
   {
   a = ba;
   t = bt;
   System.out.println( "age is " + ba);
   }
   
   public void HowLong(int t)
   {
   System.out.println( "I slept for " + t + " hours");
   }
   
   public void sleep() 
   { 
    System.out.println("Zzzzzzzzzz");
   }
   public void sayHello()
   {
   System.out.println("Hello");
   }
  }
class Kid extends Human{
  }
 
 class Kid extends Human{
 int ab;
 int h;
 public  Kid(int bba , int bh)
 {
 ab = bba;
 h = bh;
 
 System.out.println("my age is " +  bba + " My height is " + bh);
 }
 public void  HowLong( int ti , int at)
 {
 System.out.println("I slept for " + ti + "hours" + " and ate my food for" + at +" hours");
 }
 public void sayHello()
   {
    System.out.println("Hi!!!");
   }
  public void hungery()
  {
    System.out.println("Mom I am hungery");
  } 
}
 class adult extends Human{
 int abb;
 int he;
 public  adult(int bbba , int bhe)
 {
 abb = bbba;
 he = bhe;

 System.out.println("my age is " +  bbba + " My height is " + bhe);
 }
  public void PlayedVideoG(int g , int m)
 {
 System.out.println("I played video games for " + g + "hours and I played " + g + " hours");
 } 

public void thinking(){
 System.out.println("hmmmmmm");
}
public void sad(){
  System.out.println("huhusuuh");
  }
}
*/  