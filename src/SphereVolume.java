import java.util.*;
public class SphereVolume
{
    public static void main(String[] args)
    {
        double diam; //declares variable for diameter
        Scanner reading = new Scanner(System.in); // input

        System.out.println("This program is used to calculate the volume of a sphere."); // Explains the purpose of the program
        System.out.println("Please give me the diameter of the sphere: "); //Prompts user for the diameter of the sphere
        diam = reading.nextDouble();
        double radius = diam/2;
        double volume = (4.0/3) * Math.PI * Math.pow(radius,3);

        System.out.println("The volume is " + volume);
        System.out.println("Goodbye");

    }
}
