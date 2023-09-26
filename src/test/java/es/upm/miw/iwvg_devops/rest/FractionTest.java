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
    void testIsProper(){
        Fraction fraction = new Fraction(2,3);
        assertTrue(fraction.isProper());

        Fraction improperFraction = new Fraction( 3,2);
        assertFalse(improperFraction.isProper());
    }

    @Test
    void testIsImproper(){
        Fraction fraction = new Fraction(3, 2);
        assertTrue(fraction.isImproper());

        Fraction properFraction = new Fraction( 2, 3);
        assertFalse(properFraction.isImproper());
    }
    @Test
    void testIsEquivalente(){
        Fraction fraction1 = new Fraction(2,4);
        Fraction fraction2 = new Fraction(1,2);
        assertTrue(fraction1.isEquivalent(fraction2));

        Fraction fraction3 = new Fraction(2,3);
        Fraction fraction4 = new Fraction(1,2);
        assertFalse(fraction3.isEquivalent(fraction4));

        Fraction fraction5 = new Fraction(4,2);
        Fraction fraction6 = new Fraction(8,4);
        assertTrue(fraction5.isEquivalent(fraction6));

        Fraction fraction7 = new Fraction(4,3);
        Fraction fraction8 = new Fraction(3,2);
        assertFalse(fraction7.isEquivalent(fraction8));
    }

    @Test
    void testAdd() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 5);
        Fraction result = fraction1.add(fraction2);
        assertTrue(result.isEquivalent(new Fraction(7,10)));
    }

    @Test
    void testMultiply() {
        Fraction fraction1 = new Fraction(2, 4);
        Fraction fraction2 = new Fraction(2, 5);
        Fraction result = fraction1.multiply(fraction2);
        assertTrue(result.isEquivalent(new Fraction(4,20)));
    }

    @Test
    void testDivide() {
        Fraction fraction1 = new Fraction(1, 3);
        Fraction fraction2 = new Fraction(3, 5);
        Fraction result = fraction1.divide(fraction2);
        assertTrue(result.isEquivalent(new Fraction(5,9)));
    }

    @Test
    void testToString() {
        Fraction fraction = new Fraction(3, 4);
        assertEquals("Fraction{numerator=3, denominator=4}", fraction.toString());
    }
}
