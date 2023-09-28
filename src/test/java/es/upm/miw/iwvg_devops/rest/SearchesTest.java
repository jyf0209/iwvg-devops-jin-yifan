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
}
