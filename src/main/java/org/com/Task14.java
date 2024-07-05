package org.com;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        //14. Enter two numbers m and n from the keyboard.
        // Use the for loop to display a rectangle of size m by n made of eights.
        // Example: m=2, n=4
        // 8888
        // 8888

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter m number: ");
        int m = scan.nextInt();
        System.out.print("Enter n number: ");
        int n = scan.nextInt();

        System.out.print("A rectangle of size m by n made of eights: ");
        for (int k = 1; k <= m; k++){
            System.out.println();
               for (int i = 1; i <= n; i++) {
                System.out.print("8");
            }
        }
    }
}
