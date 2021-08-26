package com.bridgelabz;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter an integer:");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (num % 2 == 0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
    }
}
