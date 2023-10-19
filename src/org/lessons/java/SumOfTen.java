package org.lessons.java;

import java.util.Scanner;

public class SumOfTen {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Inserisci un numero: ");
            int newNum = numScan.nextInt();
            sum = newNum + sum;
        }
        System.out.println("La somma dei 10 numeri che hai inserito è: " + sum);
    }
}
