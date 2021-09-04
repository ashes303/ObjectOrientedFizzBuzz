package fizzBuzz.components;

/**
 * Implements an algorithm for determining whether a response will be produced
 */
public interface ResponseStrategy {
    /***
     * Whether A message will be produced
     * @param i number to respond to
     * @return whether a response will be produced
     */
    boolean canAppendToResponse(int i);
}
