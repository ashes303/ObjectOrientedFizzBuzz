package fizzBuzz.components;

/**
 * Responder that responds to numbers that contain a series of a single digit, like "555" or "11".
 * Responds with a single digit, for example "555" becomes "5".
 */
public class RunCollapsingProxyResponder extends AbstractProxyResponder {
   
    public RunCollapsingProxyResponder(Responder proxiedResponder) {
        this.proxiedResponder = proxiedResponder;
    }
    
    @Override
    protected String getMessage(int i) {
        return "" + Integer.toString(i).charAt(0);
    }
    
    @Override
    public boolean canAppendToResponse(int i) {
        return isRunOfSameDigit(i);
    }
    
    private boolean isRunOfSameDigit(int i) {
        if (i < 10) {
            return false;
        }
        
        String s = Integer.toString(i);
        char[] charDigitsOfI = s.toCharArray();
    
        for (char c: charDigitsOfI) {
            if (c != charDigitsOfI[0]) {
                return false;
            }
        }
        return true;
    }
}
