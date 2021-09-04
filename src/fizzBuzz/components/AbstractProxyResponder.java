package fizzBuzz.components;

/**
 * A Responder that proxies another Responder. This Responder will respond to numbers it gets if it can
 * or send the number to next responder that it proxies. When responding to numbers, it will chain the
 * response of the proxied responder if both it and the proxied responder can respond to a number.
 */
public abstract class AbstractProxyResponder implements Responder {
    
    Responder proxiedResponder;
    
    @Override
    public final String respondToInt(int i) {
        if (canAppendToResponse(i)) {
            String message = getMessage(i);
            return appendProxyMessages(message, i);
        }
        
        return proxiedResponder.respondToInt(i);
    }
    
    /**
     * Gets the message to respond with for a number
     * @param i number to respond to
     * @return message
     */
    protected abstract String getMessage(int i);
    
    private String appendProxyMessages(String message, int i) {
        if (proxiedResponder.canAppendToResponse(i)) {
            message += proxiedResponder.respondToInt(i);
        }
        return message;
    }
}
