package com.csvdatahandling.intermediateproblems.searchrecord;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchRecord {
    public static void main(String[] args) {
         String filename = "C:\\Users\\naman\\OneDrive\\Desktop\\Week-05---IO-Programming\\Day1\\src\\main\\java\\com\\csvdatahandling\\intermediateproblems\\searchrecord\\employees.csv";
         String target = "Naman";
         try(CSVReader reader = new CSVReader(new FileReader(filename))){
             String [] column;
             while ((column = reader.readNext())!= null){
                 if(column[1].equals(target)){
                     System.out.println("ID: "+column[0]+", Name: "+column[1]+", Department: "+column[2]+", Salary: "+column[3]);
                 }
             }
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         } catch (CsvValidationException e) {
             throw new RuntimeException(e);
         }
    }
}
