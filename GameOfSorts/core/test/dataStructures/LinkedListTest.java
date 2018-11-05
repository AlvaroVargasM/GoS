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

        Object data = null;
        LinkedList instance = new LinkedList();
        instance.add(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteNodeInPosition method, of class LinkedList.
     */
    @Test
    public void testDeleteNodeInPosition() {
        System.out.println("deleteNodeInPosition");
        int position = 0;
        LinkedList instance = new LinkedList();
        instance.deleteNodeInPosition(position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteNode method, of class LinkedList.
     */
    @Test
    public void testDeleteNode() {
        System.out.println("deleteNode");
        Object data = null;
        LinkedList instance = new LinkedList();
        instance.deleteNode(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNodeInPosition method, of class LinkedList.
     */
    @Test
    public void testGetNodeInPosition() {
        System.out.println("getNodeInPosition");
        int position = 0;
        LinkedList instance = new LinkedList();
        LinkedListNode expResult = null;
        LinkedListNode result = instance.getNodeInPosition(position);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNode method, of class LinkedList.
     */
    @Test
    public void testGetNode() {
        System.out.println("getNode");
        Object data = null;
        LinkedList instance = new LinkedList();
        LinkedListNode expResult = null;
        LinkedListNode result = instance.getNode(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteLastNode method, of class LinkedList.
     */
    @Test
    public void testDeleteLastNode() {
        System.out.println("deleteLastNode");
        LinkedList instance = new LinkedList();
        instance.deleteLastNode();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectionSort method, of class LinkedList.
     */
    @Test
    public void testSelectionSort() {
        System.out.println("selectionSort");
        LinkedList instance = new LinkedList();
        instance.selectionSort();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of swapData method, of class LinkedList.
     */
    @Test
    public void testSwapData() {
        System.out.println("swapData");
        LinkedListNode node1 = null;
        LinkedListNode node2 = null;
        LinkedList instance = new LinkedList();
        instance.swapData(node1, node2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertionSort method, of class LinkedList.
     */
    @Test
    public void testInsertionSort() {
        System.out.println("insertionSort");
        LinkedList instance = new LinkedList();
        instance.insertionSort();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quickSort method, of class LinkedList.
     */
    @Test
    public void testQuickSort() {
        System.out.println("quickSort");
        LinkedList instance = new LinkedList();
        instance.quickSort();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstNode method, of class LinkedList.
     */
    @Test
    public void testGetFirstNode() {
        System.out.println("getFirstNode");
        LinkedList instance = new LinkedList();
        LinkedListNode expResult = null;
        LinkedListNode result = instance.getFirstNode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstNode method, of class LinkedList.
     */
    @Test
    public void testSetFirstNode() {
        System.out.println("setFirstNode");
        LinkedListNode firstNode = null;
        LinkedList instance = new LinkedList();
        instance.setFirstNode(firstNode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class LinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        LinkedList instance = new LinkedList();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class LinkedList.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        LinkedList instance = new LinkedList();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class LinkedList.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 0;
        LinkedList instance = new LinkedList();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LinkedList.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LinkedList instance = new LinkedList();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
