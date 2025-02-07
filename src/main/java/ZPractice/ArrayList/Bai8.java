package ZPractice.ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Bai8 {
//    Tạo một ArrayList chứa các số nguyên.
//    Tạo một danh sách mới chỉ chứa các số chẵn từ danh sách ban đầu.

    public static void main(String[] args) {
        ArrayList<Integer> listNums = new ArrayList<>();
        Random random = new Random();
        listNums.add(random.nextInt(100));
        listNums.add(random.nextInt(100));
        listNums.add(random.nextInt(100));
        listNums.add(random.nextInt(100));
        System.out.println("List danh sach la: " + listNums);

        ArrayList<Integer> result = new ArrayList<>();

        for (int num : listNums) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        System.out.println("ket qua la " + result);
    }
}
