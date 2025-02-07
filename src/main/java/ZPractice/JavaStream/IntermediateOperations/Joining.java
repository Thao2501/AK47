package ZPractice.JavaStream.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    //Gop cac phan tu thanh chuoi
    public static void main(String[] args ){
        List<String> list = Arrays.asList("Pham", "Thi", "Thanh", "Thao");

        String join = list.stream().collect(Collectors.joining(" "));
        System.out.println(join);
    }
}
