package com.csvdatahandling.intermediateproblems.modifycsvfile;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModifyCSVFile {
    public static void main(String[] args) {
        String filename = "C:\\Users\\naman\\OneDrive\\Desktop\\Week-05---IO-Programming\\Day1\\src\\main\\java\\com\\csvdatahandling\\intermediateproblems\\modifycsvfile\\employees.csv";
        String outputFile = "C:\\Users\\naman\\OneDrive\\Desktop\\Week-05---IO-Programming\\Day1\\src\\main\\java\\com\\csvdatahandling\\intermediateproblems\\modifycsvfile\\updated_employees.csv";
        String target = "It";
        try(CSVReader reader = new CSVReader(new FileReader(filename))){
            try(CSVWriter writer = new CSVWriter(new FileWriter(outputFile))){
            String [] column;
            while ((column = reader.readNext())!= null) {
                if (column[2].equals(target)) {
                    double salary = Double.parseDouble(column[3]);
                    salary *= 1.10;
                    column[3] = String.valueOf(salary);
                }
                writer.writeNext(column);

            }


                // writer.writeNext(column);}
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}
