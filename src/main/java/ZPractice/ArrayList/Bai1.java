package ZPractice.ArrayList;

import java.util.ArrayList;

public class Bai1 {
    //Tạo một ArrayList để lưu trữ tên của 5 bạn trong lớp và in ra màn hình.

    public static void main(String[] args ){
        ArrayList<String> listName = new ArrayList<>();

        listName.add(0,"A");
        listName.add(1,"B");
        listName.add(2,"C");
        listName.add(3,"D");
        listName.add(4,"E");

        System.out.println("Danh sach la: ");
        for (String name : listName){
            System.out.println(name);
        }
    }
}
