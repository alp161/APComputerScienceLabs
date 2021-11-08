//(c) A+ Computer Science
//www.apluscompsci.com

public class Dog
{
  private int age;
  private String name;
	
  public Dog( String n )  
  {
    age = 1;
    name = n;
  }
  
	public Dog( String n, int a )  
	{
   age = a;
   name = n; 
 
      
 	 //fill in this constructor
	}
  
  public void increaseAgeByOne()
  {
   age++;
  	 //fill in this method
  }
  
  public int getPeopleAge( int val )
  {
  int PeopleAge = age * val;
  	 //fill in this method
  	 return PeopleAge;
  }
	
  public int getAge()    {
    return age;
  }
	
  public String getName()    {
    return name;
  }
	
  public String toString()    {
    return "Dog - " + name + " " + age;
  }
}
