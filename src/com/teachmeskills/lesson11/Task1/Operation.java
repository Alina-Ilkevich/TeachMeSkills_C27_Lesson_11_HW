package com.teachmeskills.lesson11.Task1;

/**
 * This class is used to create various methods of working with a string data type
 */
public class Operation {
    //1234-QaZ-5678-WSx-0e9D
    public static void printNumbers(String documentNumber){
        System.out.println("Task 1: " + documentNumber.substring(0, 4) + "-"
                + documentNumber.substring(9,13));
    }
    public static void replaceLetters(String documentNumber){
        System.out.println("Task 2: " + documentNumber.substring(0, 5) + "***"
                + documentNumber.substring(8,14) + "***"
                + documentNumber.substring(17,18)
                + documentNumber.charAt(18) + "*"
                + documentNumber.charAt(20) + "*");
    }
    public static void printLettersLowerCase(String documentNumber){
        documentNumber = documentNumber.substring(5, 8) + "/"
                + documentNumber.substring(14,17) + "/"
                + documentNumber.substring(19,20) + "/"
                + documentNumber.substring(21,22);
        System.out.println("Task 3: " + documentNumber.toLowerCase());
    }
    public static void printLettersUpperCase(String documentNumber){
        documentNumber = documentNumber.toUpperCase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Letters: ");
        stringBuilder.append(documentNumber.substring(5, 8));
        stringBuilder.append("/");
        stringBuilder.append(documentNumber.substring(14,17));
        stringBuilder.append("/");
        stringBuilder.append(documentNumber.substring(19,20));
        stringBuilder.append("/");
        stringBuilder.append(documentNumber.substring(21,22));
        System.out.println("Task 4: " + stringBuilder);
    }
    public static void checkSequence(String documentNumber){
        if (documentNumber.toLowerCase().contains("abc")){
            System.out.println("The document number contains the sequence abc");
        } else {
            System.out.println("The document number doesn't contain the sequence abc");
        }
    }
    public static void checkBeginning(String documentNumber){
        if (documentNumber.startsWith("555")){
            System.out.println("The document number starts with 555");
        } else {
            System.out.println("The document number doesn't start with 555");
        }
    }
    public static void checkEnd(String documentNumber){
        if (documentNumber.toLowerCase().endsWith("1a2b")){
            System.out.println("The document number ends with 1a2b");
        } else {
            System.out.println("The document number doesn't end with 1a2b");
        }
    }


}
