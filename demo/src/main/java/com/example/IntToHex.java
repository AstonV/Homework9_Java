package com.example;

import java.util.InputMismatchException;

public class IntToHex {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            String hex = Integer.toHexString(a);
            System.out.print(hex);
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.print(e);
        }
    }
}
