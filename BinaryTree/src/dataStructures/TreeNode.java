package dataStructures;

public class TreeNode<GenericData>{
    private TreeNode leftChild, rightChild;
    private int data;
    
    public TreeNode(int data){
        this.leftChild = this.rightChild = null;
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
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
