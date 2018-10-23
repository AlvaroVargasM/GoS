package test;

import dataStructures.AVLTree;
import dataStructures.BTreeNode;
import dataStructures.BinarySearchTree;
import dataStructures.LinkedList;

public class Test {
    public static void main(String[] args){
//        LinkedList L = new LinkedList();
//        L.add(5); L.add(4); L.add(3); L.add(2); L.add(1); L.add(0);
//        System.out.println(L.toString());
//        L.selectionSort();
//        System.out.println(L.toString());
        
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
        avl.insertNode(325);
        avl.insertNode(225);
        avl.insertNode(170);
        avl.infixPrint(avl.getRoot());
        avl.deleteNode(25);
        System.out.println("\n\n\n\n");
        avl.infixPrint(avl.getRoot());

    }
}
