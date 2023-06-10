package org.example;

import com.google.gson.Gson;

public class Convert {

    public static void main(String[] args) {

        System.out.println("This is Maven project.");
        MyPerson p1 = new MyPerson("Vitaliy", "Volokitkin");
        Gson gson = new Gson();
        String maxP1 = gson.toJson(p1);
        System.out.println(maxP1);
    }
}
