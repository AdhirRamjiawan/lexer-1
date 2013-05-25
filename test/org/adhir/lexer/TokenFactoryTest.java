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
public class TokenFactoryTest {
    
    public TokenFactoryTest() {
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
     * Test of createIdentifier method, of class TokenFactory.
     */
    @Test
    public void testCreateIdentifier() {
        System.out.println("createIdentifier");
        String lexeme = "variable1";
        String expResult = "<IDENTIFIER,variable1>";
        String result = TokenFactory.createIdentifier(lexeme);
        assertEquals(expResult, result);
    }

    /**
     * Test of createKeyword method, of class TokenFactory.
     */
    @Test
    public void testCreateKeyword() {
        System.out.println("createKeyword");
        String lexeme = "return";
        String expResult = "<KEYWORD,return>";
        String result = TokenFactory.createKeyword(lexeme);
        assertEquals(expResult, result);
    }

    /**
     * Test of createNumber method, of class TokenFactory.
     */
    @Test
    public void testCreateNumber() {
        System.out.println("createNumber");
        String lexeme = "123";
        String expResult = "<NUMBER,123>";
        String result = TokenFactory.createNumber(lexeme);
        assertEquals(expResult, result);
    }

    /**
     * Test of createWhitespace method, of class TokenFactory.
     */
    @Test
    public void testCreateWhitespace() {
        System.out.println("createWhitespace");
        String lexeme = " ";
        String expResult = "<WHITESPACE, >";
        String result = TokenFactory.createWhitespace(lexeme);
        assertEquals(expResult, result);
    }

    /**
     * Test of createOpenParen method, of class TokenFactory.
     */
    @Test
    public void testCreateOpenParen() {
        System.out.println("createOpenParen");
        String lexeme = "(";
        String expResult = "<OPENPAREN,(>";
        String result = TokenFactory.createOpenParen(lexeme);
        assertEquals(expResult, result);
    }

    /**
     * Test of createCloseParen method, of class TokenFactory.
     */
    @Test
    public void testCreateCloseParen() {
        System.out.println("createCloseParen");
        String lexeme = ")";
        String expResult = "<CLOSEPAREN,)>";
        String result = TokenFactory.createCloseParen(lexeme);
        assertEquals(expResult, result);
    }

    /**
     * Test of createOpenCurly method, of class TokenFactory.
     */
    @Test
    public void testCreateOpenCurly() {
        System.out.println("createOpenCurly");
        String lexeme = "{";
        String expResult = "<OPENCURLY,{>";
        String result = TokenFactory.createOpenCurly(lexeme);
        assertEquals(expResult, result);
    }

    /**
     * Test of createCloseCurly method, of class TokenFactory.
     */
    @Test
    public void testCreateCloseCurly() {
        System.out.println("createCloseCurly");
        String lexeme = "}";
        String expResult = "<CLOSECURLY,}>";
        String result = TokenFactory.createCloseCurly(lexeme);
        assertEquals(expResult, result);
    }

    /**
     * Test of createSemicolon method, of class TokenFactory.
     */
    @Test
    public void testCreateSemicolon() {
        System.out.println("createSemicolon");
        String lexeme = ";";
        String expResult = "<SEMICOLON,;>";
        String result = TokenFactory.createSemicolon(lexeme);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCreateEqualsto() {
        System.out.println("createEqualsto");
        String lexeme = "=";
        String expResult = "<EQUALSTO,=>";
        String result = TokenFactory.createEqualsto(lexeme);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCreateAssignto() {
        System.out.println("createAssignto");
        String lexeme = "==";
        String expResult = "<ASSIGNTO,==>";
        String result = TokenFactory.createAssignto(lexeme);
        assertEquals(expResult, result);
    }
}