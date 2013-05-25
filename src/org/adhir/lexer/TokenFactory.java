/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.adhir.lexer;

/**
 *
 * @author adhir
 */
public class TokenFactory {
    
    private static final String TOKEN_TEMPLATE = "<{tokenClass},{lexeme}>";
    private static final String TOKEN_IDENTIFIER = "IDENTIFIER";
    private static final String TOKEN_KEYWORD = "KEYWORD";
    private static final String TOKEN_NUMBER = "NUMBER";
    private static final String TOKEN_WHITESPACE = "WHITESPACE";
    private static final String TOKEN_OPENPAREN = "OPENPAREN";
    private static final String TOKEN_CLOSEPAREN = "CLOSEPAREN";
    private static final String TOKEN_OPENCURLY = "OPENCURLY";
    private static final String TOKEN_CLOSECURLY = "CLOSECURLY";
    private static final String TOKEN_SEMICOLON = "SEMICOLON";
    private static final String TOKEN_EQUALSTO = "EQUALSTO";
    private static final String TOKEN_ASSIGNTO = "ASSIGNTO";
    
    public static String createIdentifier(String lexeme) {
        return TOKEN_TEMPLATE.replace("{tokenClass}", TOKEN_IDENTIFIER)
                .replace("{lexeme}", lexeme);
    }
    
    public static String createKeyword(String lexeme) {
        return TOKEN_TEMPLATE.replace("{tokenClass}", TOKEN_KEYWORD)
                .replace("{lexeme}", lexeme);
    }
    
    public static String createNumber(String lexeme) {
        return TOKEN_TEMPLATE.replace("{tokenClass}", TOKEN_NUMBER)
                .replace("{lexeme}", lexeme);
    }
    
    public static String createWhitespace(String lexeme) {
        return TOKEN_TEMPLATE.replace("{tokenClass}", TOKEN_WHITESPACE)
                .replace("{lexeme}", createReadableWhitespace(lexeme));
    }
    
    public static String createOpenParen(String lexeme) {
        return TOKEN_TEMPLATE.replace("{tokenClass}", TOKEN_OPENPAREN)
                .replace("{lexeme}", lexeme);
    }
    
    public static String createCloseParen(String lexeme) {
        return TOKEN_TEMPLATE.replace("{tokenClass}", TOKEN_CLOSEPAREN)
                .replace("{lexeme}", lexeme);
    }
    
    public static String createOpenCurly(String lexeme) {
        return TOKEN_TEMPLATE.replace("{tokenClass}", TOKEN_OPENCURLY)
                .replace("{lexeme}", lexeme);
    }
    
    public static String createCloseCurly(String lexeme) {
        return TOKEN_TEMPLATE.replace("{tokenClass}", TOKEN_CLOSECURLY)
                .replace("{lexeme}", lexeme);
    }
    
    public static String createSemicolon(String lexeme) {
        return TOKEN_TEMPLATE.replace("{tokenClass}", TOKEN_SEMICOLON)
                .replace("{lexeme}", lexeme);
    }
    
    public static String createEqualsto(String lexeme) {
        return TOKEN_TEMPLATE.replace("{tokenClass}", TOKEN_EQUALSTO)
                .replace("{lexeme}", lexeme);
    }
    
    public static String createAssignto(String lexeme) {
        return TOKEN_TEMPLATE.replace("{tokenClass}", TOKEN_ASSIGNTO)
                .replace("{lexeme}", lexeme);
    }
    
    private static String createReadableWhitespace(String lexeme) {
        if (lexeme.equals("\n"))
            return "newline";
        else if (lexeme.equals("\t"))
            return "tabspace";
        else
            return "blankspace";
    }
}
