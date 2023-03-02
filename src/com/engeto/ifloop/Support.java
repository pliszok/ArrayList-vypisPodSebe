
package com.engeto.ifloop;

import java.util.Scanner;

public class Support {
    private static Scanner scanner = null;
    public static int INVALID_INPUT = -1;

    public Support() {
    }

    private static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }

        return scanner;
    }

    public static int safeReadInt() {
        int result = INVALID_INPUT;
        String inputText = getScanner().nextLine();

        try {
            result = Integer.parseInt(inputText);
        } catch (NumberFormatException var3) {
            System.err.println("Zadal jsi text, který nelze převést na celé číslo: " + inputText);
        }

        return result;
    }
}
