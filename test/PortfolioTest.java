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
public class PortfolioTest {
    ShareHolding apple,hmv,google;
    Portfolio p;
    public PortfolioTest() {
    }
    
    @Before
    public void setUp() {
        hmv = new ShareHolding("HMV",new Sterling(1),10);
        apple = new ShareHolding("APPLE",new Sterling(5000),50);
        google = new ShareHolding("GOOGLE",new Sterling(1000),70);
        p = new Portfolio();
        p.add(hmv);
        p.add(apple);
        p.add(google);
    }
    
    @Test
    public void testAddShare(){
        assertEquals(10, p.getByName("HMV").getQuantity());
        assertEquals(70, p.getByName("GOOGLE").getQuantity());
        p.add(hmv);
        assertEquals(10+10,p.getByName("HMV").getQuantity());
    }
    
    
    @Test
    public void testValue(){
        assertEquals(10*1+50*5000+70*1000, p.getTotalValue().getValue());
    }
}
