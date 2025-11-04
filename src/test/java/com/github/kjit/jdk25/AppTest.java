package com.github.kjit.jdk25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest
{
    @Test
    public void testApp()
    {
        App app = new App();

        Assertions.assertTrue(app != null);
    }
}
