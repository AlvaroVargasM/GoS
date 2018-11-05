/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructures;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
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
public class BTreeTest {
    
    public BTreeTest() {
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
     * Test of size method, of class BTree.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        BTree instance = null;
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class BTree.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        BTree instance = null;
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class BTree.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object obj = null;
        BTree instance = null;
        boolean expResult = false;
        boolean result = instance.contains(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class BTree.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object obj = null;
        BTree instance = null;
        boolean expResult = false;
        boolean result = instance.add(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class BTree.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object obj = null;
        BTree instance = null;
        boolean expResult = false;
        boolean result = instance.remove(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of first method, of class BTree.
     */
    @Test
    public void testFirst() {
        System.out.println("first");
        BTree instance = null;
        Object expResult = null;
        Object result = instance.first();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of last method, of class BTree.
     */
    @Test
    public void testLast() {
        System.out.println("last");
        BTree instance = null;
        Object expResult = null;
        Object result = instance.last();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class BTree.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        BTree instance = null;
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comparator method, of class BTree.
     */
    @Test
    public void testComparator() {
        System.out.println("comparator");
        BTree instance = null;
        Comparator expResult = null;
        Comparator result = instance.comparator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subSet method, of class BTree.
     */
    @Test
    public void testSubSet() {
        System.out.println("subSet");
        Object fromElement = null;
        Object toElement = null;
        BTree instance = null;
        SortedSet expResult = null;
        SortedSet result = instance.subSet(fromElement, toElement);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of headSet method, of class BTree.
     */
    @Test
    public void testHeadSet() {
        System.out.println("headSet");
        Object toElement = null;
        BTree instance = null;
        SortedSet expResult = null;
        SortedSet result = instance.headSet(toElement);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tailSet method, of class BTree.
     */
    @Test
    public void testTailSet() {
        System.out.println("tailSet");
        Object fromElement = null;
        BTree instance = null;
        SortedSet expResult = null;
        SortedSet result = instance.tailSet(fromElement);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkStructure method, of class BTree.
     */
    @Test
    public void testCheckStructure() {
        System.out.println("checkStructure");
        BTree instance = null;
        instance.checkStructure();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
