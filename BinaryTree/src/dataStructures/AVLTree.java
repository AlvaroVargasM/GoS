package dataStructures;

public class AVLTree extends BinarySearchTree{
    
    public AVLTree(){
        super();
    }
    
    public void insertNode(int data){
        BinaryNode newNode = new AVLNode(data);
        this.insertNode(newNode);
        setTreeHeight();
        setBalanceFactor();
        balanceTree(root, data);
    }
    
    public void deleteNode(int data){
        super.deleteNode(data);
        setTreeHeight();
        setBalanceFactor();
        balanceTree(root, data);
    }
    
    public void leftRotation(BinaryNode unbalancedNode){
        BinaryNode fatherNode = getFatherNode(unbalancedNode.getData());
        BinaryNode rightChild = unbalancedNode.getRightChild();
        BinaryNode nodeX = rightChild.getLeftChild();
        rightChild.setLeftChild(unbalancedNode);
        rightChild.getLeftChild().setRightChild(nodeX);
        if(unbalancedNode == root)root = rightChild;
        else if(fatherNode.getLeftChild() == unbalancedNode) fatherNode.setLeftChild(rightChild);
        else fatherNode.setRightChild(rightChild);
    }
    
    public void rightRotation(BinaryNode unbalancedNode){
        BinaryNode fatherNode = getFatherNode(unbalancedNode.getData());
        BinaryNode leftChild = unbalancedNode.getLeftChild();
        BinaryNode nodeX = leftChild.getRightChild();
        leftChild.setRightChild(unbalancedNode);
        leftChild.getRightChild().setLeftChild(nodeX);
        if(unbalancedNode == root)root = leftChild;
        else if(fatherNode.getLeftChild() == unbalancedNode) fatherNode.setLeftChild(leftChild);
        else fatherNode.setRightChild(leftChild);
    }
    
    public void leftRightDoubleRotation(BinaryNode unbalancedNode){
        leftRotation(unbalancedNode.getLeftChild());
        rightRotation(unbalancedNode);
    }
    
    public void rightLeftDoubleRotation(BinaryNode unbalancedNode){
        rightRotation(unbalancedNode.getRightChild());
        leftRotation(unbalancedNode);
    }

    public int getMaxDepth(BinaryNode node){
        if(node != null){
            int leftDepth = getMaxDepth(node.getLeftChild());
            int rightDepth = getMaxDepth(node.getRightChild());
            if(leftDepth > rightDepth) return ++leftDepth;
            else return ++rightDepth;
        }else return 0;
    }
    
    public void setTreeHeight(){
        setTreeHeight((AVLNode) root);
    }
    
    private void setTreeHeight(AVLNode node){
        if(node != null){
            int maxDepth = getMaxDepth(node);
            node.setHeight(maxDepth);
            setTreeHeight((AVLNode) node.getLeftChild());
            setTreeHeight((AVLNode) node.getRightChild());
        }
    }
    
    public void setBalanceFactor(){
        setBalanceFactor((AVLNode) root);
    }
    
    private void setBalanceFactor(AVLNode node){
        if(node != null){
            AVLNode leftChild = (AVLNode) node.getLeftChild();
            AVLNode rightChild = (AVLNode) node.getRightChild();
            int leftHeight = (leftChild != null) ? leftChild.getHeight() : 0;
            int rightHeight = (rightChild != null) ? rightChild.getHeight() : 0;
            int balanceFactor = rightHeight - leftHeight;
            node.setBalanceFactor(balanceFactor);
            setBalanceFactor(leftChild);
            setBalanceFactor(rightChild);
        }
    }
    
    public void balanceTree(BinaryNode node, int data){
        if(node != null){
           if(node.getData() < data) balanceTree(node.getRightChild(), data);
           else balanceTree(node.getLeftChild(), data);
           AVLNode avlNode = (AVLNode) node;
           int balanceFactor = avlNode.getBalanceFactor();
           if(balanceFactor > 1 || balanceFactor < -1){
               defineRotationType(node);
           }
        }
    }
    
    public void defineRotationType(BinaryNode node){
        AVLNode avlNode = (AVLNode) node;
        int balanceFactor = avlNode.getBalanceFactor();
        if(balanceFactor < -1){
            AVLNode leftChild = (AVLNode) node.getLeftChild();
            if(leftChild.getBalanceFactor() < 0) this.rightRotation(node);
            else this.leftRightDoubleRotation(node);
        }else if(balanceFactor > 1){
            AVLNode rightChild = (AVLNode) node.getRightChild();
            if(rightChild.getBalanceFactor() > 0)this.leftRotation(node);
            else this.rightLeftDoubleRotation(node);
        }
        setTreeHeight();
        setBalanceFactor();
    }
}