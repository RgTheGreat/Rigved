// program to check if a number is prime in java
package com.code;

import java.util.Scanner;

public class Prime {

    public static boolean check(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2;i < Math.sqrt(num);i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        boolean b = check(num);
        System.out.println(b);
    }
}
