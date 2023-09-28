package es.upm.miw.iwvg_devops.rest;

import es.upm.miw.iwvg_devops.Fraction;
import es.upm.miw.iwvg_devops.Searches;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SearchesTest {
    private Searches searches;
    @Test
    void testFindFirstProperFractionByUserId(){
        assertTrue(new Fraction(-1, 5).isEquivalent(new Searches().findFirstProperFractionByUserId("2")));
    }
}
