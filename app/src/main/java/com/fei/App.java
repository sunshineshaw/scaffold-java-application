package com.fei;

import com.google.gson.Gson;

public class App {
    public record User(String name, int age) {}

    private final Gson gson = new Gson();

    /**
     * Serialize a User object into a JSON string
     *
     * @param user user object
     * @return user string
     */
    public String serializeUser(User user) {
        return gson.toJson(user);
    }

    /**
     * Deserialize a JSON string into a User object
     *
     * @param json JSON string
     * @return user object
     */
    public User deserializeUser(String json) {
        return gson.fromJson(json, User.class);
    }

    public static void main(String[] args) {
        App app = new App();

        User user = new User("Alice", 18);

        String json = app.serializeUser(user);
        System.out.println("JSON:");
        System.out.println(json);

        User parsedUser = app.deserializeUser(json);
        System.out.println("Object:");
        System.out.println(parsedUser);
    }
}
