package org.com;

import java.lang.Thread;

public class Task18 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("The numbers in DESC order from 30 to 0: ");
        for (int k = 30; k >= 0; k--) {
            Thread.sleep(100);
            System.out.println(k);
            }
        System.out.println("Boom!");
    }
}

// 18. Write a program that counts down from 30 to 0, and at the end displays the text "Boom!". The program must decrease the number 10 times per second. To insert a delay into the program, use the function:
// Thread.sleep(100); //delay for one tenth of a second.
// Example:
// 30
// 29
// …
//  1
//  0
// Boom!
