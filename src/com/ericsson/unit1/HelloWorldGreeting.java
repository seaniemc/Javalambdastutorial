package com.ericsson.unit1;

/**
 * Created by smcgrath on 7/3/2017.
 */
public class HelloWorldGreeting implements Greeting{
    @Override
    public void perform() {
        System.out.println("Hello world");
    }
}
