package com.json.handsonproblems.filterjson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class FilterJSON {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File file = new File("C:\\Users\\naman\\OneDrive\\Desktop\\Week-05---IO-Programming\\Day2\\src\\main\\java\\com\\json\\practiceproblems\\filterjson\\students.json");
            JsonNode jsonNode = objectMapper.readTree(file);
            for (JsonNode node : jsonNode) {
                if (node.has("age") && node.get("age").asInt() > 25) {
                    System.out.println(node);
                }


        } }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
