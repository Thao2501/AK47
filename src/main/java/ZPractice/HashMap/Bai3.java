package ZPractice.HashMap;

import java.util.HashMap;
import java.util.Scanner;

// hashmap
// -> h=2, a=2, s=1, m=1, p=1
// tach chuoi ra char array
//tao hashmap (Character, Integer)
// Character: kytu, Integer: so lan xuat hien cua ky tu
// for (kytu: input)
// neu key cua hashmap co ky tu thi counter++, con khong thi truyen zo (kytu,1)

public class Bai3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        HashMap<Character, Integer> listKyTu = new HashMap<>();

        for (Character kytu : input.toCharArray()) {
            if (listKyTu.containsKey(kytu)) {
                int counter = listKyTu.get(kytu);
                counter++;
                listKyTu.put(kytu, counter);
            } else {
                listKyTu.put(kytu, 1);
            }
        }
        System.out.println(listKyTu);

    }
}
