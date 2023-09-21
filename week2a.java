import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generate a random two-digit number between 10 and 99
        int randomNumber = (int) (System.currentTimeMillis() % 90) + 10;

        System.out.print("Enter a two-digit number: ");
        int userNumber = scanner.nextInt();

        // Extract individual digits from both numbers
        int randomDigit1 = randomNumber / 10;
        int randomDigit2 = randomNumber % 10;
        int userDigit1 = userNumber / 10;
        int userDigit2 = userNumber % 10;

        System.out.println("Random number: " + randomNumber);

        if (userNumber == randomNumber) {
            System.out.println("Congratulations! You matched the number in exact order. You win $10,000!");
        } else if (userDigit1 == randomDigit1 || userDigit1 == randomDigit2 || userDigit2 == randomDigit1 || userDigit2 == randomDigit2) {
            System.out.println("You matched one digit. You win $1,000!");
        } else if (userDigit1 == randomDigit2 && userDigit2 == randomDigit1) {
            System.out.println("Congratulations! You matched the number. You win $3,000!");
        } else {
            System.out.println("Sorry, no match. Better luck next time!");
        }

        scanner.close();
    }
}
