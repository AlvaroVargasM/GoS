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
public class BinarySearchTreeTest {
    
    public BinarySearchTreeTest() {
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
     * Test of insertNode method, of class BinarySearchTree.
     */
    @Test
    public void testInsertNode_Dragon() {
        System.out.println("insertNode");
        Dragon dragon = new Commander(0);
        BinarySearchTree instance = new BinarySearchTree();
        instance.insertNode(dragon);
        assertNotNull(instance.searchNode(dragon.getAge()));
    }

    /**
     * Test of insertNode method, of class BinarySearchTree.
     */
    @Test
    public void testInsertNode_BSTNode() {
        System.out.println("insertNode");
        Dragon dragon = new Commander(0);
        BSTNode newNode = new BSTNode(dragon);
        BinarySearchTree instance = new BinarySearchTree();
        instance.insertNode(newNode);
        assertNotNull(instance.searchNode(dragon.getAge()));
    }

    /**
     * Test of searchNode method, of class BinarySearchTree.
     */
    @Test
    public void testSearchNode() {
        System.out.println("searchNode");
        Dragon dragon = new Commander(0);
        dragon.setAge(5);
        BinarySearchTree instance = new BinarySearchTree();
        instance.insertNode(dragon);
        assertEquals(instance.searchNode(5).getData(), dragon);
        assertNull(instance.searchNode(0));
    }

    /**
     * Test of getFatherNode method, of class BinarySearchTree.
     */
    @Test
    public void testGetFatherNode() {
        System.out.println("getFatherNode");
        Dragon dragon = new Commander(0);
        dragon.setAge(5);
        Dragon dragon2 = new Commander(0);
        dragon2.setAge(6);
        BinarySearchTree instance = new BinarySearchTree();
        instance.insertNode(dragon);
        instance.insertNode(dragon2);
        assertEquals(instance.getFatherNode(6).getData(), dragon);
    }

    /**
     * Test of deleteNode method, of class BinarySearchTree.
     */
    @Test
    public void testDeleteNode() {
        System.out.println("deleteNode");
        Dragon dragon = new Commander(0);
        dragon.setAge(5);
        BinarySearchTree instance = new BinarySearchTree();
        instance.deleteNode(5);
        assertNull(instance.searchNode(5));
    }

    /**
     * Test of findMaxNode method, of class BinarySearchTree.
     */
    @Test
    public void testFindMaxNode() {
        System.out.println("findMaxNode");
        Dragon dragon = new Commander(0);
        dragon.setAge(5);
        Dragon dragon2 = new Commander(0);
        dragon2.setAge(6);
        BinarySearchTree instance = new BinarySearchTree();
        instance.insertNode(dragon);
        instance.insertNode(dragon2);
        assertEquals(instance.findMaxNode(instance.root).getData().getAge(), 6);
    }

    /**
     * Test of getRoot method, of class BinarySearchTree.
     */
    @Test
    public void testGetRoot() {
        System.out.println("getRoot");
        Dragon dragon = new Commander(0);
        dragon.setAge(5);
        BinarySearchTree instance = new BinarySearchTree();
        instance.insertNode(dragon);
        assertEquals(instance.getRoot().getData().getAge(), 5);
    }

    /**
     * Test of setRoot method, of class BinarySearchTree.
     */
    @Test
    public void testSetRoot() {
        System.out.println("setRoot");
        Dragon dragon = new Commander(0);
        BinarySearchTree instance = new BinarySearchTree();
        instance.insertNode(dragon);
        assertNotNull(instance.getRoot().getData().getAge());
    }

    /**
     * Test of getSize method, of class BinarySearchTree.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Dragon dragon = new Commander(0);
        BinarySearchTree instance = new BinarySearchTree();
        instance.insertNode(dragon);
        assertEquals(instance.getSize(), 1);
    }

    /**
     * Test of isEmpty method, of class BinarySearchTree.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BinarySearchTree instance = new BinarySearchTree();
        assertTrue(instance.isEmpty());
        instance.insertNode(new Commander(0));
        assertFalse(instance.isEmpty());
    }    
}
