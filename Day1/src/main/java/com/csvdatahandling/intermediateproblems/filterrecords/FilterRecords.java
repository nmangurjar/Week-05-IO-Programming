package com.csvdatahandling.intermediateproblems.filterrecords;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilterRecords {
    public static void main(String[] args) {
        String filename = "C:\\Users\\naman\\OneDrive\\Desktop\\Week-05---IO-Programming\\Day1\\src\\main\\java\\com\\csvdatahandling\\intermediateproblems\\filterrecords\\students.csv";

        try(CSVReader reader = new CSVReader(new FileReader(filename))){
            String [] column;

            while( ( column = reader.readNext())!=null) {
                if ((Integer.parseInt(column[3]) > 80)) {

                    System.out.println("ID: "+column[0]+", Name: "+column[1]+", Age: "+column[2]+", Marks: "+column[3]);

                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
