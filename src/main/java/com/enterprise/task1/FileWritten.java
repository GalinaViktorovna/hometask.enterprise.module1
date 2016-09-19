package com.enterprise.task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWritten {
    public static void fileWrite(File file, List<String> text) throws IOException {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));
            for (int i = 0, k = 0; i < text.size(); i++) {
                String s = text.get(i);
                while (s.length() < 20) {
                    s= s+" ";
                }
                    if (k == 6) {
                        bufferedWriter.write(s + "\n");
                        k = 0;
                    } else {
                        bufferedWriter.write(s + " ");
                        k++;
                    }
                }
            bufferedWriter.close();
            System.out.println("\nYou file was written successful!\nPath for your file: " + file.getAbsolutePath());
        } catch (IOException e) {
            throw new IOException("I can not write the file!");
        }
    }
}


