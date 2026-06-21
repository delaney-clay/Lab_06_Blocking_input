import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double height = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("Enter the height of the rectangle: ");
            if(in.hasNextDouble())
            {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". Please enter a valid number.");
            }
        }while(!done);

        done = false;
        do
        {
            System.out.print("Enter the width of the rectangle: ");
            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". Please enter a valid number.");
            }
        }while(!done);

        area = height * width;
        perimeter = (2 * height) + (2 * width);
        System.out.println("The area of the rectangle is " + area + " and the perimeter is " + perimeter + ".");

        diagonal = Math.hypot(height, width);
        System.out.println("The diagonal of the rectangle is " + diagonal + ".");
    }
}
