package com.sara.calculator;




import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;class saraTest {

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
