package ZPractice.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Bai4 {
//    Tạo một ArrayList chứa các số thực (double).
//    Sắp xếp danh sách này theo thứ tự tăng dần và giảm dần.
    public static void main(String[] args ){
        ArrayList<Double> listSoThuc = new ArrayList<Double>();
        Random random = new Random();
        listSoThuc.add(0,random.nextDouble());
        listSoThuc.add(1,random.nextDouble());
        listSoThuc.add(2,random.nextDouble());
        listSoThuc.add(3,random.nextDouble());

        System.out.println("List so thuc la: "+ listSoThuc);
        Collections.sort(listSoThuc); // tang dan
        System.out.println("Thu tu tu nho den lon la: " +listSoThuc);

        Collections.reverse(listSoThuc);//dao nguoc danh sach
        System.out.println("Thu tu tu lon den nho la: " +listSoThuc);


    }
}
