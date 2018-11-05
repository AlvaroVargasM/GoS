/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprites;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
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
public class DragonRiderTest {
    
    DragonRider instance;
    
    public DragonRiderTest() {
        
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
     * Test of movement method, of class DragonRider.
     */
    /*
    @Test
    public void testMovement() {
        System.out.println("movement");
        float deltaTime = 0.0F;
        DragonRider instance = new DragonRider();
        instance.movement(deltaTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of render method, of class DragonRider.
     */
    
    /*@Test
    public void testRender() {
        System.out.println("render");
        SpriteBatch batch = null;
        float stateTime = 0.0F;
        float deltaTime = 0.0F;
        DragonRider instance = new DragonRider();
        instance.render(batch, stateTime, deltaTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getSprite method, of class DragonRider.
     */
    /*
    @Test
    public void testGetSprite() {
        System.out.println("getSprite");
        DragonRider instance = new DragonRider();
        Rectangle expResult = null;
        Rectangle result = instance.getSprite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getX method, of class DragonRider.
     */
    /*@Test
    public void testGetX() {
        System.out.println("getX");
        DragonRider instance = new DragonRider();
        float expResult = 0.0F;
        float result = instance.getX();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getY method, of class DragonRider.
     */
    
    /*@Test
    public void testGetY() {
        System.out.println("getY");
        DragonRider instance = new DragonRider();
        float expResult = 0.0F;
        float result = instance.getY();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of hit method, of class DragonRider.
     */
    @Test
    public void testHit() {
        System.out.println("hit");
        
        DragonRider instance = new DragonRider();
        int beforeLife = instance.life;
        instance.hit();
        int afterLife = instance.life;
        
        System.out.println("a");
        System.out.println(afterLife);
        
        assertEquals(beforeLife-1, afterLife);
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testSumar(){
        System.out.println("sumar");
        instance = new DragonRider();
        int expectedResult = 4;
        int result = instance.sumar(2,2);
      
        assertEquals(result, expectedResult);
    }

    /**
     * Test of getOrientation method, of class DragonRider.
     */
    
    /*@Test
    public void testGetOrientation() {
        System.out.println("getOrientation");
        DragonRider instance = new DragonRider();
        String expResult = "";
        String result = instance.getOrientation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
