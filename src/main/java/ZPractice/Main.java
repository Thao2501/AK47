package ZPractice;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //B1: thay ký tự @  bằng ký tự _
        String input1 = "thao@123";
        String replace = input1.replace("@", "_");
        System.out.println("output replace is: " + replace);

        //B2: Lấy 4 ký tự cuối cùng của một chuỗi cho trước
        // C1:
        String input2 = "123abcd";
        if (input2.length() < 4) {
            System.out.println("invalid");
        } else {
            String output2 = input2.substring(input2.length() - 4);
            System.out.println("Bai 2: " + output2);
        }
        //C2:
        String output2Cach2 = "";
        int lengthInput2 = input2.length();
        int counter = lengthInput2 - 4;
        for (int i = counter; i < lengthInput2; i++) {
            output2Cach2 += input2.charAt(i);
        }
        System.out.println("Bai 2 cach 2: " + output2Cach2);

        //Bai 3: Tìm ký tự không lặp lại đầu tiên của một chuoi


        //Bai 4:Tìm số lớn nhất và lớn thứ 2 của một mảng

        int[] input4 = {1, 2, 3, 4, 3};
        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < input4.length; i++) {
            if (input4[i] > max) {
                secondMax = max;
                max = input4[i];
            }
        }
        System.out.println("Bai 3 So lon nhat la: " + max);
        System.out.println("Bai 3 So lon t2 la: " + secondMax);

        //Bai 5: Tìm độ lệch lớn nhất giữa 2 phần tử trong một mảng:
        int[] input5 = {2, 4, 6, 3};
        int maxBai5 = input5[0];
        int minBai5 = input5[0];

        for (int i : input5) {
            if (input5[i] > maxBai5) {
                maxBai5 = input5[i];
            } else if (input5[i] < minBai5) {
                minBai5 = input5[i];
            }
            int result5 = maxBai5 - minBai5;

            System.out.println("Max bai 5: " + maxBai5);
            System.out.println("Min bai 5: " + minBai5);
            System.out.println("Do lech lon nhat: " + result5);

//lam lai            //Bai 6: Tìm vị trí của các số lặp lại trong mảng


        }

    }
}







