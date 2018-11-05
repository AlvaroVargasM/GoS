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
public class AVLTreeTest {
    
    public AVLTreeTest() {
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
     * Test of insertNode method, of class AVLTree.
     */
    @Test
    public void testInsertNode() {
        System.out.println("insertNode");
        Dragon data = null;
        AVLTree instance = new AVLTree();
        instance.insertNode(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteNode method, of class AVLTree.
     */
    @Test
    public void testDeleteNode() {
        System.out.println("deleteNode");
        int data = 0;
        AVLTree instance = new AVLTree();
        instance.deleteNode(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of balanceTree method, of class AVLTree.
     */
    @Test
    public void testBalanceTree() {
        System.out.println("balanceTree");
        BSTNode node = null;
        int data = 0;
        AVLTree instance = new AVLTree();
        instance.balanceTree(node, data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of defineRotationType method, of class AVLTree.
     */
    @Test
    public void testDefineRotationType() {
        System.out.println("defineRotationType");
        BSTNode node = null;
        AVLTree instance = new AVLTree();
        instance.defineRotationType(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leftRotation method, of class AVLTree.
     */
    @Test
    public void testLeftRotation() {
        System.out.println("leftRotation");
        BSTNode unbalancedNode = null;
        AVLTree instance = new AVLTree();
        instance.leftRotation(unbalancedNode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rightRotation method, of class AVLTree.
     */
    @Test
    public void testRightRotation() {
        System.out.println("rightRotation");
        BSTNode unbalancedNode = null;
        AVLTree instance = new AVLTree();
        instance.rightRotation(unbalancedNode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leftRightDoubleRotation method, of class AVLTree.
     */
    @Test
    public void testLeftRightDoubleRotation() {
        System.out.println("leftRightDoubleRotation");
        BSTNode unbalancedNode = null;
        AVLTree instance = new AVLTree();
        instance.leftRightDoubleRotation(unbalancedNode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rightLeftDoubleRotation method, of class AVLTree.
     */
    @Test
    public void testRightLeftDoubleRotation() {
        System.out.println("rightLeftDoubleRotation");
        BSTNode unbalancedNode = null;
        AVLTree instance = new AVLTree();
        instance.rightLeftDoubleRotation(unbalancedNode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxDepth method, of class AVLTree.
     */
    @Test
    public void testGetMaxDepth() {
        System.out.println("getMaxDepth");
        BSTNode node = null;
        AVLTree instance = new AVLTree();
        int expResult = 0;
        int result = instance.getMaxDepth(node);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTreeHeight method, of class AVLTree.
     */
    @Test
    public void testSetTreeHeight() {
        System.out.println("setTreeHeight");
        AVLTree instance = new AVLTree();
        instance.setTreeHeight();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBalanceFactor method, of class AVLTree.
     */
    @Test
    public void testSetBalanceFactor() {
        System.out.println("setBalanceFactor");
        AVLTree instance = new AVLTree();
        instance.setBalanceFactor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
