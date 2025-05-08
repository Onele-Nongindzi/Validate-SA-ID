package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidateSaIdTest {
    @Test
    public void testValidIdNumbers() {
        assertTrue(ValidateSaId.isIdNumberValid("2001014800086"));
        assertTrue(ValidateSaId.isIdNumberValid("2909035800085"));
    }

    @Test
    public void testIdNumberTooShort() {
        assertFalse(ValidateSaId.isIdNumberValid("123456789012"));
    }

    @Test
    public void testIdNumberTooLong() {
        assertFalse(ValidateSaId.isIdNumberValid("12345678901234"));
    }

    @Test
    public void testIdNumberNonNumeric() {
        assertFalse(ValidateSaId.isIdNumberValid("20010A4800086"));
    }

    @Test
    public void testInvalidYear() {
        assertFalse(ValidateSaId.isIdNumberValid("0001014800086")); // Year 00
    }

    @Test
    public void testInvalidMonth() {
        assertFalse(ValidateSaId.isIdNumberValid("2013014800086")); // Month 13
    }

    @Test
    public void testInvalidDay() {
        assertFalse(ValidateSaId.isIdNumberValid("2001013200086")); // Day 32
    }

    @Test
    void shouldValidateGenderDigits() {
        assertTrue(ValidateSaId.isIdNumberValid("2001014800086")); // Valid gender: 4800 (female)
        assertTrue(ValidateSaId.isIdNumberValid("2909035800085")); // Valid gender: 5800 (male)
        assertFalse(ValidateSaId.isIdNumberValid("2001019999086")); // Invalid gender: 9999 (out of range)
    }

    @Test
    void shouldValidateCitizenshipDigit() {
        assertTrue(ValidateSaId.isIdNumberValid("2001014800086")); // Valid citizenship: 0 (SA citizen)
        assertFalse(ValidateSaId.isIdNumberValid("2001014800186")); // Invalid citizenship: 1 (permanent resident, but
                                                                    // not in test cases)
        assertFalse(ValidateSaId.isIdNumberValid("2001014800286")); // Invalid citizenship: 2
    }
}
