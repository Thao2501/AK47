package ZPractice.JavaStream.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class Sum {
    //Tinh tong cac so lon hon 5 trong mang
    public static void main(String[] args) {
        int[] listNumber = {2, 6, 7, 5, 1, 2};

        int sum = Arrays.stream(listNumber)
                .filter(n -> n > 5)
                .sum();
        System.out.println(sum);


        //B2
        List<Integer> bai6 = Arrays.asList(10, 20, 30, 40);

        int sum2 = bai6.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum2);

    }
}
