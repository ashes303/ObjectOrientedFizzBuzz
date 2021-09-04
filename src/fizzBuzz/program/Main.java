package fizzBuzz.program;

import fizzBuzz.components.*;

public class Main {

    public static void main(String[] args) {
        
        Responder integerResponder = new IntegerResponder();
        Responder runCollapsingResponder = new RunCollapsingProxyResponder(integerResponder);
        
        ResponseStrategy buzzResponseStrategy = new ProductResponseStrategy(3);
        ResponseStrategy fizzResponseStrategy = new ProductResponseStrategy(5);
        ResponseStrategy linnResponseStrategy = new PowersResponseStrategy(2);
        
        Responder buzzResponder = new StrategyProxyResponder( "Buzz", buzzResponseStrategy, runCollapsingResponder);
        Responder fizzResponder = new StrategyProxyResponder("Fizz", fizzResponseStrategy, buzzResponder);
        Responder linnResponder = new StrategyProxyResponder( "Linn", linnResponseStrategy, fizzResponder);
        
        for (int i = 1; i <= 100; i++) {
            String message = linnResponder.respondToInt(i);
            System.out.println(message);
        }
    }
}
