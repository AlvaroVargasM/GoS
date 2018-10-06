package dataStructures;

public class BinarySearchTree {
    private TreeNode root;
    private int size;

    public BinarySearchTree(){
        this.root = null;
        this.size = 0;
    }
    
    public void insertNode(int data){
        if(searchNode(data) == null){
            TreeNode newNode = new TreeNode(data);
            if(isEmpty()) root = newNode;
            else insertNode(newNode, root);
            size++;
        }
    }
    
    private void insertNode(TreeNode newNode, TreeNode actualNode){
        if(newNode.getData() > actualNode.getData()){
            if(actualNode.getRightChild() == null)actualNode.setRightChild(newNode);
            else insertNode(newNode, actualNode.getRightChild());
        }else{
            if(actualNode.getLeftChild() == null)actualNode.setLeftChild(newNode);
            else insertNode(newNode, actualNode.getLeftChild());
        }
    }
    
    public TreeNode searchNode(int data){
        TreeNode node = root;
        while(node != null){
            if(node.getData() == data) return node;
            else if(node.getData() < data) node = node.getRightChild();
            else node = node.getLeftChild();
        }
        return null;
    }
    
    public TreeNode getFatherNode(int data){
        for(TreeNode node = root; node != null; 
            node = (node.getData() < data) ? node.getRightChild() : node.getLeftChild()){
            if(node.getRightChild() != null && node.getRightChild().getData() == data ||
               node.getLeftChild() != null && node.getLeftChild().getData() == data) 
                return node;
        }
        return null;
    }
    
    public void deleteNode(int data){
        TreeNode nodeToDelete = searchNode(data), fatherNode = getFatherNode(data), 
        node = nodeToDelete;
        if (nodeToDelete != null){
            if (node.getRightChild() == null) node = node.getLeftChild();
            else if (node.getLeftChild() == null) node = node.getRightChild();
            else{
                TreeNode temp = findMaxNode(node.getLeftChild());
                TreeNode previousTemp = getFatherNode(temp.getData());
                node.setData(temp.getData());
                if(previousTemp == node) previousTemp.setLeftChild(temp.getLeftChild());
                else previousTemp.setRightChild(temp.getLeftChild());
            }
            if (nodeToDelete == root) root = node;
            else if (fatherNode.getLeftChild() == nodeToDelete) fatherNode.setLeftChild(node);
            else fatherNode.setRightChild(node);
        }
    }
    
    public TreeNode findMaxNode(TreeNode node){
        while(node.getRightChild() != null) node = node.getRightChild();
        return node;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
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
    
    public void infixPrint(TreeNode node){
        infixPrint(node, "");
    }
    
    private void infixPrint(TreeNode node, String tabulation){
        if(node != null){
            infixPrint(node.getRightChild(), tabulation + "\t");
            System.out.println(tabulation + node.toString());
            infixPrint(node.getLeftChild(), tabulation + "\t");
        }
    }
}