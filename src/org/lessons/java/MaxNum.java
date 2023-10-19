package org.lessons.java;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        System.out.println("Inserisci il primo numero: ");
        int firstNum = numScan.nextInt();
        System.out.println("Inserisci il secondo numero: ");
        int secondNum = numScan.nextInt();
        if (firstNum > secondNum){
            System.out.println("Questo è il numero maggiore: " + firstNum);
        } else if (secondNum > firstNum){
            System.out.println("Questo è il numero maggiore: " + secondNum);
        } else {
            System.out.println("I due numeri sono uguali");
        }
    }
}
