package com.zsdominik.util;

public class Timer {

    public static void runWithTimer(Runnable functionToRun, String functionDescription) {
        // starting time
        long start = System.currentTimeMillis();

        // start of function
        functionToRun.run();
        // end of function

        // ending time
        long end = System.currentTimeMillis();
        System.out.println(functionDescription + " was run for " +
                (end - start) + "ms");
    }
}
