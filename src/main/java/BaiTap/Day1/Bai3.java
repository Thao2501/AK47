package BaiTap.Day1;

import java.util.regex.Pattern;

public class Bai3 {
//    // Convert to Array: [t,h,o,a,p,h,a,m]
//    // t -> T
//    // T ?= t tren array khong
//    public static boolean isUppercase(String input) {
//        if (input == null || input.trim().isEmpty()) {
//            return false;
//        }
//        for (Character character : input.toCharArray()) {
//            if (Character.isUpperCase(character)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static boolean isUppercase2(String input) {
//        return input.matches(".*[A-Z].*");
//    }
//
//    public static void main(String[] abc) {
//        String input = "thao Pham";
//        System.out.println("Is has uppercase character: " + isUppercase(input));
//        System.out.println("Is has uppercase character 2: " + isUppercase2(input));
//
//    }

    //input: nhap 1 chuoi -> output: kiem tra chuoi co chua ky tu viet hoa khong


    public static void main(String[] args) {
//Cach 1: dung Character.inUppercase
        String input = "Abc";
        boolean isContainUppercase = false;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                isContainUppercase = true;
                break;
            }
        }
        System.out.println("Co chua special character: " + isContainUppercase);

        // Cach HH
        String inputNe = "haha";
        boolean isContainUppercaseHH = false;
        for (Character character : inputNe.toCharArray()) {
            if (Character.isUpperCase(character)) {
                isContainUppercaseHH = true;
                break;}
            }
        System.out.println("Cach cua HH: " + isContainUppercaseHH);

        //Cach 2: dùng regex
        String input2 = "Abc";

        boolean isContainUppercase2 = Pattern.compile("[A-Z]").matcher(input2).find();
//        [A-Z]: Biểu thức chính quy để khớp với các ký tự viết hoa từ A đến Z.
//        Pattern.compile("[A-Z]"): Tạo một đối tượng Pattern để tìm các ký tự viết hoa.
//        matcher(input).find(): Kiểm tra xem chuỗi có chứa ký tự phù hợp với biểu thức không.
        System.out.println("Co chua special character: " + isContainUppercase2);

        //Cach 3: dung String.matches

        String input3 = "xyZ";

        boolean isContainUppercase3 = input.matches(".*[A-Z].*");

        System.out.println("Co chua special character: " + isContainUppercase3);

    }
}





