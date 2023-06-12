package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if (args == null || args.isEmpty()) {
            return false;
        }

        for (String str : args) {
            if (str == null || str.isEmpty()) {
                return false;
            }

            for (char c : str.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }

            int number = Integer.parseInt(str);
            return number > 0;
        }

        return true;

    }
}