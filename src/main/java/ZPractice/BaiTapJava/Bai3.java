package ZPractice.BaiTapJava;

import java.util.HashMap;
import java.util.Scanner;

public class Bai3 {
    //Tìm ký tự không lặp lại đầu tiên của một chuoi

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //hello
        //{(h:1, e:2, l:2,o:1)

        HashMap<Character, Integer> hashMap = new HashMap<>();


        for (int i = 0; i < input.length(); i++) {
            if (hashMap.containsKey(input.charAt(i))) {
                int counter = hashMap.get(input.charAt(i));
                counter++;
                hashMap.put(input.charAt(i), counter);
            } else {
                hashMap.put(input.charAt(i), 1);
            }
        }
        System.out.println(hashMap);


        for (Character j : input.toCharArray()) {
            if (hashMap.get(j) == 1) {
                System.out.println(j);
                break;
            }
        }

    }

}







