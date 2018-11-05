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
public class BNodeTest {
    
    public BNodeTest() {
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
     * Test of isLeaf method, of class BNode.
     */
    @Test
    public void testIsLeaf() {
        System.out.println("isLeaf");
        BNode instance = null;
        boolean expResult = false;
        boolean result = instance.isLeaf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class BNode.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        Object obj = null;
        BNode instance = null;
        int expResult = 0;
        //int result = instance.search(obj);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertKeyAndChild method, of class BNode.
     */
    @Test
    public void testInsertKeyAndChild() {
        System.out.println("insertKeyAndChild");
        BNode instance = null;
        //instance.insertKeyAndChild(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeKeyAndChild method, of class BNode.
     */
    @Test
    public void testRemoveKeyAndChild() {
        System.out.println("removeKeyAndChild");
        int keyIndex = 0;
        int childIndex = 0;
        BNode instance = null;
        Object expResult = null;
        Object result = instance.removeKeyAndChild(keyIndex, childIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of splitChild method, of class BNode.
     */
    @Test
    public void testSplitChild() {
        System.out.println("splitChild");
        int index = 0;
        BNode instance = null;
        instance.splitChild(index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ensureChildRemove method, of class BNode.
     */
    @Test
    public void testEnsureChildRemove() {
        System.out.println("ensureChildRemove");
        int index = 0;
        BNode instance = null;
        BNode expResult = null;
        BNode result = instance.ensureChildRemove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mergeChildren method, of class BNode.
     */
    @Test
    public void testMergeChildren() {
        System.out.println("mergeChildren");
        int index = 0;
        BNode instance = null;
        instance.mergeChildren(index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeMin method, of class BNode.
     */
    @Test
    public void testRemoveMin() {
        System.out.println("removeMin");
        BNode instance = null;
        Object expResult = null;
        Object result = instance.removeMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeMax method, of class BNode.
     */
    @Test
    public void testRemoveMax() {
        System.out.println("removeMax");
        BNode instance = null;
        Object expResult = null;
        Object result = instance.removeMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkStructure method, of class BNode.
     */
    @Test
    public void testCheckStructure() {
        System.out.println("checkStructure");
        boolean isRoot = false;
        int leafDepth = 0;
        Object min = null;
        Object max = null;
        BNode instance = null;
        int expResult = 0;
        //int result = instance.checkStructure(isRoot, leafDepth, min, max);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
