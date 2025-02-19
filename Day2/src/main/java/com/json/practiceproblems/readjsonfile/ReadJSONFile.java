package com.json.practiceproblems.readjsonfile;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ReadJSONFile {
    public static void main(String[] args) {
        try {

            ObjectMapper objectMapper = new ObjectMapper();
            Student student = objectMapper.readValue(new File("C:\\Users\\naman\\OneDrive\\Desktop\\Week-05---IO-Programming\\Day2\\src\\main\\java\\com\\json\\practiceproblems\\readjsonfile\\student.json"), Student.class);

            System.out.println("Name: " + student.getName());
            System.out.println("Email: " + student.getEmail());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
