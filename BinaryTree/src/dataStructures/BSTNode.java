package dataStructures;

public class BSTNode {
    protected BSTNode leftChild, rightChild;
    protected int data;
    
    public BSTNode(int data){
        this.leftChild = this.rightChild = null;
        this.data = data;
    }

    public BSTNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BSTNode leftChild) {
        this.leftChild = leftChild;
    }

    public BSTNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BSTNode rightChild) {
        this.rightChild = rightChild;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
    public String toString(){
        String str = Integer.toString(data);
        return str;
    }
}
