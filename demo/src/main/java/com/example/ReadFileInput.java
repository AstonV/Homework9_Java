package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFileInput {
    public static void main(String[] args) throws Exception {
        File file = new File("quote.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String st;
        while ((st = bufferedReader.readLine()) != null)
            System.out.println(st);
    }
}
