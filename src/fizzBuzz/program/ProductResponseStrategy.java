package fizzBuzz.program;

import fizzBuzz.components.ResponseStrategy;

/**
 * Implementation of ResponseStrategy that responds to numbers that are a
 * multiple of some number n.
 */
public class ProductResponseStrategy implements ResponseStrategy {
    
    private final int n;
    
    ProductResponseStrategy(int n) {
        this.n = n;
    }
    
    @Override
    public boolean canAppendToResponse(int i) {
        return i % n == 0;
    }
}
