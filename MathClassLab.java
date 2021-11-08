

import java.util.Random;


public class MathClassLab 

{

public static void main (String args[])

{

int n = 0; 
n = (int)(Math.random()*3)+1;
if (n==1)

{
    // Defining the radius of the circle
    int radius = 10;
    // Area of the circle
    double area = (Math.PI * radius * radius);
    System.out.println("Area of circle with radius " + radius + " is " + area);

}

if (n==2)

{
    int radius = 10;
    // Volume of the sphere (4/3) * PI * R * R * R
    double volume = (4.0 * Math.PI * radius * radius * radius) / 3.0;
    System.out.println("Volume of sphere with radius " + radius + " is " + volume);
}

if (n==3)

{

    // use the distance formula
    double distance = Math.sqrt(Math.pow((12 - 5), 2) + Math.pow(6-5, 2));
    System.out.println("The distance " + distance);

}

}

}