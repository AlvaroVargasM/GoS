package dataStructures;

import sprites.Dragon;

public class BSTNode {
    protected BSTNode leftChild, rightChild;
    protected Dragon data;
    
    public BSTNode(Dragon data){
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

    public Dragon getData() {
        return data;
    }

    public void setData(Dragon data) {
        this.data = data;
    }
    
    public String toString(){
        String str = data.getName();
        return str;
    }
}
