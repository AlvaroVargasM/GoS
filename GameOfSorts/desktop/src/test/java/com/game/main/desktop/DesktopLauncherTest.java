/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.com.game.main.desktop;

import com.game.main.desktop.DesktopLauncher;
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
public class DesktopLauncherTest {
    
    public DesktopLauncherTest() {
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
     * Test of main method, of class DesktopLauncher.
     */
    /*@Test
    public void testMain() {
        System.out.println("main");
        String[] arg = null;
        DesktopLauncher.main(arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
    @Test
    public void testSuma(){
        System.out.println("Suma");
        DesktopLauncher  instance = new DesktopLauncher();
        int num = 1;
        int expResult = 2;
        int result = instance.suma(num, num);
        assertEquals(expResult,result);
    }
    
}
