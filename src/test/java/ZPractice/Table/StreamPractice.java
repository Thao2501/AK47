package ZPractice.Table;

import java.util.Comparator;
import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {
        List<String> name = List.of("Alice", "Bob", "Charlie", "ABC");

        //filter Lọc ra các phần tử trong stream theo một điều kiện nào đó.
        List<String> filter = name
                .stream()
                .filter(a -> a.startsWith("A"))
                .toList();
        System.out.println(filter);

        //map Ánh xạ từng phần tử của stream sang một giá trị mới.
        List<Integer> length = name
                .stream()
                .map(String::length)
                .toList();
        System.out.println(length);

        //min/max
        String min = name
                .stream()
                .min(Comparator.comparing(String::length))
                .orElse("no name found");
        System.out.println(min);


        

    }
}
