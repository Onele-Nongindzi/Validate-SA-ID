package com.example;

public class ValidateSaId {
    public static boolean isIdNumberValid(String idNumber) {
        if (!isValidFormat(idNumber)) {
            return false;
        }
        if (!isValidDate(idNumber)) {
            return false;
        }
        if (!isValidGender(idNumber)) {
            return false;
        }
        if (!isValidCitizenship(idNumber)) {
            return false;
        }
        if (!isValidLuhn(idNumber)) {
            return false;
        }
        return true;
    }

    private static boolean isValidFormat(String idNumber) {
        return idNumber != null && idNumber.length() == 13 && idNumber.matches("\\d+");
    }

    private static boolean isValidDate(String idNumber) {
        // Validate year (YY: 00-25 for 2000-2025, 26-99 for 1926-1999)
        String year = idNumber.substring(0, 2);
        int yearValue = Integer.parseInt(year);
        if (yearValue < 0 || yearValue > 99) {
            return false;
        }
        // Validate month (MM: 01-12)
        String month = idNumber.substring(2, 4);
        int monthValue = Integer.parseInt(month);
        if (monthValue < 1 || monthValue > 12) {
            return false;
        }
        // Validate day (DD: 01-31)
        String day = idNumber.substring(4, 6);
        int dayValue = Integer.parseInt(day);
        return dayValue >= 1 && dayValue <= 31;
    }

    private static boolean isValidGender(String idNumber) {
        String gender = idNumber.substring(6, 10);
        int genderValue = Integer.parseInt(gender);
        return genderValue >= 0 && genderValue <= 9999;
    }

    private static boolean isValidCitizenship(String idNumber) {
        char citizenship = idNumber.charAt(10);
        return citizenship == '0' || citizenship == '1';
    }

    private static boolean isValidLuhn(String idNumber) {
        int sum = 0;
        boolean isEven = false;
        for (int i = idNumber.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(idNumber.charAt(i));
            if (isEven) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            sum += digit;
            isEven = !isEven;
        }
        return sum % 10 == 0;
    }
}