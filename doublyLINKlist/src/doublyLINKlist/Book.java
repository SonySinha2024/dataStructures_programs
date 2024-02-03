package doublyLINKlist;


class Book {
    String bookId;
    String bookTitle;
    String bookAuthor;
    double bookPrice;

    Book prev;
    Book next;

    public Book(String bookId, String bookTitle, String bookAuthor, double bookPrice) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.prev = null;
        this.next = null;
    }
}