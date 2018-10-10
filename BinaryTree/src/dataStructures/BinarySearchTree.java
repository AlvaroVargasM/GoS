package dataStructures;

public class BinarySearchTree extends BinaryTree{
    
    public BinarySearchTree(){
        super();
    }
    
    public void insertNode(int data){
        BinaryNode newNode = new BTSNode(data);
        this.insertNode(newNode);
    }
}