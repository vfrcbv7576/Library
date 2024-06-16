import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Book> bookArrayList = new ArrayList<>();

    public static void main(String[] args) {
        String input;
        do {
            System.out.println("What do you want to do: 1.Admin 2.User 3.Exit");
            input = scanner.nextLine();
            switch (input) {
                case "1":
                    Admin.to_control_admin();
                    break;
                case "2":
                    User.to_control_user();
                    break;
                case "3":
                    System.out.println("You closed the program");
                    break;
            }
        } while (!input.equals("3"));
    }
}