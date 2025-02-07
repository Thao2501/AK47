package ZPractice.ArrayList;

import java.util.ArrayList;

public class Bai10 {
    //    Tạo một danh sách chứa nhiều ArrayList con, mỗi ArrayList con lưu các tên của một nhóm bạn.
    //    In ra toàn bộ danh sách theo định dạng nhóm.
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> listGroup = new ArrayList<>();

        ArrayList<String> group1 = new ArrayList<>();
        group1.add(0, "A");
        group1.add(1, "B");
        group1.add(2, "C");

        ArrayList<String> group2 = new ArrayList<>();
        group2.add(0, "X");
        group2.add(1, "Y");
        group2.add(2, "Z");

        ArrayList<String> group3 = new ArrayList<>();
        group3.add(0, "1");
        group3.add(1, "2");
        group3.add(2, "3");

        listGroup.add(group1);
        listGroup.add(group2);
        listGroup.add(group3);

        System.out.println(listGroup);


        for (ArrayList<String> group : listGroup) {
            System.out.println(group);
            for (String name : group) {
                System.out.println(name);
            }
        }


    }

}
