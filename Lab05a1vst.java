// Lab05a1vst.java
// The Rational Class Program I
// This is the student starting Version of the Lab05a1 assignment.
import java.util.Scanner;

public class Lab05a1vst
{
	public static void main (String[] args)
	{
      Scanner keyboard = new Scanner (System.in);
		System.out.print("\nEnter the numerator ----> ");
		int num = keyboard.nextInt();
		System.out.print("\nEnter the denominator --> ");
		int den = keyboard.nextInt();
		Rational r = new Rational(num,den);
		r.displayData();
	}
}


class Rational
{
	private int num;
	private int den;

   
	public Rational(int num, int den) 
	{
     this.num = num;
     this.den = den;
	}

	public double getDecimal() 
   { 
   double nume = (double) (num);
   double deno = (double) (den);
   return (double) (nume/deno);
    
   }
   
   
   public String getRational() 
   { 
      return num + "/" + den;
}
	public String getReduced() 
   {
      if( getGCF(num,den) != 0)
      {
      return  num / getGCF(num,den) + "/" +  den / getGCF(num,den);
      }
      else
      return num + "/" + den;
   }

  
	public void displayData()
	{
		System.out.println();
		System.out.println(getRational() + " equals " + getDecimal());
		System.out.println();
      System.out.println("and reduces to " + getReduced());
		System.out.println();

	}

	private int getGCF(int n1,int n2)
	{
   int rem = n1 % n2;

    if(rem == 0) {
       return n2;
    } else {
        return getGCF(n2, rem);
    }
}
}
   /*
   int rem = 0;
   int gcf = 0;
   do{
   rem = n1 % n2;
   if(rem == 0)
   {
   gcf = n2;
   }
   else
   {
   n1 = n2;
   n2 = rem;
   }
   }
   while(rem !=0);
   return gcf;
   }
 }  
        /*if (den == 0) {
            System.out.println("This is num: " + num);
            System.out.println("This is den: " + den);
            return num;
        }
        else{
            System.out.println(num % den);
            return gcd(den, num % den);
        }
    }

}*/


   /*num = n1;
   den = n2;
   if(den == 0)
   {
   System.out.println("den is 0");
   den = 1;
   }
   int a = 0;
   int checknum = 0;
   if (num<0) 
   {
   checknum = 1;
   num = num * -1;
    }
    int checkden = 0;
    if (den<0) 
    {
    checkden = 1;
    den = den * -1;
    }
    while (num>=den) 
    {
    num = num - den;
    a++;
    }
    double desired = (double) (num) / (double) (den);
    int x = 0; 
    int y = 1;
    double actual = x/y;
    while (actual != desired) 
    {
    x++;
    actual = (double) (x) / (double) (y);
    if (x==y) 
    {
    y++;
    x = 0;
    actual = (double) (x) / (double) (y);
     }
     }
Rational.java282doublereducedbenumbeforeadd = x;
doubledenom = y;
doublenumer = denom * a + reducedbenumbeforeadd;
if (checknum==1) 
{
numer = numer * -1;
}
if (checkden==1) 
{
numer = numer * -1;
}
num = (int) numer;
den = (int) denom;
int gcf = value1/num;
return gcf;
*/


