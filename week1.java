import java.util.Scanner;

public class ResearchLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your NIM (Student ID): ");
        String nim = scanner.nextLine();

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        int currentYear = 2023; 

        int age = currentYear - birthYear;

        if (age >= 18) {
            System.out.println("You are eligible to work at the Research Lab.");
            System.out.println("Research Programs Available:");
            System.out.println("1. Game Development");
            System.out.println("2. Internet of Things");
            System.out.println("3. Cyber Security");
            System.out.println("4. Blockchain");
            System.out.println("5. Artificial Intelligence");

            System.out.print("Enter the number of the research program you are interested in (1-5): ");
            int programChoice = scanner.nextInt();

            String programName = "";

            if (programChoice == 1) {
                programName = "Game Development";
            } else if (programChoice == 2) {
                programName = "Internet of Things";
            } else if (programChoice == 3) {
                programName = "Cyber Security";
            } else if (programChoice == 4) {
                programName = "Blockchain";
            } else if (programChoice == 5) {
                programName = "Artificial Intelligence";
            } else {
                System.out.println("Invalid program choice.");
                scanner.close();
                return;
            }

            System.out.println("Congratulations! You have chosen the program: " + programName);
            System.out.println("NIM: " + nim);
        } else {
            System.out.println("You need to be 18 or above to work here.");
        }

        scanner.close();
    }
}
