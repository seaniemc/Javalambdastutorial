package com.ericsson;

/**
 * Created by smcgrath on 7/3/2017.
 */
public class Greeter {

    public void greet(Greeting greeting){
        //System.out.println("Hello world");
        greeting.perform();
    }
    public static void main(String[] args) {

        Greeter greet = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greet.greet(helloWorldGreeting);

        Greeting myLambdaFunction = () -> System.out.println("Hello world");

    }
}

