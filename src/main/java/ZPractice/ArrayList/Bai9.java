package ZPractice.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Bai9 {
//    Tạo một ArrayList chứa các số nguyên từ 1 đến 10.
//    Xáo trộn thứ tự các phần tử trong danh sách một cách ngẫu nhiên.

    public static void main(String[] args) {
        ArrayList<Integer> listNums = new ArrayList<>();

        listNums.add(0, 1);

        listNums.add(1, 2);

        listNums.add(2, 3);

        listNums.add(3, 4);

        listNums.add(4, 5);

        listNums.add(5, 6);

        listNums.add(6, 7);

        Collections.shuffle(listNums);
        System.out.println(listNums);

    }
}

