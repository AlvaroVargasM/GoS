/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructures;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sprites.Commander;
import sprites.Dragon;

/**
 *
 * @author luism
 */
public class LinkedListTest {
    
    public LinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addInPosition method, of class LinkedList.
     */
    @Test
    public void testAddInPosition() {
        System.out.println("addInPosition");
        Object data = "data";
        int position = 0;
        LinkedList instance = new LinkedList();
        instance.addInPosition(data, position);
        assertEquals(data, instance.getNodeInPosition(position).getData());
    }

    /**
     * Test of add method, of class LinkedList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object data = "data";
        LinkedList instance = new LinkedList();
        instance.add(data);
        LinkedListNode lastNode = instance.getFirstNode();
        while(lastNode.getNextNode() != null)
            lastNode = lastNode.getNextNode();
        assertEquals(data, lastNode.getData());
    }

    /**
     * Test of deleteNodeInPosition method, of class LinkedList.
     */
    @Test
    public void testDeleteNodeInPosition() {
        System.out.println("deleteNodeInPosition");
        LinkedList instance = new LinkedList();
        for(Integer i = 0; i < 5; i++)
            instance.add(i);
        Object data = 3;
        instance.deleteNodeInPosition(3);
        assertNull(instance.getNode(data));
    }

    /**
     * Test of deleteNode method, of class LinkedList.
     */
    @Test
    public void testDeleteNode() {
        System.out.println("deleteNode");
        LinkedList instance = new LinkedList();
        for(Integer i = 0; i < 5; i++)
            instance.add(i);
        Object data = 3;
        instance.deleteNode(data);
        assertNull(instance.getNode(data));
    }

    /**
     * Test of getNodeInPosition method, of class LinkedList.
     */
    @Test
    public void testGetNodeInPosition() {
        System.out.println("getNodeInPosition");
        LinkedList instance = new LinkedList();
        for(Integer i = 0; i < 5; i++)
            instance.add(i);
        assertEquals(3, instance.getNodeInPosition(3).getData());
    }

    /**
     * Test of getNode method, of class LinkedList.
     */
    @Test
    public void testGetNode() {
        System.out.println("getNode");
        LinkedList instance = new LinkedList();
        for(Integer i = 0; i < 5; i++)
            instance.add(i);
        assertEquals(3, instance.getNode(3).getData());
    }

    /**
     * Test of deleteLastNode method, of class LinkedList.
     */
    @Test
    public void testDeleteLastNode() {
        System.out.println("deleteLastNode");
        LinkedList instance = new LinkedList();
        for(Integer i = 0; i < 5; i++)
            instance.add(i);
        instance.deleteLastNode();
        assertNull(instance.getNode(4));
    }

    /**
     * Test of selectionSort method, of class LinkedList.
     */
    @Test
    public void testSelectionSort() {
        System.out.println("selectionSort");
        LinkedList instance = new LinkedList();
        for(int i = 4; i >= 0; i--){
            Dragon dragon = new Commander(i);
            dragon.setAge(i);
            instance.add(dragon);
        }
        instance.selectionSort(true);
        boolean test = isAgeAscending(instance);
        assertTrue(test);
    }
    
    public boolean isAgeAscending(LinkedList instance){ 
        for(LinkedListNode node = instance.getFirstNode(); node.getNextNode() != null;
            node = node.getNextNode()){
            if(((Dragon)node.getData()).getAge() > ((Dragon)node.getNextNode().getData()).getAge()) 
                return false;
        }return true;
    }
    
    public boolean isChargeSpeedAscending(LinkedList instance){ 
        for(LinkedListNode node = instance.getFirstNode(); node.getNextNode() != null;
            node = node.getNextNode()){
            if(((Dragon)node.getData()).getChargeSpeed() > 
                ((Dragon)node.getNextNode().getData()).getChargeSpeed()) 
                return false;
        }return true;
    }

    /**
     * Test of insertionSort method, of class LinkedList.
     */
    @Test
    public void testInsertionSort() {
        System.out.println("insertionSort");
        LinkedList instance = new LinkedList();
        for(int i = 4; i >= 0; i--){
            Dragon dragon = new Commander(i);
            dragon.setChargeSpeed(i);
            instance.add(dragon);
        }
        instance.insertionSort(true);
        boolean test = isChargeSpeedAscending(instance);
        assertTrue(test);
    }

    /**
     * Test of quickSort method, of class LinkedList.
     */
    @Test
    public void testQuickSort() {
        System.out.println("quickSort");
        LinkedList instance = new LinkedList();
        for(int i = 4; i >= 0; i--){
            Dragon dragon = new Commander(i);
            dragon.setAge(i);
            instance.add(dragon);
        }
        instance.quickSort(0, instance.getSize()-1, true);
        boolean test = isAgeAscending(instance);
        assertTrue(test);
    }

    /**
     * Test of isEmpty method, of class LinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        LinkedList instance = new LinkedList();
        assertTrue(instance.isEmpty());
        instance.add(0);
        assertFalse(instance.isEmpty());
    }
}
