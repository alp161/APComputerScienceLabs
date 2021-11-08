
public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
   fahrenheit = fahren;

	}

	public double getCelsius()
	{
		double celsius = 0.0;
      celsius = ((double)fahrenheit - 32.0) * (5.0/9.0);

		//add code to convert fahrenheit to celsius
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		System.out.println(fahrenheit + " degrees Fahrenheit == " + getCelsius() + " degrees Celsius");

	}
}