package com.json.practiceproblems.covertobjecttojson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

public class ConvertObjectToJSON {
    public static void main(String[] args) {


        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Car car = new Car("Ford", "Endevor", "White");
            objectMapper.writeValue(new File("C:\\Users\\naman\\OneDrive\\Desktop\\Week-05---IO-Programming\\Day2\\src\\main\\java\\com\\json\\practiceproblems\\covertobjecttojson\\car.json"), car);
            System.out.println("JSON file created successfully!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}