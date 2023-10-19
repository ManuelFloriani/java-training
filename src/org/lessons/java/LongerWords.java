package org.lessons.java;

import java.util.Scanner;

public class LongerWords {
    public static void main(String[] args) {
        Scanner wordScan = new Scanner(System.in);
        System.out.println("Inserisci una parola: ");
        String firstWord = wordScan.nextLine();
        System.out.println("Inserisci un' altra parola: ");
        String secondWord = wordScan.nextLine();
        if (firstWord.length() > secondWord.length()){
            System.out.println(secondWord + " " + firstWord);
        } else if (firstWord.length() < secondWord.length()) {
            System.out.println(firstWord + " " + secondWord);
        } else {
            System.out.println("Le due parole hanno la stessa lunghezza");
        }
    }
}
