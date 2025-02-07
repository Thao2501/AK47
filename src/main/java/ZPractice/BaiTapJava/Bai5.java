package ZPractice.BaiTapJava;

public class Bai5 {
    //Tìm độ lệch lớn nhất giữa 2 phần tử trong một mảng
    public static void main(String[] args) {
        Integer[] input = {5897, 8728, 918, 1};
        output(input);

    }

    public static void output(Integer[] inputFunc) {
        int max = inputFunc[0];
        int min = inputFunc[0];

        for (int i = 0; i < inputFunc.length; i++) {
            if (inputFunc[i] > max) {
                max = inputFunc[i];
            }
        }
        for (int i = 0; i < inputFunc.length; i++) {
            if (inputFunc[i] < min) {
                min = inputFunc[i];
            }
        }
        System.out.println("Do lech: " + (max - min));
    }
}
