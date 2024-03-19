package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MyMathTest {

    @Test
    public void testAdd() {
        int a = 5;
        int b = 3;
        MyMath myMath = new MyMath();

        int result = myMath.add(a, b);
        assertEquals(result, 8);
    }
}
