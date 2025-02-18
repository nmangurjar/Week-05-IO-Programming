package com.csvdatahandling.basicproblems.readcsvfile;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\naman\\OneDrive\\Desktop\\Week-05---IO-Programming\\Day1\\src\\main\\java\\com\\csvdatahandling\\basicproblems\\readcsvfile\\students.csv";

        try(CSVReader reader = new CSVReader(new FileReader(filename))){
            String [] columns;

            while((columns = reader.readNext()) != null){
                System.out.println("ID: "+columns[0]+" Name: "+columns[1]+" Age: "+columns[2]+" Marks: "+columns
                [3]);

            }

        } catch (IOException e) {
            System.out.println(e);
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
