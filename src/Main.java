import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Add user (provide user ID)");
            System.out.println("2. Create group (provide group ID)");
            System.out.println("3. Add user to group (provide user ID and group ID)");
            System.out.println("4. Send message to group (provide user ID, group ID and message)");
            System.out.println("Enter 'exit' to end the program.");

            String userInput = scanner.nextLine();

            if ("exit".equalsIgnoreCase(userInput)) {
                break;
            }

            try {
                int action = Integer.parseInt(userInput);
                performAction(action, scanner);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'exit'.");
            }
        }

        System.out.println("Program ended.");    }

    private static void performAction(int action, Scanner scanner) {
        if(action == 1){
            System.out.println("Enter username: ");
            UserManager.createUser(scanner.nextLine());
        }
        else if(action == 2){
            System.out.println("Enter group name: ");
            GroupManager.createGroupChat(scanner.nextLine());
        }
        else if(action == 3){
            System.out.println("Enter group name: ");
            GroupChat groupChat = GroupManager.getGroupChat(scanner.nextLine());
            System.out.println("Enter username: ");
            User user = UserManager.getuser(scanner.nextLine());
            if(user!= null && groupChat!=null){
                groupChat.add(user);
            }
        }
        else if(action == 4){
            GroupChat groupChat = GroupManager.getGroupChat(scanner.next());
            User user = UserManager.getuser(scanner.next());
            String message = scanner.nextLine();
            if(user!= null && groupChat!=null){
                groupChat.setMessage(user.getUsername() + " said: " + message);
            }
        }
    }
}