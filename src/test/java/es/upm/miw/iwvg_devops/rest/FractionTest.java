package es.upm.miw.iwvg_devops.rest;

import es.upm.miw.iwvg_devops.Fraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {
    private Fraction fraction;
    @BeforeEach
    public void SetUp(){
        fraction = new Fraction(2,4);
    }
    @Test
    public void testGetNumerator(){
        assertEquals(2, fraction.getNumerator());
    }
    @Test
    public void testSetNumerator(){
        fraction.setNumerator(4);
        assertEquals(4, fraction.getNumerator());
    }

    @Test
    public void testGetDenominator(){
        assertEquals(4,fraction.getDenominator());
    }

    @Test
    public void testSetDenominator(){
        fraction.setDenominator(8);
        assertEquals(8, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        Fraction fraction = new Fraction(1, 2);
        assertEquals(0.5, fraction.decimal(), 0.001);
    }

    @Test
    void testToString() {
        Fraction fraction = new Fraction(3, 4);
        assertEquals("Fraction{numerator=3, denominator=4}", fraction.toString());
    }
}
