package com.teachmeskills.lesson11.Task2;

/**
 * The program is used to determine the biggest and smallest words in a string
 */
public class Runner {
    public static void main(String[] args) {
        String string = "Alina Ilkevich is a student";
        String[] arr = (string.split(" "));
        int a = 0;
        String theBiggestWord = "";
            for (int i = 0; i < arr.length; i++) {
                if (a <= arr[i].length()){
                    a = arr[i].length();
                    theBiggestWord = arr[i];
            }
        }
        System.out.println("The biggest word is " + theBiggestWord);

        int b = 1;
        String theSmallestWord = "";
        for (int i = 0; i < arr.length; i++) {
            if (b >= arr[i].length()){
                b = arr[i].length();
                theSmallestWord = arr[i];
            }
        }
        System.out.println("The smallest word is " + theSmallestWord);
    }
}
