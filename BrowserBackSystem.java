import java.util.Scanner;
import java.util.Stack;

public class BrowserBackSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Stack<String> history = new Stack<>();

        String currentPage = "Home Page";
        int choice;

        do {
            System.out.println("\n=== Web Browser Back System ===");
            System.out.println("1. Visit a new page");
            System.out.println("2. Go back");
            System.out.println("3. View current page");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter the page address: ");
                    String newPage = input.nextLine();

                    history.push(currentPage);
                    currentPage = newPage;

                    System.out.println(
                        "You are now visiting: " + currentPage
                    );
                    break;

                case 2:
                    if (!history.isEmpty()) {

                        currentPage = history.pop();

                        System.out.println(
                            "Returned to: " + currentPage
                        );

                    } else {
                        System.out.println(
                            "No previous page available."
                        );
                    }
                    break;

                case 3:
                    System.out.println(
                        "Current page: " + currentPage
                    );

                    System.out.println(
                        "Pages in history: " + history.size()
                    );
                    break;

                case 4:
                    System.out.println("Exiting browser system.");
                    break;

                default:
                    System.out.println(
                        "Invalid choice. Please try again."
                    );
            }

        } while (choice != 4);

        input.close();
    }
}