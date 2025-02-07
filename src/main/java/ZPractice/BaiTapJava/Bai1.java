package ZPractice.BaiTapJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    // thay ký tự @  bằng ký tự _
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = replace(input);
        System.out.println(output);

        String[] input2 = {" abc", "bac ", "cb a"};
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < input2.length; i++) {
            String output2 = replace2(input2[i]);
            arrayList.add(output2);
        }
        System.out.println(arrayList);
    }

    public static String replace(String inputFunc) {
        String outputFunc = inputFunc.replace("@", "_");
        return outputFunc;
    }

    public static String replace2(String inputFunc) {
        String outputFunc = inputFunc.replace(" ", "");
        return outputFunc;
    }

}