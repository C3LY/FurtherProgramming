/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cy214
 */
public class SterlingTest {
    
    public SterlingTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void testCreation(){
        Sterling s = new Sterling(7);
        int v = s.getValue();
        assertEquals(7,v);
    }
    
    @Test
    public void testAddition(){
        Sterling s = new Sterling(7);
        Sterling s1 = new Sterling(3);
        Sterling s2 = s.addToValue(s1);
        assertEquals((7+3), s2.getValue());
    }

    @Test
    public void testChangeByPercent(){
        Sterling s = new Sterling(10);
        Sterling s1 = s.changeByPercentage(80.0);
        assertEquals(10*80/100,s1.getValue());
    }
   
    @Test
    public void testMultiply(){
        Sterling s = new Sterling(5);
        Sterling s1 = s.multiplyBy(4);
        assertEquals(5*4,s1.getValue());
}
}
