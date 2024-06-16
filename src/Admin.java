public class Admin {
    private static void addBook() {
        System.out.println("Write name of book");
        String title = Main.scanner.nextLine();
        System.out.println("Write author name");
        String author = Main.scanner.nextLine();
        boolean disable = true;
        System.out.println("Write year of the book");
        int year = 0;
        while (true) {
            if (Main.scanner.hasNextInt()) {
                year = Main.scanner.nextInt();
                Main.scanner.nextLine();
                break;
            } else {
                System.out.println("It isn't a number");
                Main.scanner.next();
            }
        }
        Book book = new Book(title, author, disable, year);
        Main.bookArrayList.add(book);
        System.out.println("The book is created");
    }

    private static void deleteBook() {
        System.out.println("Write the number what do you want to delete");
        while (true) {
            if (Main.scanner.hasNextInt()) {
                int inputInt = Main.scanner.nextInt() - 1;
                Main.bookArrayList.remove(inputInt);
                System.out.println("The book is deleted");
                Main.scanner.nextLine();
                break;
            } else {
                System.out.println("It isn't a number");
                Main.scanner.nextLine();
            }
        }
    }

    private static void showAllBooks() {
        for (int i = 0; i < Main.bookArrayList.size(); i++) {
            Book book = Main.bookArrayList.get(i);
            String available;
            if (book.isAvailable()) {
                available = " is available";
            } else {
                available = " isn't available";
            }
            System.out.println(i+1 + ") " + book.getTitle() + " " + book.getAuthor() +" " + book.getYear() + available);
        }
    }

    private static void toControlAdmin() {
        String input;
        do {
            System.out.println("Select what do you want to do: 1.Create 2.Delete 3.See all books 4.Exit");
                input = Main.scanner.nextLine();
                switch (input) {
                    case "1":
                        addBook();
                        break;
                    case "2":
                        deleteBook();
                        break;
                    case "3":
                        showAllBooks();
                        break;
                    case "4":
                        System.out.println("You left the Admin");
                        break;
                    default:
                        System.out.println("You made a mistake");
                }
        }while (!input.equals("4"));
    }
    public static void show_All_Books() {
        showAllBooks();
    }
    public static void to_control_admin() {
        toControlAdmin();
    }
}
