import java.util.Random;
import java.util.Scanner;

public class Main {
    public  static  void main(String[] args) {
        //initializing random object
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String inp;
        do {
            //Code taking the sum of the two numbers
            int num1 = random.nextInt(6) + 1;
            int num2 = random.nextInt(6) + 1;
            int sum = num1 + num2;

            //Code displaying the two numbers and their sum
            System.out.println("Die 1 = " + num1);
            System.out.println("Die 2 = " + num2);
            System.out.println("Sum  = " + sum);
            //if sum is either 2, 3 or 12 print craps you lose
            if (sum == 2 || sum == 3 || sum == 12)
                System.out.println("Craps You loss");
                //if sum is either 7 or 11 print natural you win
            else if (sum == 7 || sum == 11)
                System.out.println("Natural You win");
                //else try for point
            else {
                System.out.println("Trying for point");
                // we try to get 7 or 11 or 2 or 3 or 12
                while (sum != 7 && sum != 11 && sum != 2 && sum != 3 && sum != 12) {
                    //the code makes 2 numbers and there sum and print them
                    num1 = random.nextInt(6) + 1;
                    num2 = random.nextInt(6) + 1;
                    sum = num1 + num2;
                    System.out.println("Die 1 = " + num1);
                    System.out.println("Die 2 = " + num2);
                    System.out.println("Sum  = " + sum);
                }
                //if we come out of the loop check if sum is 7 print you made point and won
                if (sum == 7)
                    System.out.println("Got a seven and lost");

                    //else print made point and won
                else
                    System.out.println("Made point and won");
            }
            //finally, the code asks the user if they would want you to play again or not
            System.out.println("Do you want to play again (Y/y)");
            //take input
            inp = scanner.next();
        }while (inp.equals("Y") || inp.equals("y"));
    }
}