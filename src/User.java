public class User {
    private static void rentBook() {
        System.out.println("What do you want to rent");
        if (Main.scanner.hasNextInt()) {
            int inputInt = Main.scanner.nextInt() - 1;
            Book book = Main.bookArrayList.get(inputInt);
            if (book.isAvailable()) {
                System.out.println("You rented a book");
                book.setAvailable(false);
            } else {
                System.out.println("You can't rent a book");
            }
        }
    }

    private static void returnBook() {
        System.out.println("What do you want to return");
        if (Main.scanner.hasNextInt()) {
            int inputInt = Main.scanner.nextInt() - 1;
            Book book = Main.bookArrayList.get(inputInt);
            if (book.isAvailable()) {
                System.out.println("You can't return a book");
            } else {
                System.out.println("You returned a book");
                book.setAvailable(true);
            }
        }
    }

    private static void searchBook() {
        System.out.println("Write what do you want to search");
        String input = Main.scanner.nextLine();
        for (int i = 0; i < Main.bookArrayList.size(); i++) {
            Book book = Main.bookArrayList.get(i);
            if (book.getAuthor().equals(input) || book.getTitle().equals(input)) {
                System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getYear());
            }
        }
    }

    private static void toControlUser() {
        String input;
        do {
            System.out.println("What do you want to do: 1.Rent a book 2.Return a book 3.Search a book 4.See all books 5.Exit");
            input = Main.scanner.nextLine();
            switch (input) {
                case "1":
                    rentBook();
                    break;
                case "2":
                    returnBook();
                    break;
                case "3":
                    searchBook();
                    break;
                case "4":
                    Admin.show_All_Books();
                    break;
                case "5":
                    System.out.println("You left the user");
                    break;
                default:
                    System.out.println("You made a mistake");
                    break;
            }
        } while (!input.equals("5"));
    }
    public static void to_control_user() {
        toControlUser();
    }
}
