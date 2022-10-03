package com.example.helloworld;

import org.junit.Test;
import static org.junit.Assert.*;


public class HelloPlutoTest {

    @Test
    public void testConcatenate() {
        PlutoMoon plutoMoon = new PlutoMoon();

        Integer result = plutoMoon.result(6);

        assertEquals(11L, (long) result);

    }
}
