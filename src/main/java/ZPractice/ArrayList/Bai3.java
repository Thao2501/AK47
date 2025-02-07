package ZPractice.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {

//    Tạo một ArrayList chứa các chuỗi (ví dụ: tên thành phố).
//    Nhập một chuỗi từ bàn phím và kiểm tra chuỗi đó có tồn tại trong danh sách không.

    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        city.add(0, "PY");
        city.add(0, "SG");
        city.add(0, "BT");
        city.add(0, "HN");

        Scanner scanner = new Scanner(System.in);
        String inputCity = scanner.nextLine();

            if (city.contains(inputCity)) {
                System.out.println("Ten nhap vao bi trung");
            } else {
                System.out.println("Ten nhap vao khong bi trung");
            }


    }
}
