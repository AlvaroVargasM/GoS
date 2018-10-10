package dataStructures;

public abstract class BinaryNode {
    protected BinaryNode leftChild, rightChild;
    protected int data;
    
    public BinaryNode(int data){
        this.leftChild = this.rightChild = null;
        this.data = data;
    }

    public BinaryNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryNode leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryNode rightChild) {
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
