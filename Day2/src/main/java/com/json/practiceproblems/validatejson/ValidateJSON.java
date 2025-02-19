package com.json.practiceproblems.validatejson;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class ValidateJSON {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File file = new File("C:\\Users\\naman\\OneDrive\\Desktop\\Week-05---IO-Programming\\Day2\\src\\main\\java\\com\\json\\practiceproblems\\validatejson\\students.json");


            JsonNode jsonNode = objectMapper.readTree(file);


            if (jsonNode.isArray()) {
                for (JsonNode node : jsonNode) {
                    if (!node.has("name") || !node.has("age")) {
                        System.out.println("Invalid JSON: Missing required fields.");
                        return;
                    }
                }
                System.out.println("Valid JSON structure.");
            } else {
                System.out.println("Invalid JSON: Expected an array.");
            }
        } catch (IOException e) {
            System.out.println("Invalid JSON format: " + e.getMessage());
        }
    }
}





