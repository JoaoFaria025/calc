/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author htols
 */
public class operationsTest {
    
    public operationsTest() {
    }

    /**
     * Test of somar method, of class operations.
     */
    @Test
    public void testSomar() {
        operations act = new operations();
        assertEquals(5,act.somar(5, 5));
    }

    /**
     * Test of multi method, of class operations.
     */
    @Test
    public void testMulti() {
        operations act = new operations();
        assertEquals(5,act.multi(5, 5));
    }

    /**
     * Test of div method, of class operations.
     */
    @Test
    public void testDiv() {
         operations act = new operations();
        assertEquals(5,act.div(5, 5));
    }

    /**
     * Test of sub method, of class operations.
     */
    @Test
    public void testSub() {
         operations act = new operations();
        assertEquals(5,act.sub(5, 5));
    }
    
}
