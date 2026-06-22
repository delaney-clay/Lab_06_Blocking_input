import java.util.Random;
import java.util.Scanner;

public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int val = generator.nextInt(10)+1;
        int guess = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("Guess a number between 1 and 10: ");
            if(in.hasNextInt())
            {
                guess = in.nextInt();
                if(guess < 1 && guess > 10)
                {
                    System.out.println("You entered " + guess + ". Please enter a number 1-10.");
                    done = false;
                }
                else if(guess < val)
                {
                    System.out.println("Your guess was too low! The number was " + val + ".");
                    System.out.println("Try again.");
                    done = false;
                }
                else if(guess > val)
                {
                    System.out.println("Your guess was too high! The number was " + val + ".");
                    System.out.println("Try again.");
                    done = false;
                }
                else
                {
                    System.out.println("Correct!");
                    done = true;
                }
            }
            else
            {
                trash = in.next();
                System.out.println("Invalid input. Please enter a number.");
            }
        } while(!done);

    }

}
