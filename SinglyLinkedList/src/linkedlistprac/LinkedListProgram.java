package linkedlistprac;

import java.util.Scanner;
		public class LinkedListProgram{
		    public static void main(String[] args) {
		        ProductLinkedList productLinkedList = new ProductLinkedList();
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("\n1. Insert at Start\n2. Delete at Start\n3. Insert at End\n4. Delete at End\n" +
		                    "5. Find Middle\n6. Find Alternate\n7. Reverse List\n8. Sort Descending\n" +
		                    "9. Display List\n10. Display Last 3 Nodes\n11. Display First 3 Nodes\n" +
		                    "12. Insert at Position\n13. Delete at Position\n0. Exit");

		            System.out.print("Enter your choice: ");
		            int choice = scanner.nextInt();

		            if (choice == 0) {
		                break;
		            }

		            switch (choice) {
		                case 1:
		                    insertProductAtStart(productLinkedList, scanner);
		                    break;
		                case 2:
		                    productLinkedList.deleteAtStart();
		                    break;
		                case 3:
		                    insertProductAtEnd(productLinkedList, scanner);
		                    break;
		                case 4:
		                    productLinkedList.deleteAtEnd();
		                    break;
		                case 5:
		                    int middleProductId = productLinkedList.findMiddle();
		                    System.out.println("The middle product ID is: " + middleProductId);
		                    break;
		                case 6:
		                    System.out.println("Alternate Nodes:");
		                    productLinkedList.findAlternate();
		                    break;
		                case 7:
		                    productLinkedList.reverseList();
		                    break;
		                case 8:
		                    productLinkedList.sortDescending();
		                    break;
		                case 9:
		                    productLinkedList.displayList();
		                    break;
		                case 10:
		                    productLinkedList.displayLast3Nodes();
		                    break;
		                case 11:
		                    productLinkedList.displayFirst3Nodes();
		                    break;
		                case 12:
		                    insertProductAtPosition(productLinkedList, scanner);
		                    break;
		                case 13:
		                    deleteProductAtPosition(productLinkedList, scanner);
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		        }
		    }

		    private static void insertProductAtStart(ProductLinkedList productLinkedList, Scanner scanner) {
		        System.out.print("Enter Product ID: ");
		        int productId = scanner.nextInt();
		        System.out.print("Enter Product Name: ");
		        String productName = scanner.next();
		        System.out.print("Enter Product Quantity: ");
		        int productQuantity = scanner.nextInt();
		        System.out.print("Enter Product Price: ");
		        double productPrice = scanner.nextDouble();

		        Product newProduct = new Product(productId, productName, productQuantity, productPrice);
		        productLinkedList.insertAtStart(newProduct);
		    }

		    private static void insertProductAtEnd(ProductLinkedList productLinkedList, Scanner scanner) {
		        System.out.print("Enter Product ID: ");
		        int productId = scanner.nextInt();
		        System.out.print("Enter Product Name: ");
		        String productName = scanner.next();
		        System.out.print("Enter Product Quantity: ");
		        int productQuantity = scanner.nextInt();
		        System.out.print("Enter Product Price: ");
		        double productPrice = scanner.nextDouble();

		        Product newProduct = new Product(productId, productName, productQuantity, productPrice);
		        productLinkedList.insertAtEnd(newProduct);
		    }

		    private static void insertProductAtPosition(ProductLinkedList productLinkedList, Scanner scanner) {
		        System.out.print("Enter Position: ");
		        int position = scanner.nextInt();
		        System.out.print("Enter Product ID: ");
		        int productId = scanner.nextInt();
		        System.out.print("Enter Product Name: ");
		        String productName = scanner.next();
		        System.out.print("Enter Product Quantity: ");
		        int productQuantity = scanner.nextInt();
		        System.out.print("Enter Product Price: ");
		        double productPrice = scanner.nextDouble();

		        Product newProduct = new Product(productId, productName, productQuantity, productPrice);
		        productLinkedList.insertAtPosition(newProduct, position);
		    }

		    private static void deleteProductAtPosition(ProductLinkedList productLinkedList, Scanner scanner) {
		        System.out.print("Enter Position: ");
		        int position = scanner.nextInt();
		        productLinkedList.deleteAtPosition(position);
		    }
		

     
     
     
  
  
  
	}
	


