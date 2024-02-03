package doublyLINKlist;

import java.util.Scanner;


public class DoublyLinkedListProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList bookList = new DoublyLinkedList();

        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            System.out.print("Enter Book ID: ");
            String bookId = scanner.nextLine();
            System.out.print("Enter Book Title: ");
            String title = scanner.nextLine();
            System.out.print("Enter Book Author: ");
            String author = scanner.nextLine();
            System.out.print("Enter Book Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            Book newBook = new Book(bookId, title, author, price);
            bookList.insertAtEnd(newBook);
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display all books");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at front");
            System.out.println("4. Insert at position");
            System.out.println("5. Delete at end");
            System.out.println("6. Delete at front");
            System.out.println("7. Delete at position");
            System.out.println("8. Search by Title");
            System.out.println("9. Arrange in descending order of price");
            System.out.println("10. Reverse by Price and ID");
            System.out.println("11. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    bookList.displayBooks();
                    break;
                case 2:
                    System.out.println("Enter details for the new book:");
                    System.out.print("Enter Book ID: ");
                    String newBookId = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Enter Book Price: ");
                    double newPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    Book newBook = new Book(newBookId, newTitle, newAuthor, newPrice);
                    bookList.insertAtEnd(newBook);
                    break;
                case 3:
                    System.out.println("Enter details for the new book:");
                    System.out.print("Enter Book ID: ");
                    String frontBookId = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String frontTitle = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String frontAuthor = scanner.nextLine();
                    System.out.print("Enter Book Price: ");
                    double frontPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    Book frontBook = new Book(frontBookId, frontTitle, frontAuthor, frontPrice);
                    bookList.insertAtFront(frontBook);
                    break;
                case 4:
                    System.out.print("Enter the position to insert at: ");
                    int position = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.println("Enter details for the new book:");
                    System.out.print("Enter Book ID: ");
                    String positionBookId = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String positionTitle = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String positionAuthor = scanner.nextLine();
                    System.out.print("Enter Book Price: ");
                    double positionPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    Book positionBook = new Book(positionBookId, positionTitle, positionAuthor, positionPrice);
                    bookList.insertAtPosition(positionBook, position);
                    break;
                case 5:
                    bookList.deleteAtEnd();
                    break;
                case 6:
                    bookList.deleteAtFront();
                    break;
                case 7:
                    System.out.print("Enter the position to delete from: ");
                    int deletePosition = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    bookList.deleteAtPosition(deletePosition);
                    break;
                case 8:
                    System.out.print("Enter the title to search for: ");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = bookList.searchByTitle(searchTitle);
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook.bookId + ", " +
                                foundBook.bookTitle + ", " + foundBook.bookAuthor + ", " + foundBook.bookPrice);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 9:
                    bookList.arrangeInDescendingOrder();
                    System.out.println("Books arranged in descending order of price.");
                    break;
                case 10:
                    bookList.reverseByPriceAndId();
                    System.out.println("Books reversed by price and ID.");
                    break;
                case 11:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
