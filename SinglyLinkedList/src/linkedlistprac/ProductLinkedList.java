package linkedlistprac;

import java.util.LinkedList;



class ProductLinkedList {
    Product head;

    // Insert at the start of the list
    public void insertAtStart(Product product) {
        product.next = head;
        head = product;
    }

    // Delete at the start of the list
    public void deleteAtStart() {
        if (head != null) {
            head = head.next;
        }
    }

    // Insert at the end of the list
    public void insertAtEnd(Product product) {
        if (head == null) {
            head = product;
        } else {
            Product current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = product;
        }
    }

    // Delete at the end of the list
    public void deleteAtEnd() {
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                Product current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
        }
    }

    // Find the middle of the list
    public int findMiddle() {
        Product slow = head;
        Product fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return (slow != null) ? slow.productId : -1;
    }

    // Find alternate nodes
    public void findAlternate() {
        Product current = head;
        while (current != null && current.next != null) {
            System.out.println("Product ID: " + current.productId);
            if (current.next.next != null) {
                current = current.next.next;
            } else {
                break;
            }
        }
    }

    // Reverse the list
    public void reverseList() {
        Product prev = null;
        Product current = head;
        Product next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    // Sort the list in descending order based on product ID
    public void sortDescending() {
        // Implement your sorting logic here
    }

    // Display the linked list
    public void displayList() {
        Product current = head;
        while (current != null) {
            System.out.println("Product ID: " + current.productId +
                    ", Name: " + current.productName +
                    ", Quantity: " + current.productQuantity +
                    ", Price: " + current.productPrice);
            current = current.next;
        }
    }

    // Display the last 3 nodes
    public void displayLast3Nodes() {
        // Implement logic to display the last 3 nodes
    }

    // Display the first 3 nodes
    public void displayFirst3Nodes() {
        // Implement logic to display the first 3 nodes
    }

    // Insert a node at a specific position
    public void insertAtPosition(Product product, int position) {
        // Implement logic to insert at a specific position
    }

    // Delete a node at a specific position
    public void deleteAtPosition(int position) {
        // Implement logic to delete at a specific position
    }
}

