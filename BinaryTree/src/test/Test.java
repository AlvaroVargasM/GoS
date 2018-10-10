package test;

import dataStructures.AVLTree;
import dataStructures.BinarySearchTree;

public class Test {
    public static void main(String[] args){
        AVLTree avl = new AVLTree();
        avl.insertNode(100);
        avl.insertNode(200);
        avl.insertNode(150);
        avl.insertNode(300);
        avl.insertNode(50);
        avl.insertNode(75);
        avl.insertNode(25);
        avl.insertNode(10);
        avl.insertNode(5);
        avl.insertNode(7);
        avl.insertNode(8);
        avl.insertNode(350);
        avl.insertNode(400);
        avl.infixPrint(avl.getRoot());
        avl.deleteNode(25);
        System.out.println("\n\n\n\n");
        avl.infixPrint(avl.getRoot());

    }
}
