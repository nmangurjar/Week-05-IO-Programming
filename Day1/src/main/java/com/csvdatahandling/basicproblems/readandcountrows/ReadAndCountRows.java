package com.csvdatahandling.basicproblems.readandcountrows;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndCountRows {
    public static void main(String[] args)throws IOException {
        String filename = "C:\\Users\\naman\\OneDrive\\Desktop\\Week-05---IO-Programming\\Day1\\src\\main\\java\\com\\csvdatahandling\\basicproblems\\readandcountrows\\students.csv";

        try(CSVReader reader = new CSVReader(new FileReader(filename))){
            String [] column;
            column = reader.readNext();
            System.out.println("Number of rows: "+column[0].length());
        }
        catch (IOException e){
            System.out.println(e);
        }catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
