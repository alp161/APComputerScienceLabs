public class Person
{
   private String name;

   public Person(String theName)
   {
      this.name = theName;
   }

   public String getName()
   {
      return name;
   }

   public boolean setName(String theNewName)
   {
      if (theNewName != null)
      {
         this.name = theNewName;
         return true;
      }
      return false;
   }
}

 public class Employee extends Person
{
   private int id;
   public static int nextId = 1;

   public Employee(String theName)
   {
      super(theName);
      id = nextId;
      nextId++;
   }

   public int getId()
   {
      return id;
   }
}
 public class Employee1 extends Person
{
}
