/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.adhir.lexer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author adhir
 */
public class Languages {

    // the individual regular languages
    private static final String REGEX_INDENTIFIER ="[a-zA-Z]+[a-zAZ0-9]*";
    private static final String REGEX_KEYWORD = "(if|else|func|return|class|num|string|bool|)";
    private static final String REGEX_NUMBER = "[0-9]+";
    private static final String REGEX_WHITESPACE = "(\\s|\\n|\\t)";
    private static final String REGEX_OPENPAREN = "\\(";
    private static final String REGEX_CLOSEPAREN = "\\)";
    private static final String REGEX_OPENCURLY = "\\{";
    private static final String REGEX_CLOSECURLY = "\\}";
    private static final String REGEX_SEMICOLON = "\\;";
    private static final String REGEX_EQUALSTO = "\\==";
    private static final String REGEX_ASSIGNTO = "\\=";
    
    
    // Maybe just better to use the match method in the String class?
    private static boolean makeMatch(String strPattern, String lexeme) {
        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(lexeme);
        return matcher.matches();
    }
    
    public static boolean isValidIdentifier(String lexeme) {
        return makeMatch(REGEX_INDENTIFIER, lexeme);
    }
    
    public static boolean isValidKeyword(String lexeme) {
        return makeMatch(REGEX_KEYWORD, lexeme);
    }
    
    public static boolean isValidNumber(String lexeme) {
        return makeMatch(REGEX_NUMBER, lexeme);
    }
    
    public static boolean isValidWhitespace(String lexeme) {
        return makeMatch(REGEX_WHITESPACE, lexeme);
    }

    public static boolean isValidOpenParen(String lexeme) {
        return makeMatch(REGEX_OPENPAREN, lexeme);
    }
    
    public static boolean isValidCloseParen(String lexeme) {
        return makeMatch(REGEX_CLOSEPAREN, lexeme);
    }
    
    public static boolean isValidOpenCurly(String lexeme) {
        return makeMatch(REGEX_OPENCURLY, lexeme);
    }
    
    public static boolean isValidCloseCurly(String lexeme) {
        return makeMatch(REGEX_CLOSECURLY, lexeme);
    }
    
    public static boolean isValidSemicolon(String lexeme) {
        return makeMatch(REGEX_SEMICOLON, lexeme);
    }
    
    public static boolean isValidEqualsto(String lexeme) {
        return makeMatch(REGEX_EQUALSTO, lexeme);
    }
    
    public static boolean isValidAssignto(String lexeme) {
        return makeMatch(REGEX_ASSIGNTO, lexeme);
    }
}
