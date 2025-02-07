package ZPractice.JavaStream.OptionalStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class B2 {
    //Tim phan tu nho thu hai trong danh sach
    public static void main(String[] args) {
        List<Integer> listNumber = Arrays.asList(5, 3, 9, 7, 2, 8);

        Optional<Integer> secondMin = listNumber.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst();

        if (secondMin.isPresent()){
            System.out.println("so nho nhi la: "+ secondMin.get());
        }else {System.out.println("null");}

    }
}
