package com.json.practiceproblems.createjsonobject;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJSONObject {
    public static void main(String[] args) {
        JSONObject student = new JSONObject();
        JSONArray subjects = new JSONArray();

        student.put("Name","Naman");
        student.put("Age",21);
        subjects.put("Maths");
        subjects.put("Physics");
        subjects.put("Chemistry");
        student.put("Subjects",subjects);

        System.out.println(student.toString());
    }
}
