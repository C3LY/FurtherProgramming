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
public class ShareHoldingTest {
    ShareHolding hmv;
    
    public ShareHoldingTest() {
    }
    
    @Before
    public void setUp() {
        hmv = new ShareHolding("HMV",new Sterling(1),10);
    }
    
    @Test
    public void testShareHolding(){
        assertEquals("HMV",hmv.getName());
        assertEquals(1,hmv.getPrice().getValue());
        assertEquals(10,hmv.getQuantity());
        hmv.setPrice(new Sterling(50));
        assertEquals(50,hmv.getPrice().getValue());
        hmv.setQuantity(11);
        assertEquals(11,hmv.getQuantity());

        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
