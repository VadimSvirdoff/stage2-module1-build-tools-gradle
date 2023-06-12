package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (char c : str.toCharArray()) {
                return false;
        }

        int number = Integer.parseInt(str);
        return number > 0;
    }
}
