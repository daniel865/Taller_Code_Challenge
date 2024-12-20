package com.taller;

public class StringFormatter {

    public String format(String str, int k) {
        String cleaned = str.replace("-", "").toUpperCase();

        if (cleaned.length() == 0) {
            return "";
        }

        int firstGroupLength = cleaned.length() % k;
        if (firstGroupLength == 0) {
            firstGroupLength = k;
        }

        StringBuilder result = new StringBuilder();

        result.append(cleaned.substring(0, firstGroupLength));

        for (int i = firstGroupLength; i < cleaned.length(); i += k) {
            result.append("-");
            result.append(cleaned.substring(i, Math.min(i + k, cleaned.length())));
        }
        return result.toString();
    }

}
