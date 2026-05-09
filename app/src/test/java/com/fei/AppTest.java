package com.fei;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void shouldSerializeUserToJson() {
        App app = new App();

        App.User user = new App.User("Alice", 18);

        String json = app.serializeUser(user);

        assertEquals("{\"name\":\"Alice\",\"age\":18}", json);
    }

    @Test
    void shouldDeserializeJsonToUser() {
        App app = new App();

        String json = "{\"name\":\"Alice\",\"age\":18}";

        App.User user = app.deserializeUser(json);

        assertEquals("Alice", user.name());
        assertEquals(18, user.age());
    }
}
