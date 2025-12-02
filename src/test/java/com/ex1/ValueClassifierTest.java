package com.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValueClassifierTest {
    private static ValueClassifier valueClassifier = new ValueClassifier();

    @Test
    void testHighValue(){
        assertEquals(Classification.ALTO,valueClassifier.classifyValue(50));
    }
    @Test
    void testMediumValue(){
        assertEquals(Classification.MEDIO,valueClassifier.classifyValue(10));
    }
    @Test
    void testLowValue(){
        assertEquals(Classification.BAIXO,valueClassifier.classifyValue(3));
    }
    @Test
    void testSpecialCase(){
        assertEquals(Classification.CASO_RARO,valueClassifier.classifyValue(-9999));
    }
}
