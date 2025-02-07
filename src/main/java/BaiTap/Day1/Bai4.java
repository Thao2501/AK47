package BaiTap.Day1;

import java.util.regex.Pattern;

public class Bai4 {
    // contain uppercase
    // contain lowercase
    // contain number
    // contain special character: !@#$%^&*()
    // length > 8

    // [T,h,a,o,p,h,a,m,@,1,2,3]
    public static boolean isPasswordCorrect(String input) {
        if (input == null || input.trim().isEmpty()) {
            return false;
        }
        boolean isContainUppercase = false;
        boolean isContainLowercase = false;
        boolean isContainNumber = false;
        boolean isContainSpecial = false;
        boolean isLength = false;
        for (Character character : input.toCharArray()) {
            if (Character.isUpperCase(character)) {
                isContainUppercase = true;
            }
            if (Character.isLowerCase(character)) {
                isContainLowercase = true;
            }
            if (Character.isDigit(character)) {
                isContainNumber = true;
            }
            // "!@#$%^&*()".contains("T")
            // "!@#$%^&*()".contains("h")
            // "!@#$%^&*()".contains("@") -> true
            if ("!@#$%^&*()".contains(character.toString())) {
                isContainSpecial = true;
            }
        }
        if (input.length() > 8) {
            isLength = true;
        }
        return isContainUppercase && isContainLowercase && isContainNumber && isContainSpecial && isLength;
    }

    public static boolean isPasswordCorrect2(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        if (!Pattern.compile("[A-Z]").matcher(input).find()) {
            return false;
        }
        if (!Pattern.compile("[a-z]").matcher(input).find()) {
            return false;
        }
        if (!Pattern.compile("[0-9]").matcher(input).find()) {
            return false;
        }
        if (!Pattern.compile("[~!@#$%^&*()_+{}|:<>?]").matcher(input).find()) {
            return false;
        }
        if (input.length() < 8) {
            return false;
        }
        return true;
    }

    public static void main(String[] a) {
        boolean result = isPasswordCorrect("Thaopham@123");
        System.out.println("Pass hop le: " + result);
    }
}
