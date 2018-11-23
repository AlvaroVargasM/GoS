package dataStructures;

import java.util.Random;
import sprites.Dragon;

/**
 * LinkedList main purpose is to point to the firstNode of the list. It allows to
 * insert a new LinkedListNode to this list and store any amount of data in a 
 * lineal structure. It also has some methods to delete the last node of the list
 * or find an specific node in a position.
 * This LinkedList also points to a next LinkedList, meaning that it could also
 * be a node of a LinkedList with LinkedLists as nodes.
 * @author Erick Barrantes
 * @param <GenericType>
 */
public class LinkedList<GenericType>{
    
    private LinkedListNode firstNode;
    private int size;
    
    /**
     * LinkedList constructor. Assigns the initial values to the attributes.
     */
    public LinkedList(){
        firstNode = null;
        this.size = 0;
    }

    /**
     * Receives the data necessary to create a node and insert it in the list.
     * @param position
     * @param data
     */
    public void addInPosition(GenericType data, int position){
        if(position < 0) return;
        if(position > size) position = size;
        LinkedListNode newNode = new LinkedListNode(data, position);
        if(position == 0){
            newNode.setNextNode(firstNode);
            setFirstNode(newNode);
        }
        else{
            LinkedListNode previousNode = getNodeInPosition(position - 1);
            LinkedListNode nextNode = previousNode.getNextNode();
            newNode.setNextNode(nextNode);
            previousNode.setNextNode(newNode);
        }
        updatePositions();
        size++;
    }
    
     /**
     * Receives the data necessary to create a node and insert it in the list.
     * @param data
     */
    public void add(GenericType data){
        this.addInPosition(data, size);
    }
    
    public void deleteNodeInPosition(int position){
        if(position < 0 || position > size)return;
        if(position == 0)
            setFirstNode(firstNode.getNextNode());
        else{
            LinkedListNode previousNode = getNodeInPosition(position - 1);
            LinkedListNode nodeToDelete = previousNode.getNextNode();
            previousNode.setNextNode(nodeToDelete.getNextNode());
        }
        updatePositions();
        size--;
    }
    
    public void deleteNode(GenericType data){
        deleteNodeInPosition(getNode(data).getPosition());
    }
    
    /**
     * Searches and returns the node in the specified position.
     * @param position
     * @return 
     * @return: node in position: LinkedListNode
     */
    public LinkedListNode getNodeInPosition(int position){
        for(LinkedListNode node = firstNode; node != null; node = node.getNextNode()){
            if(position == node.getPosition()){
                return node;
            }
        }return null;
    }
    
    public LinkedListNode getNode(GenericType data){
        for(LinkedListNode node = firstNode; node != null; node = node.getNextNode()){
            if(data == node.getData()){
                return node;
            }
        }return null;
    }
    
    /**
     * Deletes the last inserted node of the list.
     */
    public void deleteLastNode(){
        this.deleteNodeInPosition(size-1);
    }
    
    private void updatePositions(){
        int pos = 0;
        for(LinkedListNode node = firstNode; node != null; node = node.getNextNode()){
            node.setPosition(pos);
            pos++;
        }
    }
    
    public void selectionSort(){
        if(firstNode != null){
            Random random = new Random();
            selectionSort(random.nextBoolean());
            updatePositions();
        }
    }
    
    public void selectionSort(boolean ascending){
        for(LinkedListNode node1 = getFirstNode(); node1.getNextNode() != null;
            node1 = node1.getNextNode()){
            for(LinkedListNode node2 = node1.getNextNode(); node2 != null;
                node2 = node2.getNextNode()){
                if(((Dragon) node1.getData()).getAge() > ((Dragon) node2.getData()).getAge()){
                    if(ascending) swapData(node1, node2);
                }
                else{
                    if(!ascending) swapData(node2, node1);
                }
            }
        }updatePositions();
    }
    
    private void swapData(LinkedListNode node1, LinkedListNode node2){
        Dragon dragon = (Dragon) node2.getData();
        node2.setData(node1.getData());
        node1.setData(dragon);   
    }
    
    public void insertionSort(){
        if(firstNode != null){
            Random random = new Random();
            insertionSort(random.nextBoolean());
            updatePositions();
        }
    }
    
    public void insertionSort(boolean ascending){
        int lenght = getSize();
        for(int i = 1; i < lenght; i++){
            Dragon key = (Dragon) getNodeInPosition(i).getData(); 
            int j = i-1;
            if(ascending){
                while (j>=0 && ((Dragon)getNodeInPosition(j).getData()).getChargeSpeed() 
                       > key.getChargeSpeed()){ 
                    getNodeInPosition(j+1).setData(getNodeInPosition(j).getData());
                    j--;
                }
            }else{
                while (j>=0 && ((Dragon)getNodeInPosition(j).getData()).getChargeSpeed() 
                       < key.getChargeSpeed()){ 
                    getNodeInPosition(j+1).setData(getNodeInPosition(j).getData());
                    j--;
                }
            }getNodeInPosition(j+1).setData(key);
        }
    }
    public void quickSort(){
        if(firstNode != null){
            Random random = new Random();
            quickSort(0, size-1,random.nextBoolean());
            updatePositions();
        }
    }
            
    public void quickSort(int low, int high, boolean ascending){ 
        if (low < high){
            int pi = partition(low, high, ascending);
            
            quickSort(low, pi-1, ascending); 
            quickSort(pi+1, high, ascending); 
        } 
    }
    
    private int partition(int low, int high, boolean ascending){ 
        Dragon pivot = (Dragon) getNodeInPosition(high).getData();  
        int i = (low-1);
        for (int j=low; j<high; j++){
            if(ascending){
                if (((Dragon)getNodeInPosition(j).getData()).getAge() <= pivot.getAge()){
                    i++; 
                    swapData(getNodeInPosition(j), getNodeInPosition(i));
                }
            }else{
                if (((Dragon)getNodeInPosition(j).getData()).getAge() >= pivot.getAge()){
                    i++;
                    swapData(getNodeInPosition(i), getNodeInPosition(j));
                }
            }
        } 
        swapData(getNodeInPosition(high), getNodeInPosition(i+1));
        return i+1; 
    } 
    
    /**
     * Getter for FirstNode attribute.
     * @return firstNode: LinkedListNode
     */
    public LinkedListNode getFirstNode(){
        return firstNode;
    }
    
    /**
     * Setter for firstNode attribute.
     * @param firstNode
     */
    public void setFirstNode(LinkedListNode firstNode) {
        this.firstNode = firstNode;
    }
    
    /**
     * Indicates if the list its empty (true) or not (false)
     * @return boolean
     */
    public boolean isEmpty() {
        return firstNode == null;
    }

    /**
     * Getter for size attribute.
     * @return size: int
     */
    public int getSize() {
        return size;
    }

    /**
     * Setter for size attribute.
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    public String toString(){
        String str = "[ ";
        for(LinkedListNode node = firstNode; node != null; node = node.getNextNode()){
            str += node.toString() + " -> ";
        }
        str += "null ]";
        return str;
    }
}
