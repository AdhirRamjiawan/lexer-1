/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.adhir.lexer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adhir
 */
public class SourceStreamTest {

    public SourceStreamTest() {
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
     * Test of reset method, of class SourceStream.
     */
    @Test
    public void testReset() {
        SourceStream instance = new SourceStream("Hello World!");
        instance.reset();
    }

    /**
     * Test of next method, of class SourceStream.
     */
    @Test
    public void testNext() {
        SourceStream instance = new SourceStream("Hello World!");
        char expResult = 'H';
        char result = instance.next();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testNext_printAllChars() {
        SourceStream instance = new SourceStream("Hello World!");
        char result;
        
        while ((result = instance.next()) != SourceStream.NULL)
            System.out.println(result);
    }
    
    /**
     * Test of lookAhead method, of class SourceStream.
     */
    @Test
    public void testLookAhead() {
        int count = 0;
        SourceStream instance = new SourceStream("Hello World!");
        char expResult = SourceStream.NULL;
        char result = instance.lookAhead(count);
        assertEquals(expResult, result);
    }
}