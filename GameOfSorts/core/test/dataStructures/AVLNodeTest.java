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
public class AVLNodeTest {
    
    public AVLNodeTest() {
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
     * Test of getHeight method, of class AVLNode.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        AVLNode instance = null;
        int expResult = 0;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class AVLNode.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        int height = 0;
        AVLNode instance = null;
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalanceFactor method, of class AVLNode.
     */
    @Test
    public void testGetBalanceFactor() {
        System.out.println("getBalanceFactor");
        AVLNode instance = null;
        int expResult = 0;
        int result = instance.getBalanceFactor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBalanceFactor method, of class AVLNode.
     */
    @Test
    public void testSetBalanceFactor() {
        System.out.println("setBalanceFactor");
        int balanceFactor = 0;
        AVLNode instance = null;
        instance.setBalanceFactor(balanceFactor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AVLNode.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AVLNode instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
