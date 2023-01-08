package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


       // String word = "Radar", reverseWord = "";

        Scanner scanner = new Scanner(System.in); //Funkcja scanner z input
        System.out.println("Type any word");
        String word = scanner.nextLine(); //scanner się odpali w następnej linii po tekście
        String reverseWord = "";

        int strLength = word.length(); //zmienna jako długość słowa

        for (int i = (strLength-1); i >=0; --i) {  //musi 4 razy pętle zrobić przy 5 literach
            reverseWord = reverseWord + word.charAt(i);
        }

        //if (word.toLowerCase().equals(reverseWord.toLowerCase())) {  // małe litery by rozróżniał

            if (word.equalsIgnoreCase(reverseWord)) {  // ignoruje wielkość liter
            System.out.println(word + " is a Palindrome String.");
        }
        else {
            System.out.println(word + " is not a Palindrome String.");
        }
        System.out.println("Your input: " + word);
        System.out.println("Result: " + reverseWord);
    }
}
