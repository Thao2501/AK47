package ZPractice.JavaStream.Practice;

import java.util.*;
import java.util.stream.Collectors;

public class B1 {
    public static void main(String[] args) {
        //Bai 1
        List<Integer> listNumber = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> listOutput = listNumber.stream().filter(n -> n % 2 == 0).collect(Collectors.toUnmodifiableList());
        System.out.println(listOutput);

        //Bai 2
        List<String> listString = Arrays.asList("java", "stream", "api");

        List<String> listStringOutput = listString.stream().map(String::toUpperCase).collect(Collectors.toUnmodifiableList());
        System.out.println(listStringOutput);

        //Bai 3
        List<Integer> bai3 = Arrays.asList(5, 12, 7, 3, 19, 1);

        Optional<Integer> max = bai3.stream().max(Integer::compareTo);

        if (max.isPresent()) {
            System.out.println("Max la: " + max.get());
        } else {
            System.out.println("null");
        }
        //Bai 4

        List<Integer> bai4 = Arrays.asList(1, 20, 15, 8, 5, 11);

        List<Integer> listGreater10 = bai4.stream().filter(n -> n > 10).collect(Collectors.toUnmodifiableList());

        int soPhanTuLonHon10 = listGreater10.size();
        System.out.println(soPhanTuLonHon10);

        //Bai 5

        List<Integer> bai5 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> outputBai5 = bai5.stream().distinct().collect(Collectors.toUnmodifiableList());
        System.out.println(outputBai5);

        //Bai 6

        List<Integer> bai6 = Arrays.asList(10, 20, 30, 40);

        int sum = bai6.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);

        int sum2 = 0;
        for (int n : bai6) {
            sum2 += n;
        }
        System.out.println(sum2);

        //Bai 7

        List<Integer> bai7 = Arrays.asList(5, 3, 9, 7, 2, 8);

        int min = bai7.get(0);
        int secondMin = bai7.get(0);
        //C1
        for (int i = 0; i < bai7.size(); i++) {
            if (bai7.get(i) < min) {
                secondMin = min;
                min = bai7.get(i);
            }
        }
        System.out.println("so nho nhi la :" + secondMin);
        //C2 -> Optionel B2

        //Bai8

        List<String> bai8 = Arrays.asList("A", "B", "C", "D");

        String outputBai8 = bai8.stream().collect(Collectors.joining(", "));
        System.out.println(outputBai8);

        //Bai9

        List<Integer> bai9 = Arrays.asList(10, 20, 30, 40);

        int outputBai9 = bai9.stream().mapToInt(Integer::intValue).sum();
        int size = bai9.size();
        int trungBinhCong = outputBai9 / size;

        System.out.println(trungBinhCong);

        //Bai10

        List<String> bai10 = Arrays.asList("apple", "banana", "kiwi", "pear", "cherry", "fig");

        Map<Integer, List<String>> output = bai10.stream().collect(Collectors.groupingBy(String::length));

        output.forEach((length, group) -> {
            System.out.println("Độ dài: " + length + " -> " + group);
        });

    }

}
