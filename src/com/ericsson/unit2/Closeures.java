package com.ericsson.unit2;

/**
 * Created by smcgrath on 7/6/2017.
 */
public class Closeures {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        doProcess(a, i -> System.out.println(i + b));
    }
    public static void doProcess(int i, Process p){
        p.process(i);
    }
    interface Process{
        void process(int i);
    }
}
