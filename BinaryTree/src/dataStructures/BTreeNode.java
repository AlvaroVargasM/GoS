package dataStructures;

public class BTreeNode {
    private int degree;
    private int MaxAmountOfKeys;
    private LinkedList<Integer> keys;
    private BTreeNode[] children;
    
    public BTreeNode(int degree){
        this.degree = degree;
        MaxAmountOfKeys = degree-1;
        keys = new LinkedList<>();
        children = new BTreeNode[degree];
    }
    
    public Integer getKeyInPosition(int position){
        Integer key = null;
        if(position < MaxAmountOfKeys && 0 <= position)
            key = (Integer) keys.getNodeInPosition(position).getData();
        return key;
    }
    
    public void setKeyInPosition(int key, int position){
        keys.add(key, position);
    }
    
    public BTreeNode getChildrenInPosition(int position){
        BTreeNode node = null;
        if(position < degree && 0 <= position) node = children[position];
        return node;
    }
    
    public void setChildrenInPosition(int position, BTreeNode node){
        if(position < degree && 0 <= position) children[position] = node;
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

    public BTreeNode[] getChildren() {
        return children;
    }

    public void setChildren(BTreeNode[] children) {
        this.children = children;
    }
    
    public String toString(){
        String str = "[";
        for(int i = 0; i < keys.getSize(); i++){
            str += Integer.toString((Integer)keys.getNodeInPosition(i).getData());
            if( i+1 == keys.getSize()) str += "]";
            else str += ", ";
        }return str;
    }
}
