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
public class BSTNodeTest {
    
    public BSTNodeTest() {
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
     * Test of getLeftChild method, of class BSTNode.
     */
    @Test
    public void testGetLeftChild() {
        System.out.println("getLeftChild");
        BSTNode instance = null;
        BSTNode expResult = null;
        BSTNode result = instance.getLeftChild();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLeftChild method, of class BSTNode.
     */
    @Test
    public void testSetLeftChild() {
        System.out.println("setLeftChild");
        BSTNode leftChild = null;
        BSTNode instance = null;
        instance.setLeftChild(leftChild);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRightChild method, of class BSTNode.
     */
    @Test
    public void testGetRightChild() {
        System.out.println("getRightChild");
        BSTNode instance = null;
        BSTNode expResult = null;
        BSTNode result = instance.getRightChild();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRightChild method, of class BSTNode.
     */
    @Test
    public void testSetRightChild() {
        System.out.println("setRightChild");
        BSTNode rightChild = null;
        BSTNode instance = null;
        instance.setRightChild(rightChild);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class BSTNode.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        BSTNode instance = null;
        Dragon expResult = null;
        Dragon result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class BSTNode.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        Dragon data = null;
        BSTNode instance = null;
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class BSTNode.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BSTNode instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
