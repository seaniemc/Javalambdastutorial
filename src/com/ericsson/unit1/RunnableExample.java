package com.ericsson.unit1;

/**
 * Created by smcgrath on 7/5/2017.
 */
public class RunnableExample {
    public static void main(String[] args) {
        //The old way of creating threads
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside a Runnable");
            }
        });

        myThread.run();

        //Threads using lambdas
        Thread myLambdathread = new Thread(() -> System.out.println("Printed inside my Lambda threrad"));
        myLambdathread.run();
    }
}
