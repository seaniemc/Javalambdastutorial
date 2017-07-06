package com.ericsson.unit3;

/**
 * Created by smcgrath on 7/6/2017.
 */
public class MethodReferenceExample {
    public static void main(String[] args) {
//        Thread t = new Thread(() -> printMessage());
//        t.start();

        //this is an example of a method expression, it is the same as the lambda above
        //can be used if you are only running a method in your lambda expression
        Thread t = new Thread(MethodReferenceExample::printMessage);// MethodReferenceExample::printMessage === () -> printMessage());
        t.start();
    }

    public static void printMessage(){
        System.out.println("hello!");
    }
}
