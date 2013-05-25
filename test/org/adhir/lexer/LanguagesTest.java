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
public class LanguagesTest {
    
    public LanguagesTest() {
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
     * Test of isValidIdentifier method, of class Languages.
     */
    @Test
    public void testIsValidIdentifier() {
        System.out.println("isValidIdentifier");
        String token = "variable1";
        boolean expResult = true;
        boolean result = Languages.isValidIdentifier(token);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValidKeyword method, of class Languages.
     */
    @Test
    public void testIsValidKeyword() {
        System.out.println("isValidKeyword");
        String token = "return";
        boolean expResult = true;
        boolean result = Languages.isValidKeyword(token);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValidNumber method, of class Languages.
     */
    @Test
    public void testIsValidNumber() {
        System.out.println("isValidNumber");
        String token = "22222";
        boolean expResult = true;
        boolean result = Languages.isValidNumber(token);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValidWhitespace method, of class Languages.
     */
    @Test
    public void testIsValidWhitespace() {
        System.out.println("isValidWhitespace");
        String token = " ";
        boolean expResult = true;
        boolean result = Languages.isValidWhitespace(token);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValidOpenParen method, of class Languages.
     */
    @Test
    public void testIsValidOpenParen() {
        System.out.println("isValidOpenParen");
        String token = "(";
        boolean expResult = true;
        boolean result = Languages.isValidOpenParen(token);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValidCloseParen method, of class Languages.
     */
    @Test
    public void testIsValidCloseParen() {
        System.out.println("isValidCloseParen");
        String token = ")";
        boolean expResult = true;
        boolean result = Languages.isValidCloseParen(token);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValidOpenCurly method, of class Languages.
     */
    @Test
    public void testIsValidOpenCurly() {
        System.out.println("isValidOpenCurly");
        String token = "{";
        boolean expResult = true;
        boolean result = Languages.isValidOpenCurly(token);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValidCloseCurly method, of class Languages.
     */
    @Test
    public void testIsValidCloseCurly() {
        System.out.println("isValidCloseCurly");
        String token = "}";
        boolean expResult = true;
        boolean result = Languages.isValidCloseCurly(token);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValidSemicolon method, of class Languages.
     */
    @Test
    public void testIsValidSemicolon() {
        System.out.println("isValidSemicolon");
        String token = ";";
        boolean expResult = true;
        boolean result = Languages.isValidSemicolon(token);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidEqualsto() {
        System.out.println("isValidEqualsto");
        String token = "==";
        boolean expResult = true;
        boolean result = Languages.isValidEqualsto(token);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidAssignto() {
        System.out.println("isValidAssignto");
        String token = "=";
        boolean expResult = true;
        boolean result = Languages.isValidAssignto(token);
        assertEquals(expResult, result);
    }
}