/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprites;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luism
 */
public class CommanderTest {
    
    public CommanderTest() {
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
     * Test of setDragonsInCommand method, of class Commander.
     */
    @Test
    public void testSetDragonsInCommand() {
        System.out.println("setDragonsInCommand");
        String[] dragonsInCommand = {"A","B","C"};
        Commander instance = new Commander(0);
        instance.setDragonsInCommand(dragonsInCommand);
        assertNotNull(instance.getDragonsInCommand());
    }

    /**
     * Test of getDragonsInCommand method, of class Commander.
     */
    @Test
    public void testGetDragonsInCommand() {
        System.out.println("getDragonsInCommand");
        String[] expResult = {"A","B","C"};
        Commander instance = new Commander(0);
        instance.setDragonsInCommand(expResult);
        String [] result = instance.getDragonsInCommand();
        Assert.assertArrayEquals(expResult,result);
    }
    
}
