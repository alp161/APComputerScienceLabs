// TextLab06st.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the TextLab06 assignment.


import java.text.DecimalFormat;
import java.util.Scanner;


public class TextLab06st
{
	public static void main(String args[])
	{
		// This main method needs additions for the 100 point version.
		Scanner input = new Scanner(System.in);
		System.out.println("\nTextLab06\n");
		System.out.print("Enter the primes upper bound  ===>>  ");
		final int MAX = input.nextInt();
		boolean primes[];
		primes = new boolean[MAX];
		computePrimes(primes);
		displayPrimes(primes);	}

		public static void computePrimes(boolean primes[])
 
	{
       System.out.println("\nCOMPUTING PRIME NUMBERS");
		
		for(int i = 2; i < primes.length; i++)
		{
			primes[i] = true;
		}
		
		
		for(int in = 2; in < primes.length; in++) {
			
			if(primes[in] == true) {
				for(int in1 = in * 2; in1 < primes.length; in1 += in) {
					primes[in1] = false;
				}
			}
		}
	} 
	public static void displayPrimes(boolean primes[])
   {
	   DecimalFormat output = new DecimalFormat("0000");
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
		System.out.println();
		int count = 0;
		for(int in = 2; in < primes.length; in++) {
			
			if(primes[in]) 
         {
				System.out.print(output.format(in) + " ");
				count++;
			if(count % 15 == 0) {
					System.out.println();
				}
			}
		}
       System.out.println();
       System.out.println("Total amounts of prime numbers "+count);
	}
}