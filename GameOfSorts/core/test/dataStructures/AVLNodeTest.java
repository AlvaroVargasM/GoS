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
        AVLNode instance = new AVLNode(new Commander(0));
        assertEquals(instance.getHeight(), 0);
    }

    /**
     * Test of setHeight method, of class AVLNode.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        AVLNode instance = new AVLNode(new Commander(0));
        instance.setHeight(5);
        assertEquals(instance.getHeight(), 5);
    }

    /**
     * Test of getBalanceFactor method, of class AVLNode.
     */
    @Test
    public void testGetBalanceFactor() {
        System.out.println("getBalanceFactor");
        AVLNode instance = new AVLNode(new Commander(0));
        assertEquals(instance.getBalanceFactor(), 0);
    }

    /**
     * Test of setBalanceFactor method, of class AVLNode.
     */
    @Test
    public void testSetBalanceFactor() {
        System.out.println("setBalanceFactor");
        AVLNode instance = new AVLNode(new Commander(0));
        instance.setBalanceFactor(5);
        assertEquals(instance.getBalanceFactor(), 5);
    }    
}
