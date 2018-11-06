/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprites;

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
public class InfantryTest {
    
    public InfantryTest() {
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
     * Test of setCaptain method, of class Infantry.
     */
    @Test
    public void testSetCaptain() {
        System.out.println("setCaptain");
        String expResult = "A";
        Infantry instance = new Infantry(0);
        instance.setCaptain(expResult);
        String result = instance.getCaptain();
        assertEquals(result,expResult);
    }

    /**
     * Test of getCaptain method, of class Infantry.
     */
    @Test
    public void testGetCaptain() {
        System.out.println("getCaptain");
        Infantry instance = new Infantry(0);
        String expResult = "A";
        instance.setCaptain(expResult);
        assertNotNull(instance.getCaptain());
    }
    
}
