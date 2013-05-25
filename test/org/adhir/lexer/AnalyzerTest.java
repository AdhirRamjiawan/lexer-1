/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.adhir.lexer;

import java.util.List;
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
public class AnalyzerTest {

    public AnalyzerTest() {
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
     * Test of getOutputTokens method, of class Analyzer.
     */
    //@Test
    public void testGetOutputTokens() {
        System.out.println("getOutputTokens");
        Analyzer instance = null;
        List expResult = null;
        List result = instance.getOutputTokens();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of check method, of class Analyzer.
     */
    @Test
    public void testCheck() {
        System.out.println("Analyzing source ..... \n\n");
        String source = "";

        source += "class Main {\n";
        source += "     func main() {\n";
        source += "         i = 1;\n";
        source += "         return i;\n";
        source += "     }\n";
        source += "     func test() {\n";
        source += "         if (1 == 1) {";
        source += "             return 1;";
        source += "         }\n";
        source += "     }\n";
        source += "}";

        Analyzer instance = new Analyzer(source);
        instance.check();

        for (String token : instance.getOutputTokens()) {
            System.out.println(token);
        }
    }
}