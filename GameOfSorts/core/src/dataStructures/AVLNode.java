package dataStructures;

import sprites.Dragon;

public class AVLNode extends BSTNode{
    private int height;
    private int balanceFactor;
    
    public AVLNode(Dragon data){
        super(data);
        this.height = 0;
        this.balanceFactor = 0;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBalanceFactor() {
        return balanceFactor;
    }

    public void setBalanceFactor(int balanceFactor) {
        this.balanceFactor = balanceFactor;
    }
    
    public String toString(){
        String str = Integer.toString(data.getAge());
        return str;
    }
    
}
