package Praktikum.Praktikum12;

public class BinarytreeMain24 {
 
public static void main(String[] args) {
    Binarytree24 bt = new Binarytree24();
    bt.add(6);
    bt.add(4);
    bt.add(8);
    bt.add(3);
    bt.add(5);
    bt.add(7);
    bt.add(9);
    bt.add(10);
    bt.add(15);
    System.out.println("PreOrder Treversal : ");
    bt.traversePreOrder(bt.root);
    System.out.println("");
    System.out.println("InOrder Traversal");
    bt.traverseInOrder(bt.root);
    System.out.println("");
    System.out.println("PostOrder Traversal");
    bt.traversePostOrder(bt.root);
    System.out.println(" ");
    System.out.println("Find node : "+ bt.find(5));
    System.out.println("Delete node 8");
    bt.delete(8);
    System.out.println("");
    System.out.println("PreOrder Traversal : ");
    bt.traversePreOrder(bt.root);
 
}
}
