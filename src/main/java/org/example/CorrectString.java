package org.example;

public class CorrectString {
    public String remove_a(String str) {
        String result = " ";
        if (str.length() >= 2) {
            char char1 = str.charAt(0);
            char char2 = str.charAt(1);
            if (char1 == 'A' || char1 == 'a') {
                if (char2 == 'A' || char2 == 'a') {
                    result = str.substring(2, str.length());
                } else {
                    result = char2 + str.substring(2, str.length());;
                }
            } else if (char2 == 'a' || char2 == 'A') {
                result = char1 + str.substring(2, str.length());;
            }
            else {
                result = str;
            }
        }
        else{
            if(str.length() != 0) {
                if (str.charAt(0) == 'A' || str.charAt(0) == 'a') {
                    result = " ";
                } else {
                    result = "" + str.charAt(0);
                }
            }
            else{
                result = " ";
            }
        }
        return "Correct String is -> " + result;
    }
}
