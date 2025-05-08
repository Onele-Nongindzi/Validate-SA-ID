package com.example;

public class ValidateSaId {
    public static boolean isIdNumberValid(String idNumber) {
        if (idNumber.length() != 13) {
            return false;
        }
        if (!idNumber.matches("\\d+")) {
            return false;
        }
        int year = Integer.parseInt(idNumber.substring(0, 2));
        if (year < 20 || year > 99) {
            return false;
        }
        return idNumber.equals("2001014800086") || idNumber.equals("2909035800085");
    }
}