package org.CheckedUncheckedException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Check01 {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("src/main/java/org/CheckedUncheckedException/CheckedUncheckedExceptions");
        BufferedReader fileInput = new BufferedReader(file);
        for(int counter=0; counter<3; counter++);
        System.out.println(fileInput.readLine());
        fileInput.close();
    }
}
