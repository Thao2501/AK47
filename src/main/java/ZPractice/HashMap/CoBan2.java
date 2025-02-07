package ZPractice.HashMap;

import java.util.HashMap;
import java.util.Scanner;

// .remove(key) -> xoa
//.containkey(key) -> kiem tra key co ton tai ko

public class CoBan2 {
    public static void main(String[] args) {
        HashMap<String, Integer> listSP = new HashMap<>();
        listSP.put("001", 1000);
        listSP.put("002", 2000);
        listSP.put("003", 3000);
        listSP.put("004", 4000);

        System.out.println("List sp luc dau: " + listSP);
        listSP.put("001", 5000);
        listSP.remove("004");

        System.out.println("List sp luc sau: " + listSP);

        // nhap ma sp
        // nhap gia sp
        // neu tim thay ma thi cap nhat, in ra "Cap nhat thanh cong sp <maSP>, gia: <> "
        // khong tim thay ma -> in ra "ma sp <> khong ton tai"

        Scanner scanner = new Scanner(System.in);
        String inputMaSP = scanner.nextLine();
        int inputGiaSP = scanner.nextInt();
        if (listSP.containsKey(inputMaSP) == true) {
            listSP.put(inputMaSP, inputGiaSP);
            System.out.println("Cap nhat thanh cong sp " + inputMaSP + ", " + inputGiaSP);
        } else {
            System.out.println("Ma san pham khong ton tai");
        }

        // San pham ma XXX co gia la XXX
        for (String key : listSP.keySet()) {
            System.out.println("San pham ma: " + key + " co gia la: " + listSP.get(key));
        }

    }
}



