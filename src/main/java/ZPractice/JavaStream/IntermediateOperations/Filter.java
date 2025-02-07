package ZPractice.JavaStream.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    //Lọc các số chẵn trong list

    public static void main(String[] args) {
        List<Integer> listNumber = Arrays.asList(132, 543, 43, 5452, 44);

        List<Integer> soChan = listNumber.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(soChan);
    }

    public static class Sort {
    }
}
