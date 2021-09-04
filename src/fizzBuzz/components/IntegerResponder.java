package fizzBuzz.components;

/**
 * Responder that responds to numbers with the string representation of the number
 */
public class IntegerResponder implements Responder {
    
    @Override
    public String respondToInt(int i) {
        return Integer.toString(i);
    }
    
    @Override
    public boolean canAppendToResponse(int i) {
        return false;
    }
}
