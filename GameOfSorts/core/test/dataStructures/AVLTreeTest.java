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
        Dragon dragon = new Commander(0);
        AVLTree instance = new AVLTree();
        instance.insertNode(dragon);
        assertNotNull(instance.searchNode(dragon.getAge()));
    }

    /**
     * Test of deleteNode method, of class AVLTree.
     */
    @Test
    public void testDeleteNode() {
        System.out.println("deleteNode");
        Dragon dragon = new Commander(0);
        dragon.setAge(5);
        AVLTree instance = new AVLTree();
        instance.deleteNode(5);
        assertNull(instance.searchNode(5));
    }

    /**
     * Test of leftRotation method, of class AVLTree.
     */
    @Test
    public void testLeftRotation() {
        System.out.println("leftRotation");
        AVLTree instance = new AVLTree();
        for(int i = 0; i < 3; i++){
            Dragon dragon = new Commander(i);
            dragon.setAge(i);
            instance.insertNode(dragon);
        }
        assertEquals(instance.getRoot().getData().getAge(), 1);
        assertEquals(instance.getRoot().getLeftChild().getData().getAge(), 0);
        assertEquals(instance.getRoot().getRightChild().getData().getAge(), 2);
    }

    /**
     * Test of rightRotation method, of class AVLTree.
     */
    @Test
    public void testRightRotation() {
        System.out.println("rightRotation");
        AVLTree instance = new AVLTree();
        for(int i = 2; i >= 0; i--){
            Dragon dragon = new Commander(i);
            dragon.setAge(i);
            instance.insertNode(dragon);
        }
        assertEquals(instance.getRoot().getData().getAge(), 1);
        assertEquals(instance.getRoot().getLeftChild().getData().getAge(), 0);
        assertEquals(instance.getRoot().getRightChild().getData().getAge(), 2);
    }

    /**
     * Test of leftRightDoubleRotation method, of class AVLTree.
     */
    @Test
    public void testLeftRightDoubleRotation() {
        System.out.println("leftRightDoubleRotation");
        AVLTree instance = new AVLTree();
        Dragon dragon1 = new Commander(0);
        dragon1.setAge(5);
        Dragon dragon2 = new Commander(0);
        dragon2.setAge(3);
        Dragon dragon3 = new Commander(0);
        dragon3.setAge(4);
        instance.insertNode(dragon1);
        instance.insertNode(dragon2);
        instance.insertNode(dragon3);
        assertEquals(instance.getRoot().getData().getAge(), 4);
        assertEquals(instance.getRoot().getLeftChild().getData().getAge(), 3);
        assertEquals(instance.getRoot().getRightChild().getData().getAge(), 5);
    }

    /**
     * Test of rightLeftDoubleRotation method, of class AVLTree.
     */
    @Test
    public void testRightLeftDoubleRotation() {
        System.out.println("rightLeftDoubleRotation");
        AVLTree instance = new AVLTree();
        Dragon dragon1 = new Commander(0);
        dragon1.setAge(3);
        Dragon dragon2 = new Commander(0);
        dragon2.setAge(5);
        Dragon dragon3 = new Commander(0);
        dragon3.setAge(4);
        instance.insertNode(dragon1);
        instance.insertNode(dragon2);
        instance.insertNode(dragon3);
        assertEquals(instance.getRoot().getData().getAge(), 4);
        assertEquals(instance.getRoot().getLeftChild().getData().getAge(), 3);
        assertEquals(instance.getRoot().getRightChild().getData().getAge(), 5);
    }
}
