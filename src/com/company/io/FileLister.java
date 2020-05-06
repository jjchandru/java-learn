package com.company.io;

import java.io.File;

public class FileLister {

    public static void main(String args[]) {
        File file = new File("D:\\sessions\\java-learning");
        String[] list = file.list();
        
        for (String item : list) {
            System.out.println(item);
        }
    }
}
