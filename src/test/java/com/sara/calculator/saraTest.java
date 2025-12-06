package com.sara.calculator;






import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class saraTest {
    private saraTest calc;

    @BeforeEach
    void setUp() {
        calc = new saraTest();
        System.out.println("Initialisation...");
    }
    @AfterEach
    void tearDown() {
        System.out.println("Nettoyage après le test...");

    }


    @Test
    public void testAdd() {
        sara  c = new sara ();
        assertEquals(5, c.add(2, 3));
    }

    @Test
    public void testDivide() {
        sara   c = new sara ();
        assertEquals(2, c.divide(10, 5));
    }
}