import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double fuelEfficiency = 0;
        double pricePerGal = 0;
        double costHundredMiles = 0;
        double fullTankRange = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("Enter the number of gallons of fuel in the tank: ");
            if(in.hasNextDouble())
            {
                gallons = in.nextDouble();
                done = true
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". Please enter a valid number.");
            }
        }while(!done);
        do
        {
            System.out.print("Enter the fuel efficiency of the car in miles per gallon: ");
            if(in.hasNextDouble())
            {
                fuelEfficiency = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". Please enter a valid number.");
            }
        }while(!done);
        do
        {
            System.out.print("Enter the price per gallon of fuel: ");
            if(in.hasNextDouble())
            {
                pricePerGal = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". Please enter a valid number.");
            }
        }while(!done);
        costHundredMiles = (100/fuelEfficiency) * pricePerGal;
        System.out.println("The cost of driving 100 miles is $" + costHundredMiles);
        fullTankRange = gallons * fuelEfficiency;
        System.out.println("The car can go " + fullTankRange + " miles on a full tank of fuel.");

    }
}
