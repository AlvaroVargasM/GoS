package test;

import dataStructures.AVLTree;
import dataStructures.BinarySearchTree;

public class Test {
    public static void main(String[] args){
        AVLTree bts = new AVLTree();
        bts.insertNode(100);
        bts.insertNode(200);
        bts.insertNode(150);
        bts.insertNode(300);
        bts.insertNode(50);
        bts.insertNode(75);
        bts.insertNode(25);
        bts.insertNode(10);
        bts.insertNode(5);
        bts.insertNode(7);
        bts.insertNode(8);
        bts.insertNode(350);
        bts.insertNode(400);
        bts.infixPrint(bts.getRoot());
        bts.deleteNode(25);
        System.out.println("\n\n\n\n");
        bts.infixPrint(bts.getRoot());

    }
}
