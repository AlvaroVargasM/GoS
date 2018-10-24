package dataStructures;

public class BTreeNode {
    private int degree;
    private int MaxAmountOfKeys;
    private LinkedList<Integer> keys;
    private LinkedList<BTreeNode> children;
    
    public BTreeNode(int degree){
        this.degree = degree;
        MaxAmountOfKeys = degree-1;
        keys = new LinkedList<>();
        children = new LinkedList<>();
    }
    
    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public int getAmountOfKeys() {
        return MaxAmountOfKeys;
    }

    public void setAmountOfKeys(int MaxAmountOfKeys) {
        this.MaxAmountOfKeys = MaxAmountOfKeys;
    }

    public LinkedList<Integer> getKeys() {
        return keys;
    }

    public void setKeys(LinkedList<Integer> keys) {
        this.keys = keys;
    }

    public LinkedList<BTreeNode> getChildren() {
        return children;
    }

    public void setChildren(LinkedList<BTreeNode> children) {
        this.children = children;
    }
    
    public String toString(){
        return "";
    }
}
