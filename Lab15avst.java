// Lab15avst.java
// 02-28-15 by Leon Schram
// The "Odd Magic Square" Program
// This is the student, starting version of the Lab15 assignment.
 
 
import java.util.Scanner;
import java.text.DecimalFormat;
 
public class Lab15avst

{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
 
      System.out.print("Enter the odd# size of the Magic Square -->  ");
      int size = input.nextInt();
      MagicSquare magic = new MagicSquare(size);
 
      magic.computeMagicSquare();
      magic.displayMagicSquare();
    	magic.checkRows();          // for 100 & 110 Point Version Only
    	magic.checkColumns();       // for 100 & 110 Point Version Only
    	magic.checkDiagonals();	    // for 100 & 110 Point Version Only
	}
}
 
 
class MagicSquare {
	private int size;
	private int matrix[][];
   private DecimalFormat output;
 
	public MagicSquare(int s) {
      size = s;
		matrix = new int[size][size];
      output = new DecimalFormat("000");
	}
 
	public void computeMagicSquare() { 
		int r = 0;
		int c = size / 2;
		matrix[r][c] = 1;
      int sqr = size * size;
		for (int k = 2; k < sqr + 1; k++) {
           double rE = (r + size - 1) % size;
           int b = (int)(rE * 1);
			if (matrix[b][(c + 1) % size] == 0) {
				r = b;
				c = (c + 1) % size;
			} else {
				r = (r + 1) % size;
			}
			matrix[r][c] = k;
 
		}
	}
 
	public void displayMagicSquare() {
		DecimalFormat threeDigits = new DecimalFormat("000");
		System.out.println();
		System.out.println(size + "x" + size + "Magic Square");
		System.out.println("===================");
		for (int rowNums = 0; rowNums < matrix.length; rowNums++) {
			for (int colNums = 0; colNums < matrix.length; colNums++) {
				System.out.print(output.format(matrix[rowNums][colNums]) + " ");
			}
			System.out.println();
		}
 
	}
 
	public void checkRows() {
		System.out.println();
		System.out.println("Checking Rows");
		System.out.println("=============");
		int suNus = 0;
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix.length; c++) {
				suNus += matrix[r][c];
 
			}
			System.out.print(suNus + " ");
			suNus = 0;
		}
 
	}
 
	public void checkColumns() {
		System.out.println();
		System.out.println();
		System.out.println("Checking Columns");
		System.out.println("================");
		int suNus = 0;
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix.length; c++) {
				suNus += matrix[r][c];
 
			}
			System.out.print(suNus + " ");
			suNus = 0;
		}
	}
 
	public void checkDiagonals() {
		System.out.println();
		System.out.println();
		System.out.println("Checking Diagonals");
		System.out.println("==================");
		int suNus = 0;
		for (int k = 0; k < matrix.length; k++) {
			suNus += matrix[k][k];
		}
		System.out.print(suNus + " ");
		suNus = 0;
 
		for (int k = 0; k < matrix.length; k++) {
			suNus += matrix[k][k];
		}
			System.out.print(suNus);
 
		}
	}