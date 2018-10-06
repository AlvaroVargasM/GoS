package test;

import dataStructures.BinarySearchTree;

public class Test {
    public static void main(String[] args){
        BinarySearchTree BST = new BinarySearchTree();
        BST.insertNode(10);
        BST.insertNode(5);
        BST.insertNode(15);
        BST.insertNode(17);
        BST.insertNode(13);
        BST.insertNode(3);
        BST.insertNode(7);
        BST.insertNode(6);
        BST.infixPrint(BST.getRoot());
        System.out.println("\n\n\n\n");
        BST.infixPrint(BST.getRoot());

    }
}
