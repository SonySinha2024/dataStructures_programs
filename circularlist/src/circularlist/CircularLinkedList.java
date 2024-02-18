package circularlist;


class CircularLinkedList {
    private Node head;

    // Insert at the start
    public void insertAtStart(Product product) {
        Node newNode = new Node(product);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    // Insert at the end
    public void insertAtEnd(Product product) {
        Node newNode = new Node(product);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Insert by position
    public void insertByPosition(Product product, int position) {
        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 1) {
            insertAtStart(product);
            return;
        }
        Node newNode = new Node(product);
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            if (temp.next == head) {
                System.out.println("Position out of bounds.");
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Insert by value
    public void insertByValue(Product product, double value) {
        Node newNode = new Node(product);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head && temp.next.data.price < value) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // Delete at the start
    public void deleteAtStart() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
        }
    }

    // Delete at the end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            Node temp = head;
            Node prev = null;
            while (temp.next != head) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = head;
        }
    }

    // Delete by value
    public void deleteByValue(double value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.data.price == value) {
            deleteAtStart();
            return;
        }
        Node temp = head;
        Node prev = null;
        while (temp.next != head && temp.data.price != value) {
            prev = temp;
            temp = temp.next;
        }
        if (temp.data.price != value) {
            System.out.println("Product with given value not found.");
            return;
        }
        prev.next = temp.next;
    }

    // Delete by position
    public void deleteByPosition(int position) {
        if (position < 1 || head == null) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 1) {
            deleteAtStart();
            return;
        }
        Node temp = head;
        Node prev = null;
        for (int i = 1; i < position && temp.next != head; i++) {
            prev = temp;
            temp = temp.next;
        }
        if (temp.next == head) {
            System.out.println("Position out of bounds.");
            return;
        }
        prev.next = temp.next;
    }

    // Print alternate nodes
    public void printAlternateNodes() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        boolean printFlag = true;
        do {
            if (printFlag) {
                System.out.println(temp.data);
            }
            printFlag = !printFlag;
            temp = temp.next;
        } while (temp != head);
    }

    // Print in descending order based on price
    public void printDescendingOrder() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        double[] prices = new double[countNodes()];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = temp.data.price;
            temp = temp.next;
        }
        for (int i = prices.length - 1; i >= 0; i--) {
            temp = head;
            while (temp != head && temp.data.price != prices[i]) {
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    // Print in reverse order
    public void printReverseOrder() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        printReverseOrderHelper(head);
    }

    private void printReverseOrderHelper(Node node) {
        if (node.next != head) {
            printReverseOrderHelper(node.next);
        }
        System.out.println(node.data);
    }

    // Display the product with its attributes
    public void displayProduct(int productId) {
        Node temp = head;
        do {
            if (temp.data.id == productId) {
            	 System.out.println("Product with given ID  found.");
                System.out.println(temp.data);
                
                return;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println("Product with given ID not found.");
    }

    // Count nodes in the circular linked list
    private int countNodes() {
        if (head == null) {
            return 0;
        }
        Node temp = head;
        int count = 0;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}


