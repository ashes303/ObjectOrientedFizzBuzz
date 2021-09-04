package fizzBuzz.components;

/**
 * An interface that responds to integers with a string.
 */
public interface Responder {
    /***
     * Responds to the input i with a string
     * @param i input number to respond to
     * @return a message for the input i
     */
    String respondToInt(int i);
    
    /***
     * Whether respondToInt produce a message that can be appended to an existing message
     * @param i input number to respond to
     * @return whether this object will produce a message that can be appended
     */
    boolean canAppendToResponse(int i);
}
