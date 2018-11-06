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
        BSTNode instance = new BSTNode(new Commander(0));
        Dragon dragon = new Commander(1);
        instance.setLeftChild(new BSTNode(dragon));
        assertEquals(instance.getLeftChild().getData(), dragon);
    }

    /**
     * Test of setLeftChild method, of class BSTNode.
     */
    @Test
    public void testSetLeftChild() {
        System.out.println("setLeftChild");
        BSTNode instance = new BSTNode(new Commander(0));
        instance.setLeftChild(new BSTNode(new Commander(1)));
        assertNotNull(instance.getLeftChild());
    }

    /**
     * Test of getRightChild method, of class BSTNode.
     */
    @Test
    public void testGetRightChild() {
        System.out.println("getRightChild");
        BSTNode instance = new BSTNode(new Commander(0));
        Dragon dragon = new Commander(1);
        instance.setRightChild(new BSTNode(dragon));
        assertEquals(instance.getRightChild().getData(), dragon);
    }

    /**
     * Test of setRightChild method, of class BSTNode.
     */
    @Test
    public void testSetRightChild() {
        System.out.println("setRightChild");
        BSTNode instance = new BSTNode(new Commander(0));
        instance.setRightChild(new BSTNode(new Commander(1)));
        assertNotNull(instance.getRightChild());
    }

    /**
     * Test of getData method, of class BSTNode.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Dragon dragon = new Commander(0);
        BSTNode instance = new BSTNode(dragon);
        assertEquals(instance.getData(), dragon);
        
    }

    /**
     * Test of setData method, of class BSTNode.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        Dragon dragon = new Commander(0); dragon.setAge(500);
        BSTNode instance = new BSTNode(new Commander(1));
        instance.setData(dragon);
        assertEquals(instance.getData().getAge(), dragon.getAge());
    }
}
