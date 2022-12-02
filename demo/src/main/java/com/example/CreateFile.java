package com.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class CreateFile {


    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        String file = "command_line_input.txt";
        // FileWriter fileWriter = new FileWriter(file);

        Writer fileWriter = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
        String input = null;
        do {
            input = scanner.nextLine();
            if (!("@Q".equalsIgnoreCase(input.trim()))) {
                fileWriter.write(input + "\n");
            }

        } while (!("@Q".equalsIgnoreCase(input.trim())));
        scanner.close();
        fileWriter.close();

    }
}
