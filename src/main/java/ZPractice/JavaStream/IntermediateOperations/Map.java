package ZPractice.JavaStream.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    //Chuyển đổi List<String> thành List<Integer>
    public static void main(String[] args){
        List<String> listString = Arrays.asList("1","24","86247");

        List<Integer> listInteger = listString.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(listInteger);
        //Chuyen chu thuong thanh chu hoa
        List<String> listString2 = Arrays.asList("java", "stream", "api");

        List<String> listStringOutput = listString2.stream().map(String::toUpperCase).collect(Collectors.toUnmodifiableList());
        System.out.println(listStringOutput);
    }
}
