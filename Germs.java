//(c) A+ Computer Science
//www.apluscompsci.com

public class Germs
{
  private int number;
  private String gname;
	
  public Germs( String n )  
  {
    number = 1;
    gname = n;
  }
  
	public Germs( String n, int a )  
	{
   number = a;
   gname = n; 
 
      
 	 //fill in this constructor
	}
  
  public void increasenumber()
  {
   number++;
  	 //fill in this method
  }
  
  public int GermNumbers( int val )
  {
  int GermNumbers = number * val;
  	 //fill in this method
  	 return GermNumbers;
  }
	
  public int getnumber()    {
    return number;
  }
	
  public String getName()    {
    return gname;
  }
	
  public String toString()    {
    return "Dog - " + gname + " " + number;
  }
}
