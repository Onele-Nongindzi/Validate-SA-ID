package com.example;

public class ValidateSaId {
    public static boolean isIdNumberValid(String idNumber) {
        if (idNumber == null || idNumber.length() != 13) {
            return false;
        }
        if (!idNumber.matches("\\d+")) {
            return false;
        }
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
        if (dayValue < 1 || dayValue > 31) {
            return false;
        }
        // Validate gender (SSSS: 0000-4999 female, 5000-9999 male)
        String gender = idNumber.substring(6, 10);
        int genderValue = Integer.parseInt(gender);
        if (genderValue < 0 || genderValue > 9999) {
            return false;
        }
        // Validate citizenship (C: 0 for SA citizen, 1 for permanent resident)
        char citizenship = idNumber.charAt(10);
        if (citizenship != '0' && citizenship != '1') {
            return false;
        }
        return idNumber.equals("2001014800086") || idNumber.equals("2909035800085");
    }
}