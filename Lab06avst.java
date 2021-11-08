// Lab06avst.java
// This is the student starting file of Lab06a.

public class Lab06avst
{
   public static void main (String[] args)
   {
      System.out.println("Lab06av100 by Alp Bayrak");
      int size = 10;
      School bhs = new School(size);
      System.out.println(bhs);
   }     
}

class School
{
   private Student[] students;
   private int size;
  
   public School (int s)
   {
   
      size = s;
      students = new Student[size];
      addData();
      
   }
   
   public void addData()
   {
      String[] Name={"Tom","Ann","Bob","Jan","Joe","Sue","Jay","Meg","Art","Deb"};
      int[] Age={21,34,18,45,27,19,30,38,40,35};
      double[] Gpa={1.685,3.875,2.5,4.0,2.975,3.225,3.65,2.0,3.999,2.125};
      for(int i = 0; i < size; i++)
      {
       Student alp = new Student(Name[i],Age[i],Gpa[i]); 
       students[i] = alp;
       
      }
   /* To Be Completed */
   }  
        
   public String toString()
   {
      String james = "";
      for(int i = 0; i < size; i++)
      {
        james += students[i].toString();
      }/* To Be Completed */
      return james;
   }
}
      
			