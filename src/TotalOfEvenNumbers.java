
import java.util.Scanner;

public class TotalOfEvenNumbers {
    public static void main(String[] args) {

        //initializing variables
        int lastNumber, total = 0;

        //initializing the scanner
        Scanner scanner = new Scanner(System.in);

        do {
            //asking the user for input
            System.out.print("Please enter a number: ");
            lastNumber = scanner.nextInt();
            if(lastNumber % 2 == 0 && lastNumber % 4 == 0){
                total += lastNumber;
                System.out.println("The current total is: " + total);
            } else {
                if (lastNumber % 2 == 0 && lastNumber <= 11) {
                    System.out.println("The even number(s) you have entered so far are not divisible by both 2 and 4.");
                } else {
                    System.out.print("You have entered an odd number.");
                }
            }
        } while (lastNumber % 2 == 0);

        scanner.close();
    }
}
