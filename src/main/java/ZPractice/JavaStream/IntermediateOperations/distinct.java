package ZPractice.JavaStream.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class distinct {
    //Loai bo cac phan tu trung
    public static void main(String[] args){
        List<Integer> listNumber = Arrays.asList(21,21,4,6,7,4);

        List<Integer> distinctNUmber = listNumber.stream()
                .distinct()
                .collect(Collectors.toUnmodifiableList());
        System.out.println(distinctNUmber);
    }
}
