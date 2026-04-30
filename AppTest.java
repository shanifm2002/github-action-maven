package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testGreet() {

        String expected = "Hello from Maven + GitHub Actions!";
        String actual = App.greet();

        assertEquals(expected, actual);
    }
}
