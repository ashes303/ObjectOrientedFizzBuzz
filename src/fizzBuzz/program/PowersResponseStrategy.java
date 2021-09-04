package fizzBuzz.program;

import fizzBuzz.components.ResponseStrategy;

/**
 * Implementation of Response strategy that appends a response to
 * numbers that are a power of some number;
 */
public class PowersResponseStrategy implements ResponseStrategy {
   
    private final int base;
    
    PowersResponseStrategy(int base) {
        this.base = base;
    }
   
    @Override
    public boolean canAppendToResponse(int i) {
        return isPowerOfN(i);
    }
    
    private boolean isPowerOfN(int i) {
        if (i < base) { return false; }
        
        int intLog = (int) (Math.log(i) / Math.log(base));
        
        double precisionLog = Math.log(i) / Math.log(base);
        
        return intLog == precisionLog;
    }
}
