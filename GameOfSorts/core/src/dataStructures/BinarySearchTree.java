package dataStructures;

import sprites.Dragon;

public class BinarySearchTree{
    protected BSTNode root;
    protected int size;

    public BinarySearchTree(){
        this.root = null;
        this.size = 0;
    }
    
    public void insertNode(Dragon dragon){
        insertNode(new BSTNode(dragon));
    }
    
    public void insertNode(BSTNode newNode){
        if(searchNode(newNode.getData().getAge()) == null){
            if(isEmpty()) root = newNode;
            else insertNode(newNode, root);
            size++;
        }
    }
    
    private void insertNode(BSTNode newNode, BSTNode actualNode){
        if(newNode.getData().getAge() > actualNode.getData().getAge()){
            if(actualNode.getRightChild() == null)actualNode.setRightChild(newNode);
            else insertNode(newNode, actualNode.getRightChild());
        }else{
            if(actualNode.getLeftChild() == null)actualNode.setLeftChild(newNode);
            else insertNode(newNode, actualNode.getLeftChild());
        }
    }
    
    public BSTNode searchNode(int data){
        BSTNode node = root;
        while(node != null){
            if(node.getData().getAge() == data) return node;
            else if(node.getData().getAge() < data) node = node.getRightChild();
            else node = node.getLeftChild();
        }
        return null;
    }
    
    public BSTNode getFatherNode(int data){
        for(BSTNode node = root; node != null; 
            node = (node.getData().getAge() < data) ? node.getRightChild() : node.getLeftChild()){
            if(node.getRightChild() != null && node.getRightChild().getData().getAge() == data ||
               node.getLeftChild() != null && node.getLeftChild().getData().getAge() == data) 
                return node;
        }
        return null;
    }
    
    public void deleteNode(int data){
        BSTNode nodeToDelete = searchNode(data);
        BSTNode node = nodeToDelete,
        fatherNode = getFatherNode(data);
        if (nodeToDelete != null){
            if (node.getRightChild() == null) node = node.getLeftChild();
            else if (node.getLeftChild() == null) node = node.getRightChild();
            else{
                BSTNode temp = findMaxNode(node.getLeftChild());
                BSTNode previousTemp = getFatherNode(temp.getData().getAge());
                node.setData(temp.getData());
                if(previousTemp == node) previousTemp.setLeftChild(temp.getLeftChild());
                else previousTemp.setRightChild(temp.getLeftChild());
            }
            if (nodeToDelete == root) root = node;
            else if (fatherNode.getLeftChild() == nodeToDelete) fatherNode.setLeftChild(node);
            else fatherNode.setRightChild(node);
            size--;
        }
    }
    
    public BSTNode findMaxNode(BSTNode node){
        while(node.getRightChild() != null) node = node.getRightChild();
        return node;
    }

    public BSTNode getRoot() {
        return root;
    }

    public void setRoot(BSTNode root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return root == null;
    }
    
    public void infixPrint(BSTNode node){
        infixPrint(node, "");
    }
    
    private void infixPrint(BSTNode node, String tabulation){
        if(node != null){
            infixPrint(node.getRightChild(), tabulation + "\t");
            System.out.println(tabulation + node.toString());
            infixPrint(node.getLeftChild(), tabulation + "\t");
        }
    }
}