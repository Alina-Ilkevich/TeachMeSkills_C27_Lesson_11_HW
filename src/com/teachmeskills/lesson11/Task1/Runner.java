package com.teachmeskills.lesson11.Task1;

/**
 * This class is used to check the written code
 */
public class Runner {
    public static void main(String[] args) {
        String documentNumber = "1234-QaZ-5678-WSx-0e9D";
        Operation.printNumbers(documentNumber);
        Operation.replaceLetters(documentNumber);
        Operation.printLettersLowerCase(documentNumber);
        Operation.printLettersUpperCase(documentNumber);
        Operation.checkSequence(documentNumber);
        Operation.checkBeginning(documentNumber);
        Operation.checkEnd(documentNumber);
    }
}
