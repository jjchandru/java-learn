package com.company.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileCopier {

    public static void main(String args[])
            throws FileNotFoundException, IOException {
        FileReader reader = new FileReader("D:\\file.txt");
        FileWriter writer = new FileWriter("D:\\file-copy.txt");

        int character = reader.read();
        while (character != -1) {
            System.out.print(character + " ");
            writer.write(character);
            character = reader.read();
        }

        reader.close();
        writer.close();
    }

}
