package linkedlistprac;

class Product {
    int productId;
    String productName;
    int productQuantity;
    double productPrice;
    Product next;

    public Product(int productId, String productName, int productQuantity, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.next = null;
    }
}
