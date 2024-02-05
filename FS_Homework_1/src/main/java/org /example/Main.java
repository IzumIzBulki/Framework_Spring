package org.example;

import com.google.gson.Gson;
public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(41); p.setFirstName("Maksim"); p.setLastName("Utkin");
        System.out.println(p);
        System.out.println(new Person());

        Gson gson = new Gson();
        String json = gson.toJson(p);
        System.out.println("json = "+json);

        Person p2 = gson.fromJson(json, Person.class);
        System.out.println(p2);
        System.out.println(p2.equals(p));


    }

}
