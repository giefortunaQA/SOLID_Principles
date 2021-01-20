package com.qa.O;

public class Greeter{

    public void greet(Greeting greeting){
        if (greeting instanceof FormalGreeting){
            greeting.greet();
        }
        else if (greeting instanceof CasualGreeting) {
            greeting.greet();
        }
        else {
            System.out.println("Hello");
        }
    }
    
}