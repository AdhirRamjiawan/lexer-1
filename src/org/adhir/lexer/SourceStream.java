/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.adhir.lexer;

/**
 *
 * @author adhir
 */
public class SourceStream {
    
    public static final char NULL = '\0';
    
    private String source;
    private int index;
    
    public SourceStream(String source) {
        this.source = source;
        this.index = -1;
    }

    public int getIndex() {
        return index;
    }
    
    public void moveBy(int count) {
        this.index += count;
    }
    
    public void jumpTo(int index) {
        this.index = index;
    }
    
    public void reset() {
        index = 0;
    }
    
    public char next() {
        if (++index <= (source.length() -1))
            return source.charAt(index);
        return NULL;
    }
    
    public char lookAhead(int count) {
        if (((index + count) <= (source.length()-1)) &&  index >= 0)
            return source.charAt(index + count);
        return NULL;
    }
}
