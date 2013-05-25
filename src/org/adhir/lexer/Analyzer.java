/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.adhir.lexer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adhir
 */
public class Analyzer {

    private SourceStream sourceStream;
    private List<String> outputTokens;

    /*
     * Would be nice to keep track of line number and column number
     */
    public Analyzer(String source) {
        sourceStream = new SourceStream(source);
        outputTokens = new ArrayList<String>();
    }

    public List<String> getOutputTokens() {
        return outputTokens;
    }

    /*
     * Need to add validations to ensure the order of Languages in 
     * input source.
     */
    
    public void check() {
        char lexeme;

        while ((lexeme = sourceStream.next()) != SourceStream.NULL) {
            produceToken(lexeme + "");
        }
    }

    private void produceToken(String strLexeme) {
        if (Languages.isValidOpenCurly(strLexeme)) {
            outputTokens.add(TokenFactory.createOpenCurly(strLexeme));
        } else if (Languages.isValidCloseCurly(strLexeme)) {
            outputTokens.add(TokenFactory.createCloseCurly(strLexeme));
        } else if (Languages.isValidIdentifier(strLexeme)) {
            lookupAndProduceIdentifier();
        } else if (Languages.isValidOpenParen(strLexeme)) {
            outputTokens.add(TokenFactory.createOpenParen(strLexeme));
        } else if (Languages.isValidCloseParen(strLexeme)) {
            outputTokens.add(TokenFactory.createCloseParen(strLexeme));
        } else if (Languages.isValidWhitespace(strLexeme)) {
            outputTokens.add(TokenFactory.createWhitespace(strLexeme));
        } else if (Languages.isValidNumber(strLexeme)) {
            outputTokens.add(TokenFactory.createNumber(strLexeme));
        } else if (Languages.isValidSemicolon(strLexeme)) {
            outputTokens.add(TokenFactory.createSemicolon(strLexeme));
        } else if (Languages.isValidAssignto(strLexeme)) {
            lookupAndProduceAssignto();
        }
    }

     // recursion. try to clean up
    private void lookupAndProduceIdentifier() {
        int lookAheadCount = 0;
        char lookAheadLexeme;
        String fullIdentifier = "";

        while ((lookAheadLexeme = sourceStream.lookAhead(lookAheadCount++)) != SourceStream.NULL) {
            if (!Languages.isValidWhitespace(lookAheadLexeme + "")
                    && Languages.isValidIdentifier(lookAheadLexeme + "")) {
                fullIdentifier += lookAheadLexeme;
            } else {
                break;
            }
        }

        // keywords have higher priority than identifiers
        if (Languages.isValidKeyword(fullIdentifier)) {
            outputTokens.add(TokenFactory.createKeyword(fullIdentifier));
            sourceStream.moveBy(lookAheadCount -1); // Need to investigate why
        } else {
            outputTokens.add(TokenFactory.createIdentifier(fullIdentifier));
            sourceStream.moveBy(lookAheadCount -2); // Need to investigate why
        }
    }
    
     // recursion. try to clean up
    private void lookupAndProduceAssignto() {
        int lookAheadCount = 0;
        char lookAheadLexeme;
        String fullLexeme = "";

        while ((lookAheadLexeme = sourceStream.lookAhead(lookAheadCount++)) != SourceStream.NULL) {
            if (!Languages.isValidWhitespace(lookAheadLexeme + "")
                    && Languages.isValidAssignto(lookAheadLexeme + "")) {
                fullLexeme += lookAheadLexeme;
            } else {
                break;
            }
        }

        // keywords have higher priority than identifiers
        if (Languages.isValidEqualsto(fullLexeme)) {
            outputTokens.add(TokenFactory.createEqualsto(fullLexeme));
            sourceStream.moveBy(lookAheadCount -1); // Need to investigate why
        } else {
            outputTokens.add(TokenFactory.createAssignto(fullLexeme));
            sourceStream.moveBy(lookAheadCount -2); // Need to investigate why
        }
    }
}
