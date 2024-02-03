package doublyLINKlist;

import java.util.Collections;
import java.util.Scanner;

class DoublyLinkedList {
    private Book head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void insertAtEnd(Book newBook) {
        if (head == null) {
            head = newBook;
        } else {
            Book current = head;
            while (current.next != null) {
                current = current.next;
            current.next = newBook;
            newBook.prev = current;
            }
        }
    }

    public void insertAtFront(Book newBook) {
        if (head == null) {
            head = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            head = newBook;
        }
    }

    public void insertAtPosition(Book newBook, int position) {
        if (position <= 0) {
            System.out.println("Invalid position. Inserting at the front.");
            insertAtFront(newBook);
        } else if (position == 1) {
            insertAtFront(newBook);
        } else {
            int count = 1;
            Book current = head;
            while (current != null && count < position - 1) {
                current = current.next;
                count++;
            }
            if (current == null) {
                System.out.println("Invalid position. Inserting at the end.");
                insertAtEnd(newBook);
            } else {
                newBook.next = current.next;
                if (current.next != null) {
                    current.next.prev = newBook;
                }
                current.next = newBook;
                newBook.prev = current;
            }
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Book current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.prev.next = null;
    }

    public void deleteAtFront() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        if (position <= 0) {
            System.out.println("Invalid position. Deleting at the front.");
            deleteAtFront();
        } else if (position == 1) {
            deleteAtFront();
        } else {
            int count = 1;
            Book current = head;
            while (current != null && count < position) {
                current = current.next;
                count++;
            }
            if (current == null) {
                System.out.println("Invalid position. Cannot delete.");
            } else {
                current.prev.next = current.next;
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
            }
        }
    }

    public Book searchByTitle(String title) {
        Book current = head;
        while (current != null) {
            if (current.bookTitle.equals(title)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void arrangeInDescendingOrder() {
        if (head == null || head.next == null) {
            return;
        }

        Book temp;
        Book current = head;

        while (current != null) {
            Book innerCurrent = current.next;
            while (innerCurrent != null) {
                if (innerCurrent.bookPrice > current.bookPrice) {
                    temp = new Book(current.bookId, current.bookTitle, current.bookAuthor, current.bookPrice);
                    current.bookId = innerCurrent.bookId;
                    current.bookTitle = innerCurrent.bookTitle;
                    current.bookAuthor = innerCurrent.bookAuthor;
                    current.bookPrice = innerCurrent.bookPrice;
                    innerCurrent.bookId = temp.bookId;
                    innerCurrent.bookTitle = temp.bookTitle;
                    innerCurrent.bookAuthor = temp.bookAuthor;
                    innerCurrent.bookPrice = temp.bookPrice;
                }
                innerCurrent = innerCurrent.next;
            }
            current = current.next;
        }
    }

    public void reverseByPriceAndId() {
        if (head == null || head.next == null) {
            return;
        }

        Book temp;
        Book current = head;

        while (current != null) {
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = temp;
        }

        head = head.prev;
    }

    public void displayBooks() {
        Book current = head;
        while (current != null) {
            System.out.println("Book ID: " + current.bookId + ", Title: " + current.bookTitle +
                    ", Author: " + current.bookAuthor + ", Price: " + current.bookPrice);
            current = current.next;
        }
    }
}

