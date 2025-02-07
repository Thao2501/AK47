package ZPractice.ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Bai2 {
    //    Tạo một ArrayList chứa các số nguyên.
//    Thêm 10 số ngẫu nhiên vào danh sách.
//    Xóa phần tử đầu tiên và cuối cùng.
//    In danh sách sau khi xóa.
    public static void main(String[] args) {
        ArrayList<Integer> listNums = new ArrayList<>();
        Random ramdom = new Random();

        for (int i = 0; i < 10; i++) {
            listNums.add(ramdom.nextInt(100));
        }

        System.out.println("Danh sach ban dau la: " + listNums);

        listNums.remove(0);
        listNums.remove(listNums.size() - 1);

        System.out.println("Danh sach sau khi xoa la: ");
        for (int nums : listNums) {
            System.out.println(nums);
        }
    }

}
