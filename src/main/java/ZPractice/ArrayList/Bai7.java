package ZPractice.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
// Tạo một ArrayList chứa các số nguyên.
// Nhập một số nguyên từ bàn phím và đếm số lần xuất hiện của nó trong danh sách.
        ArrayList<Integer> listNums = new ArrayList<>();

        listNums.add(25);
        listNums.add(1);
        listNums.add(10);
        listNums.add(12);
        listNums.add(1);


        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int count = 0;
        for (int num : listNums){
            if (input == num){
                count++;
            }
        }
        System.out.println("SO lan xuat hien la: " + count);

    }
}
