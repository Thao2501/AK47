package ZPractice.HashMap;

import java.util.HashMap;
import java.util.Scanner;

// put(key, value) -> add (neu key khong ton tai)/edit (neu key ton tai) vao hashmap
// .get(key) -> tra ve value or null
//.values() -> lay list value
//.ketSet() -> lay list key
//.containsValue(value) -> kiem tra xem co value ko
//containsKey(key) -> kiem tra xem co key ko
// hashmap khong co thu tu item
public class CoBan {
    public static void main(String[] args) {
        HashMap<String, String> listSV = new HashMap<>();
        listSV.put("001", "A");
        listSV.put("002", "B");
        listSV.put("003", "C");
        listSV.put("004", "D");
        listSV.put("005", "E");

        System.out.println(listSV);

        Scanner scanner = new Scanner(System.in);
        String inputMaSV = scanner.nextLine();
        String tenSV = listSV.get(inputMaSV); // null or !null (String)
        if (tenSV == null) {
            System.out.println("khong tim thay MSSV");
        } else {
            System.out.println("Tim thay MSSV");
        }

        String inputTenSV = scanner.nextLine();

        boolean timTen = false;
        for (String name : listSV.values()) {
            if (inputTenSV.equals(name)) {
                timTen = true;
                break;
            }
        }

        if (timTen == true) {
            System.out.println("Tim thay SV");
        } else {
            System.out.println("Khong tim thay SV");
        }

        // Cach 2
        if (listSV.containsKey(inputMaSV)) {
            System.out.println("Co MSSV");
        } else {
            System.out.println("Khong co MSSV");
        }
        if (listSV.containsValue(inputTenSV)) {
            System.out.println("Co ten");
        } else {
            System.out.println("Khong co ten");
        }
    }
}
