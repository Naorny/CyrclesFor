package org.com;

public class Task15 {
    public static void main(String[] args) {
        //15. Using a for loop, display a right triangle of eights with sides 10 and 10.
        // Example:
        // 8
        // 88
        // 888

        System.out.println("A right triangle of eights with sides 10 and 10: ");

        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}


