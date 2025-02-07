package BaiTap.Day1;

import static java.lang.Integer.parseInt;

public class BAi1 {
//    public static int convertToInt(String input) {
//        // $50.00
//        String converted = input.replace("$", "");
//        // 50.00
//        // String to Float
//        return (int) Float.parseFloat(converted);
//    }
//
//    public static float convertToFloat(String input) {
//        String converted = input.replace("$", "");
//        // 50
//        return Float.parseFloat(converted);
//    }
//
//    public static void main(String[] abc) {
//        String input = "$50.00";
//        int resultInt = convertToInt(input);
//        System.out.println("Int = " + resultInt);
//        float resultFloat = convertToFloat(input);
//        System.out.println("Float = " + resultFloat);
//    }

    // input: $50.00 => Output: in ra man hinh so int hoat float

    public static void main(String[] a) {
        String input = "$50.00";
        String numbericValue = input.replace("$", "");

        float outputFloat = Float.parseFloat(numbericValue);
        int outputInt = (int) outputFloat;

        System.out.println("ket qua int: " + outputInt);
        System.out.println("ket qua float: " + outputFloat);

    }
}
