package ZPractice.JavaStream.IntermediateOperations;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    //Sap xem danh sach
    public static void main(String[] args ){
        List<Integer> listNumber = Arrays.asList(3,5,6,2,6);

        List<Integer> sortNumber = listNumber.stream()
                .sorted()
                .collect(Collectors.toUnmodifiableList());

        System.out.println(sortNumber);
        List<String> listString = Arrays.asList("sd","dd","aa");

        List<String> sortString = listString.stream()
                .sorted()
                .collect(Collectors.toUnmodifiableList());

        System.out.println(sortString);


    }
}
