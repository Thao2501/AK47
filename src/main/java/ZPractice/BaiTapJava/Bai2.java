package ZPractice.BaiTapJava;

import java.util.Scanner;

public class Bai2 {
    //Lay 4 ky tu cuoi cung cua 1 chuoi cho truoc

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        get4Character(input);
        //hello
    }

    public static void get4Character(String inputFunc) {
        String output = null;
        for (int i = (inputFunc.length() - 4); i < inputFunc.length(); i++) {
            System.out.println(inputFunc.charAt(i));
        }
    }
}
