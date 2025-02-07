package ZPractice.HashMap;

import java.util.HashMap;

public class OnTap {
//    Input: "hashmap"
//    Output: {h=2, a=2, s=1, m=1, p=1}

    public static void main(String[] args) {
        String input = "thaopham";
        HashMap<Character, Integer> list = new HashMap<>();

        for (Character kytu : input.toCharArray()) {
            if (list.containsKey(kytu)) {
                int counter = list.get(kytu);
                counter++;
                list.put(kytu, counter);
            } else {
                list.put(kytu, 1);
            }
        }
        System.out.println(list);
    }
}
