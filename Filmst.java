// Filmst.java
// The Array of Film Objects program 
// This is the student, starting version of the Ch12Film assignment.
public class Filmst
{
        public static void main(String [] args) 
        {
        
           // Create an array called watch that contains a list of 4 film objects  
           Film[] watch = new Film[4];      
           //  Initialize the values of each object in the array.
           watch[0] = new Film("Shrek",133,"PG");
           watch[1] = new Film("Road to Perdition",117,"G");
           watch[2] = new Film("The Truth about Cats and Dogs",93,"PG");
           watch[3] = new Film("Enigma",114,"G");
           

           
           //  loop to increase the length time of each object in the array by 10%
         
           for(int i = 0; i < watch.length; i++)
           {
           double a = watch[i].getLength();
           int b = (int)(a * 1.1);
           watch[i].setLength(b);
           }
           // loop to display the film information of each object in the array.
           for (int x = 0; x <= 3; x++){ 
                 watch[x].display();
           
         }
}  
}

class Film{
  
  String title;
  int length;
  String rating;  // "G", "PG",   "PG-13",  "R"
  
  public Film (String sname, int min, String r) 
  {
  title = sname;
  length = min;
  rating = r;
  }
  public void display() 
  {
  System.out.print("Title: " + title + "\n" + "Length: " + length + "\n" + "rating: " + rating + "\n\n" + "_________________" +"\n"); 

  }
  public int getLength()
  {
    return length;
  }
  
  public void setLength(int len) //len corresponds with the percentage the film is to be increased by
  {
     length = len;
  
  }
}
