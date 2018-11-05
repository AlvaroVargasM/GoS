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
public class LinkedListNodeTest {
    
    public LinkedListNodeTest() {
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
     * Test of getPosition method, of class LinkedListNode.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        LinkedListNode instance = new LinkedListNode("",1);
        assertNotNull(instance.getPosition());
    }

    /**
     * Test of setPosition method, of class LinkedListNode.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        int position = 0;
        LinkedListNode instance = new LinkedListNode("",1);
        instance.setPosition(position);
        assertEquals(position, instance.getPosition());
    }

    /**
     * Test of getNextNode method, of class LinkedListNode.
     */
    @Test
    public void testGetNextNode() {
        System.out.println("getNextNode");
        LinkedListNode instance = new LinkedListNode("",1);
        LinkedListNode expResult = null;
        LinkedListNode result = instance.getNextNode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNextNode method, of class LinkedListNode.
     */
    @Test
    public void testSetNextNode() {
        System.out.println("setNextNode");
        LinkedListNode instance = new LinkedListNode("",1);
        LinkedListNode nextNode = new LinkedListNode("",1);
        instance.setNextNode(nextNode);
        assertNotNull(instance.getNextNode());
    }

    /**
     * Test of getData method, of class LinkedListNode.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        LinkedListNode instance = new LinkedListNode("Data",1);
        assertNotNull(instance.getData());
    }

    /**
     * Test of setData method, of class LinkedListNode.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        LinkedListNode instance = new LinkedListNode("Data",1);
        String data = "newData";
        instance.setData(data);
        assertEquals(data,instance.getData());
    }

    /**
     * Test of isVisited method, of class LinkedListNode.
     */
    @Test
    public void testIsVisited() {
        System.out.println("isVisited");
        LinkedListNode instance = new LinkedListNode("Data",1);
        assertNotNull(instance.isVisited());
    }

    /**
     * Test of setVisited method, of class LinkedListNode.
     */
    @Test
    public void testSetVisited() {
        System.out.println("setVisited");
        boolean visited = true;
        LinkedListNode instance = new LinkedListNode("Data",1);
        instance.setVisited(visited);
        assertEquals(visited,instance.isVisited());
    }
}
