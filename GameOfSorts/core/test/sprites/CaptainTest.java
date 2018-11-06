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
public class CaptainTest {
    
    public CaptainTest() {
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
     * Test of setInfantryInCommand method, of class Captain.
     */
    @Test
    public void testSetInfantryInCommand() {
        System.out.println("setInfantryInCommand");
        String[] infantryInCommand = {"A","B","C"};
        Captain instance = new Captain(0);
        instance.setInfantryInCommand(infantryInCommand);
        assertNotNull(instance.getInfantryInCommand());
    }

    /**
     * Test of getInfantryInCommand method, of class Captain.
     */
    @Test
    public void testGetInfantryInCommand() {
        System.out.println("getInfantryInCommand");
        String[] expResult = {"A","B","C"};
        Captain instance = new Captain(0);
        instance.setInfantryInCommand(expResult);
        String [] result = instance.getInfantryInCommand();
        Assert.assertArrayEquals(expResult,result);
    }
    
}
