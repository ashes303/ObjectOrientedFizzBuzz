package fizzBuzz.components;

/**
 * An AbstractProxyResponder that uses a ResponseStrategy to respond to numbers.
 */
public class StrategyProxyResponder extends AbstractProxyResponder {
    
    private final ResponseStrategy responseStrategy;
    private final String message;
    
    /***
     * Create an instance of StrategyProxyResponder
     * @param message Message to respond to numbers with
     * @param responseStrategy Strategy to determine which inputs to respond with the message
     * @param proxiedResponder Next Responder in the chain of proxies
     */
    public StrategyProxyResponder(String message, ResponseStrategy responseStrategy, Responder proxiedResponder) {
        this.message = message;
        this.responseStrategy = responseStrategy;
        this.proxiedResponder = proxiedResponder;
    }
    
    @Override
    protected String getMessage(int i) {
        return message;
    }
    
    @Override
    public boolean canAppendToResponse(int i) {
        return responseStrategy.canAppendToResponse(i);
    }
}
