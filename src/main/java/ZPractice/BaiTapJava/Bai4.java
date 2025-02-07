package ZPractice.BaiTapJava;

public class Bai4 {
    //Tìm số lớn nhất và lớn thứ 2 của một mảng
    public static void main(String[] args) {
        Integer[] input = {5, 2, 72, 5, 3};
        output(input);
    }

    public static void output(Integer[] inputfunc) {
        int max = inputfunc[0];
        int secondMax = inputfunc[0];
        for (int i = 0; i < inputfunc.length; i++) {
            if (inputfunc[i] > max) {
                secondMax = max;
                max = inputfunc[i];
            }
        }
        System.out.println("So lon nhat la: " + max + "So lon nhi la: " + secondMax);
    }

}
