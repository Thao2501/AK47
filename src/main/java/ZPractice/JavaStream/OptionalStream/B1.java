package ZPractice.JavaStream.OptionalStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class B1 {
    public static void main(String[] args) {
        //Tim phan tu lon nhat trong chuoi
        List<Integer> listNumber = Arrays.asList(5, 12, 7, 3, 19, 1);

        Optional<Integer> maxNumber = listNumber.stream().max(Integer::compareTo);

        if (maxNumber.isPresent()) {
            System.out.println("So lon nhat: " + maxNumber.get());
        } else {
            System.out.println("null");
        }

    }
}
