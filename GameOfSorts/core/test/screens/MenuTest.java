/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.game.main.GameOfSorts;

/**
 *
 * @author luism
 */
public class MenuTest {
    
    private GameOfSorts GoS = new GameOfSorts();
    private Menu instance = new Menu(GoS);
    
    public MenuTest() {
        
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
     * Test of show method, of class Menu.
     */
    @Test
    public void testShow() {
        System.out.println("show");
        instance = new Menu(GoS);
        instance.show();
        fail("The test case is a prototype.");
        //assertEquals(1,1);
    }

    /**
     * Test of render method, of class Menu.
     */
    
    @Test
    public void testRender() {
        System.out.println("render");
        float delta = 0.0F;
        Menu instance = null;
        instance.render(delta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resize method, of class Menu.
     */
    
    /*@Test
    public void testResize() {
        System.out.println("resize");
        int width = 0;
        int height = 0;
        Menu instance = null;
        instance.resize(width, height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pause method, of class Menu.
     */
    
    /*@Test
    public void testPause() {
        System.out.println("pause");
        Menu instance = null;
        instance.pause();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resume method, of class Menu.
     */
    
    /*@Test
    public void testResume() {
        System.out.println("resume");
        Menu instance = null;
        instance.resume();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hide method, of class Menu.
     */
    //@Test
    
    /*public void testHide() {
        System.out.println("hide");
        Menu instance = null;
        instance.hide();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dispose method, of class Menu.
     */
    
    /*@Test
    public void testDispose() {
        System.out.println("dispose");
        Menu instance = null;
        instance.dispose();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
