package ZPractice.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Bai6 {
//    Tạo một ArrayList chứa các số nguyên.
//    Đảo ngược thứ tự các phần tử trong danh sách và in ra.

    public static void main(String[] args) {
        ArrayList<Integer> listnums = new ArrayList<>();
        Random ramdom = new Random();

        listnums.add(ramdom.nextInt(0, 100));
        listnums.add(ramdom.nextInt(1, 100));
        listnums.add(ramdom.nextInt(2, 100));
        listnums.add(ramdom.nextInt(3, 100));
        listnums.add(ramdom.nextInt(4, 100));

        System.out.println("list nums random la: " + listnums);
ArrayList<Integer> reverse = new ArrayList<Integer>(listnums);
        Collections.reverse(reverse);
    System.out.println("list nums dao nguoc la: " + reverse);

        for (int num : reverse){
            System.out.println(num);
        }



    }
}
