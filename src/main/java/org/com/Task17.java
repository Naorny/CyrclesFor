package org.com;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        //17. Enter a name from the keyboard and, using the for loop 10 times, output: [*name* loves me.]
        // Text example:
        // Anna loves me.
        // Anna loves me.
        //…

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scan.nextLine();

        System.out.println();
        for (int k = 1; k <= 10; k++){
            System.out.println(name + " loves me");
        }


    }
}
