//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{

	private static int getNumDigits(int num)
	{
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int num)
	{
		  int[] sorted = new int[getNumDigits(num)];
		  int ind = 0;
  while (num != 0) {
			int digit = num % 10;
	    num = num/ 10;
			sorted[ind++] = digit;
		}
	for (int i = 0; i < sorted.length; i++) {
	  int minimum = 0;
		for (int j = i; j < sorted.length; j++) {
		if (sorted[j] < sorted[minimum]) {
				    	minimum = j;
				}
			}
int min = sorted[minimum];
sorted[minimum] = sorted[i];
sorted[i] = min;
		}
		return sorted;
	}
}