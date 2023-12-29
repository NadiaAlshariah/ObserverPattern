import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Add user (provide user ID)");
            System.out.println("2. Create group (provide group ID)");
            System.out.println("3. Add user to group (provide user ID and group ID)");
            System.out.println("4. Send message to group (provide user ID and group ID)");
            System.out.println("Enter 'exit' to end the program.");

            String userInput = scanner.nextLine();

            if ("exit".equalsIgnoreCase(userInput)) {
                break;
            }

            try {
                int action = Integer.parseInt(userInput);
                //performAction(action, scanner);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'exit'.");
            }
        }

        System.out.println("Program ended.");    }
}