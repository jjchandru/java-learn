package com.company.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageFileCopier {

    public static void main(String args[])
            throws FileNotFoundException, IOException {
        FileInputStream reader = new FileInputStream("D:\\google.png");
        FileOutputStream writer = new FileOutputStream("D:\\google-copy.png");

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
