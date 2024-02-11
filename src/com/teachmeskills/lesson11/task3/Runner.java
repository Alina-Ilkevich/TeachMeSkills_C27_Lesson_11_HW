package com.teachmeskills.lesson11.task3;

/**
 * The program is used to double each letter in a word
 */
public class Runner {
    public static void main(String[] args) {
        String string = "Alina";
        char[] arr = string.toCharArray();
        char[] arr2 = new char[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
                arr2[i * 2] = arr[i];
                arr2[(i * 2) + 1] = arr[i];
        }
        System.out.println(arr2);
    }
}
