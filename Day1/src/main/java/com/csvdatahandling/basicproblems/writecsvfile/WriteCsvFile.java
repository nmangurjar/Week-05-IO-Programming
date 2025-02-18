package com.csvdatahandling.basicproblems.writecsvfile;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCsvFile {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\naman\\OneDrive\\Desktop\\Week-05---IO-Programming\\Day1\\src\\main\\java\\com\\csvdatahandling\\basicproblems\\writecsvfile\\output.csv";
        try(CSVWriter writer = new CSVWriter(new FileWriter(filename))){
            String[] st = {"102", "Naman", "21", "88"};
            String[] st1 = {"104", "Ishan", "22", "99"};
            String[] st2 = {"105", "Aman", "23", "91"};

            writer.writeNext(st);
            writer.writeNext(st1);
            writer.writeNext(st2);
            System.out.println("CSV file written successfully!");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
