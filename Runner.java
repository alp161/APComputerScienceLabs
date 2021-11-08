public class Runner { 
public static void main ( String [] args) {

 Comstumer a = new Comstumer(560, 22);
      System.out.println(a.checkhowmuch());
      credicard b = new credicard(103, 39);
      System.out.println(b.greeting());
       personal c = new  personal(17, 6, 2, 12);
      System.out.println(c.ThankyouStatement());

/*
  Human a = new Human(10,12,6);
  System.out.println(a.getAge());
  System.out.println(a.getTime());
  System.out.println(a.getGames());
 
  
    Adult c = new Adult(12,"Doctor");
  System.out.println(c.getWorkHours());
 System.out.println(c.getjob());
 
   Kid b = new Kid(157,"Playing video games");
  System.out.println(b.getHeight());
  System.out.println(b.getHobbie());
 */

}
}
