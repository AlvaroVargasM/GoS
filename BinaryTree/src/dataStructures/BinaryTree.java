package dataStructures;

public abstract class BinaryTree {
    protected BinaryNode root;
    protected int size;

    public BinaryTree(){
        this.root = null;
        this.size = 0;
    }
    
    public void insertNode(BinaryNode newNode){
        if(searchNode(newNode.getData()) == null){
            if(isEmpty()) root = newNode;
            else insertNode(newNode, root);
            size++;
        }
    }
    
    private void insertNode(BinaryNode newNode, BinaryNode actualNode){
        if(newNode.getData() > actualNode.getData()){
            if(actualNode.getRightChild() == null)actualNode.setRightChild(newNode);
            else insertNode(newNode, actualNode.getRightChild());
        }else{
            if(actualNode.getLeftChild() == null)actualNode.setLeftChild(newNode);
            else insertNode(newNode, actualNode.getLeftChild());
        }
    }
    
    public BinaryNode searchNode(int data){
        BinaryNode node = root;
        while(node != null){
            if(node.getData() == data) return node;
            else if(node.getData() < data) node = node.getRightChild();
            else node = node.getLeftChild();
        }
        return null;
    }
    
    public BinaryNode getFatherNode(int data){
        for(BinaryNode node = root; node != null; 
            node = (node.getData() < data) ? node.getRightChild() : node.getLeftChild()){
            if(node.getRightChild() != null && node.getRightChild().getData() == data ||
               node.getLeftChild() != null && node.getLeftChild().getData() == data) 
                return node;
        }
        return null;
    }
    
    public void deleteNode(int data){
        BinaryNode nodeToDelete = searchNode(data), node = nodeToDelete,
        fatherNode = getFatherNode(data);
        if (nodeToDelete != null){
            if (node.getRightChild() == null) node = node.getLeftChild();
            else if (node.getLeftChild() == null) node = node.getRightChild();
            else{
                BinaryNode temp = findMaxNode(node.getLeftChild());
                BinaryNode previousTemp = getFatherNode(temp.getData());
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
    
    public BinaryNode findMaxNode(BinaryNode node){
        while(node.getRightChild() != null) node = node.getRightChild();
        return node;
    }

    public BinaryNode getRoot() {
        return root;
    }

    public void setRoot(BinaryNode root) {
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
    
    public void infixPrint(BinaryNode node){
        infixPrint(node, "");
    }
    
    private void infixPrint(BinaryNode node, String tabulation){
        if(node != null){
            infixPrint(node.getRightChild(), tabulation + "\t");
            System.out.println(tabulation + node.toString());
            infixPrint(node.getLeftChild(), tabulation + "\t");
        }
    }
}
