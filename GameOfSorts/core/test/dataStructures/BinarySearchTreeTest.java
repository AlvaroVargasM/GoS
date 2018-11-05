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
        Dragon dragon = null;
        BinarySearchTree instance = new BinarySearchTree();
        instance.insertNode(dragon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertNode method, of class BinarySearchTree.
     */
    @Test
    public void testInsertNode_BSTNode() {
        System.out.println("insertNode");
        BSTNode newNode = null;
        BinarySearchTree instance = new BinarySearchTree();
        instance.insertNode(newNode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchNode method, of class BinarySearchTree.
     */
    @Test
    public void testSearchNode() {
        System.out.println("searchNode");
        int data = 0;
        BinarySearchTree instance = new BinarySearchTree();
        BSTNode expResult = null;
        BSTNode result = instance.searchNode(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFatherNode method, of class BinarySearchTree.
     */
    @Test
    public void testGetFatherNode() {
        System.out.println("getFatherNode");
        int data = 0;
        BinarySearchTree instance = new BinarySearchTree();
        BSTNode expResult = null;
        BSTNode result = instance.getFatherNode(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteNode method, of class BinarySearchTree.
     */
    @Test
    public void testDeleteNode() {
        System.out.println("deleteNode");
        int data = 0;
        BinarySearchTree instance = new BinarySearchTree();
        instance.deleteNode(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMaxNode method, of class BinarySearchTree.
     */
    @Test
    public void testFindMaxNode() {
        System.out.println("findMaxNode");
        BSTNode node = null;
        BinarySearchTree instance = new BinarySearchTree();
        BSTNode expResult = null;
        BSTNode result = instance.findMaxNode(node);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoot method, of class BinarySearchTree.
     */
    @Test
    public void testGetRoot() {
        System.out.println("getRoot");
        BinarySearchTree instance = new BinarySearchTree();
        BSTNode expResult = null;
        BSTNode result = instance.getRoot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoot method, of class BinarySearchTree.
     */
    @Test
    public void testSetRoot() {
        System.out.println("setRoot");
        BSTNode root = null;
        BinarySearchTree instance = new BinarySearchTree();
        instance.setRoot(root);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class BinarySearchTree.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        BinarySearchTree instance = new BinarySearchTree();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class BinarySearchTree.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 0;
        BinarySearchTree instance = new BinarySearchTree();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class BinarySearchTree.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BinarySearchTree instance = new BinarySearchTree();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infixPrint method, of class BinarySearchTree.
     */
    @Test
    public void testInfixPrint() {
        System.out.println("infixPrint");
        BSTNode node = null;
        BinarySearchTree instance = new BinarySearchTree();
        instance.infixPrint(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
