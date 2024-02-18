package circularlist;

import java.util.Scanner;

public class CircularLinkedListMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        while (true) {
            System.out.println("\nCircular Linked List Menu:");
            System.out.println("1. Insert at the Start");
            System.out.println("2. Insert at the End");
            System.out.println("3. Insert by Position");
            System.out.println("4. Insert by Value");
            System.out.println("5. Delete at the Start");
            System.out.println("6. Delete at the End");
            System.out.println("7. Delete by Value");
            System.out.println("8. Delete by Position");
            System.out.println("9. Print Alternate Nodes");
            System.out.println("10. Print Descending Order based on Price");
            System.out.println("11. Print Reverse Order");
            System.out.println("12. Display Product by ID");
            System.out.println("13. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    int id1 = scanner.nextInt();
                    System.out.print("Enter product name: ");
                    String name1 = scanner.next();
                    System.out.print("Enter product price: ");
                    double price1 = scanner.nextDouble();
                    circularLinkedList.insertAtStart(new Product(id1, name1, price1));
                    break;

                case 2:
                    System.out.print("Enter product ID: ");
                    int id2 = scanner.nextInt();
                    System.out.print("Enter product name: ");
                    String name2 = scanner.next();
                    System.out.print("Enter product price: ");
                    double price2 = scanner.nextDouble();
                    circularLinkedList.insertAtEnd(new Product(id2, name2, price2));
                    break;

                case 3:
                    System.out.print("Enter product ID: ");
                    int id3 = scanner.nextInt();
                    System.out.print("Enter product name: ");
                    String name3 = scanner.next();
                    System.out.print("Enter product price: ");
                    double price3 = scanner.nextDouble();
                    System.out.print("Enter position: ");
                    int position3 = scanner.nextInt();
                    circularLinkedList.insertByPosition(new Product(id3, name3, price3), position3);
                    break;

                case 4:
                    System.out.print("Enter product ID: ");
                    int id4 = scanner.nextInt();
                    System.out.print("Enter product name: ");
                    String name4 = scanner.next();
                    System.out.print("Enter product price: ");
                    double price4 = scanner.nextDouble();
                    System.out.print("Enter value: ");
                    double value4 = scanner.nextDouble();
                    circularLinkedList.insertByValue(new Product(id4, name4, price4), value4);
                    break;

                case 5:
                    circularLinkedList.deleteAtStart();
                    break;

                case 6:
                    circularLinkedList.deleteAtEnd();
                    break;

                case 7:
                    System.out.print("Enter value: ");
                    double value7 = scanner.nextDouble();
                    circularLinkedList.deleteByValue(value7);
                    break;

                case 8:
                    System.out.print("Enter position: ");
                    int position8 = scanner.nextInt();
                    circularLinkedList.deleteByPosition(position8);
                    break;

                case 9:
                    circularLinkedList.printAlternateNodes();
                    break;

                case 10:
                    circularLinkedList.printDescendingOrder();
                    break;

                case 11:
                    circularLinkedList.printReverseOrder();
                    break;

                case 12:
                	
                	
                   System.out.print("Enter product ID: ");
                  int productId12 = scanner.nextInt();
                    circularLinkedList.displayProduct(productId12);
                    break;

                case 13:
                    System.out.println("Exiting program.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

    