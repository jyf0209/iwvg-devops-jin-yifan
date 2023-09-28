package es.upm.miw.iwvg_devops.rest;

import es.upm.miw.iwvg_devops.Fraction;
import es.upm.miw.iwvg_devops.Searches;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class SearchesTest {
    private Searches searches;
    @Test
    void testFindFirstProperFractionByUserId(){
        assertTrue(new Fraction(-1, 5).isEquivalent(new Searches().findFirstProperFractionByUserId("2")));
    }

    @Test
    void testFindUserFamilyNameBySomeImproperFraction(){
        assertEquals(List.of("Fernandez","Blanco","López","Blanco","Torres"), new Searches().findUserFamilyNameBySomeImproperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindDecimalFractionByUserName(){
        assertEquals(List.of(0.0, 1.0,2.0,0.2,-0.5,0.5,1.0), new Searches().findDecimalFractionByUserName("Oscar")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindFractionAdditionByUserId(){
        assertTrue(new Fraction(3,1).isEquivalent(new Searches().findFractionAdditionByUserId("1")));
    }

}
