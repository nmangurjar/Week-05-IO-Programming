package com.json.handsonproblems.readjsonfileandprint;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ReadJsonFile {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File("C:\\Users\\naman\\OneDrive\\Desktop\\Week-05---IO-Programming\\Day2\\src\\main\\java\\com\\json\\handsonproblems\\readjsonfileandprint\\students.json"));
              for(JsonNode node : jsonNode){
                  System.out.println(node);
              }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
