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
public class DragonTest {
    
    public DragonTest() {
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
     * Test of randomName method, of class Dragon.
     */
    @Test
    public void testRandomName() {
        System.out.println("randomName");
        Dragon instance = new Dragon("commander",0);
        int expResult = 5;
        int result = instance.randomName().length();
        assertEquals(expResult, result);
    }

    /**
     * Test of render method, of class Dragon.
     */
    //@Test Disabled due to LibGDX null pointer issue with textures on unit testing
    /*public void testRender() {
        System.out.println("render");
        float x = 0.0F;
        float y = 0.0F;
        SpriteBatch batch = null;
        float stateTime = 0.0F;
        float deltaTime = 0.0F;
        Dragon instance = null;
        instance.render(x, y, batch, stateTime, deltaTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getSprite method, of class Dragon.
     */
    @Test
    public void testGetSprite() {
        System.out.println("getSprite");
        int x = 100;
        int y = 200;
        int size = 128;
        Dragon instance = new Dragon("commander",0);
        instance.setX(x);
        instance.setY(y);
        Rectangle expResult = new Rectangle(x,y,size,size);
        Rectangle result = instance.getSprite();
        assertEquals(expResult, result);
    }

    /**
     * Test of restartShoot method, of class Dragon.
     */
    @Test
    public void testRestartShoot() {
        System.out.println("restartShoot");
        Dragon instance = new Dragon("commander",0);
        instance.setShooting(true);
        instance.restartShoot();
        
        boolean expResult = false;
        boolean result = instance.getShooting();
        assertEquals(expResult, result);
    }

    /**
     * Test of hit method, of class Dragon.
     */
    @Test
    public void testHit() {
        System.out.println("hit");
        Dragon instance = new Dragon("commander",0);
        instance.hit();
        
        int expResult = 2;
        int result = instance.getLife();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLife method, of class Dragon.
     */
    @Test
    public void testGetLife() {
        System.out.println("getLife");
        Dragon instance = new Dragon("commander",0);
        int expResult = 3;
        int result = instance.getLife();
        assertEquals(expResult, result);

    }

    /**
     * Test of setPosition method, of class Dragon.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        int position = 0;
        Dragon instance = new Dragon("commander",5);
        instance.setPosition(position);
        assertEquals(position, instance.getPosition());

    }

    /**
     * Test of getPosition method, of class Dragon.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        Dragon instance = new Dragon("commander",0);
        assertNotNull(instance.getPosition());

    }

    /**
     * Test of setFather method, of class Dragon.
     */
    @Test
    public void testSetFather() {
        System.out.println("setFather");
        String father = "Father";
        Dragon instance = new Dragon("commander",0);
        instance.setFather(father);
        assertEquals(father, instance.getFather());
    }

    /**
     * Test of getX method, of class Dragon.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Dragon instance = new Dragon("commander",0);
        assertNotNull(instance.getX());
    }

    /**
     * Test of getY method, of class Dragon.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Dragon instance = new Dragon("commander",0);
        assertNotNull(instance.getY());
    }

    /**
     * Test of getShooting method, of class Dragon.
     */
    @Test
    public void testGetShooting() {
        System.out.println("getShooting");
        Dragon instance = new Dragon("commander",0);
        assertNotNull(instance.getShooting());
    }

    /**
     * Test of getIsCommander method, of class Dragon.
     */
    @Test
    public void testGetIsCommander() {
        System.out.println("getIsCommander");
        Dragon instance = new Dragon("commander",0);
        assertNotNull(instance.getIsCommander());
    }

    /**
     * Test of getDragonClass method, of class Dragon.
     */
    @Test
    public void testGetDragonClass() {
        System.out.println("getDragonClass");
        Dragon instance = new Dragon("commander",0);
        String expResult = "commander";
        String result = instance.getDragonClass();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Dragon.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Dragon instance = new Dragon("commander",0);
        assertNotNull(instance.getName());
    }

    /**
     * Test of getFather method, of class Dragon.
     */
    @Test
    public void testGetFather() {
        System.out.println("getFather");
        Dragon instance = new Dragon("commander",0);
        assertNull(instance.getFather());
    }

    /**
     * Test of getAge method, of class Dragon.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Dragon instance = new Dragon("commander",0);
        assertNotNull(instance.getAge());
    }

    /**
     * Test of getChargeSpeed method, of class Dragon.
     */
    @Test
    public void testGetChargeSpeed() {
        System.out.println("getChargeSpeed");
        Dragon instance = new Dragon("commander",0);
        assertNotNull(instance.getChargeSpeed());
    }

    /**
     * Test of getResistance method, of class Dragon.
     */
    @Test
    public void testGetResistance() {
        System.out.println("getResistance");
        Dragon instance = new Dragon("commander",0);
        assertNotNull(instance.getResistance());
    }

    /**
     * Test of setAge method, of class Dragon.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 10;
        Dragon instance = new Dragon("commander",0);
        instance.setAge(age);
        assertEquals(age, instance.getAge());
    }

    /**
     * Test of setChargeSpeed method, of class Dragon.
     */
    @Test
    public void testSetChargeSpeed() {
        System.out.println("setChargeSpeed");
        int i = 10;
        Dragon instance = new Dragon("commander",0);
        instance.setChargeSpeed(i);
        assertEquals(i, instance.getChargeSpeed());
    }
    
}
