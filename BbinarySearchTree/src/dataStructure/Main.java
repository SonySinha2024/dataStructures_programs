package dataStructure;



public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(20);
        bst.insert(80);
        bst.insert(10);
        bst.insert(40);
        bst.insert(60);
        bst.insert(90);
        bst.insert(15);
        bst.insert(70);
        bst.insert(30);

        bst.preOrder();
        bst.preOrder(bst.getRoot());
        System.out.println();

        bst.inOrder();
        bst.inOrder(bst.getRoot());
        System.out.println();

        bst.postOrder();
        bst.postOrder(bst.getRoot());
        System.out.println();

        System.out.println("60? " + bst.find(bst.getRoot(), 60));
        System.out.println("70? " + bst.find(bst.getRoot(), 70));
        System.out.println("50? " + bst.find(bst.getRoot(), 50));
        System.out.println("160? " + bst.find(bst.getRoot(), 160));

        bst.delete(50);
        bst.preOrder();
        bst.inOrder();
        bst.postOrder();

        System.out.println("Del 49: " + bst.delete(49));

    }
}



// output:
//Pre: 50 20 10 15 40 30 80 60 70 90 
//50 20 10 15 40 30 80 60 70 90 
//In:  10 15 20 30 40 50 60 70 80 90 
//10 15 20 30 40 50 60 70 80 90 
//Post: 15 10 30 40 20 70 60 90 80 50 
//15 10 30 40 20 70 60 90 80 50 
//60? true
//70? true
//50? true
//160? false
//Pre: 40 20 10 15 30 80 60 70 90 
//In:  10 15 20 30 40 60 70 80 90 
//Post: 15 10 30 20 70 60 90 80 40 
//Del 49: false