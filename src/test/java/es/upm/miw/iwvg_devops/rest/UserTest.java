package es.upm.miw.iwvg_devops.rest;

import es.upm.miw.iwvg_devops.Fraction;
import es.upm.miw.iwvg_devops.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    public void setUp() {
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction(1, 2));
        fractions.add(new Fraction(3, 4));
        user = new User("1234", "Joe", "Swift", fractions);
    }

    @Test
    public void testGetId(){
        assertEquals("1234", user.getId());
    }
    @Test
    public void testGetName(){
        assertEquals("Joe", user.getName());
    }

    @Test
    public void testGetFamilyName(){
        assertEquals("Swift", user.getFamilyName());
    }

    @Test
    public void testGetFullName(){
        assertEquals("Joe Swift", user.fullName());
    }

    @Test
    public void testGetInitials(){
        assertEquals("J.", user.initials());
    }

    @Test
    public void testGetFractionSize() {
        assertEquals(2, user.getFractions().size());
    }

    @Test
    public void testSetName(){
        user.setName("Jane");
        assertEquals("Jane", user.getName());
    }

    @Test
    public void testSetFamilyName(){
        user.setFamilyName("Smith");
        assertEquals("Smith", user.getFamilyName());
    }
    @Test
    public void testSetFractions() {
        List<Fraction> newFractions = new ArrayList<>();
        newFractions.add(new Fraction(1, 3));
        user.setFractions(newFractions);
        assertEquals(1, user.getFractions().size());
    }
}
