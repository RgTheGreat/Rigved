package com.code;
// simple progress bar using java
// import the dependencies-
import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;


public class Loader {

    public static void main(String[] args) {
        // for loop
        for (int i = 0;i < 20;i++) {
            // try and catch block
            try {
                System.out.print("#"); // use print to print on same line instead of newline
                // sleep for 1 second
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }

            // print done if integer i is 9
            if (i == 19) {
                System.out.println("\n");
                System.out.println("Done!");
            }
        }
    }
}
