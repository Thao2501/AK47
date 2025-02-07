package ZPractice.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class Bai5 {
//    Tạo hai ArrayList chứa các chuỗi ký tự.
//    Gộp hai danh sách này lại thành một danh sách duy nhất.
//    Loại bỏ các phần tử trùng lặp và in danh sách kết quả.

    public static void main(String[] args ){
        ArrayList<String > list1 = new ArrayList<>();
        ArrayList<String > list2 = new ArrayList<>();


        list1.add("Thao");
        list1.add("Hien");
        list1.add("Diem");
        list2.add("Thao");
        list2.add("Thuy");
        list2.add("Tri");

        ArrayList<String> merge = new ArrayList<>(list1);
        System.out.println(merge);
        merge.addAll(list2);

        HashSet<String> uniqueSet = new HashSet<>(merge);
        System.out.println(uniqueSet);



    }
}
