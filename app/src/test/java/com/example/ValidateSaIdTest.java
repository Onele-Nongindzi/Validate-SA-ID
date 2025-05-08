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
        assertFalse(ValidateSaId.isIdNumberValid("12345678901234")); // 14 digits
    }
}