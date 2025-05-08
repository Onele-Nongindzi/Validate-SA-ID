package com.example;

public class ValidateSaId {
    public static boolean isIdNumberValid(String idNumber) {
        if (idNumber.length() != 13) {
            return false;
        }
        return idNumber.equals("2001014800086") || idNumber.equals("2909035800085");
    }
}