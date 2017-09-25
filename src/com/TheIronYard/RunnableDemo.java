package com.TheIronYard;

public class RunnableDemo {
    public static void main(String[] args) {

        // !! - Write an anonymous Runnable class here
        //It can just print out "Anonymous run" or similar
        Runnable anonRun = new Runnable() {    // new Runnable() here
            @Override
            public void run() {

            }
        };

        anonRun.run();

        // !! - Write a lambda function here
        //It can also print out something like "Lambda run"
        Runnable lambdaRun = () -> {
            System.out.println("Lambda RUN.");
        }; // lambda run here

        lambdaRun.run();


    }
}