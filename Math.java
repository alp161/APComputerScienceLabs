public class Math
{
  private int first;
  private int second;
	
  public Math()  
  {
    first = 10;

  }
  
	public Math( int n, int a )  
	{
   first = a;
   second = n; 
 
      
 	 //fill in this constructor
	}
  
  public int total( int first, int second)
  {
  int total = first + second;
  	 //fill in this method
  	 return total;
  }
	
  public int getavg()
  {
  int avg = (first + second) / 2; 
  return avg;
  }
  public int getFirst()    {
    return first;
  }
	
  public int getSecond()    {
    return second;
  }
	
  public String toString(int avg)
  {
  return "The average is" + avg; 
  }
}