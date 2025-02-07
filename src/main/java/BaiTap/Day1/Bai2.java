package BaiTap.Day1;

public class Bai2 {
//    public static void main(String[] abc) {
//       String userA = "Ha";
//       String userB = "Do";
//
//       StringBuilder fullName = new StringBuilder();
//       fullName.append(userA);
//       fullName.append(" ");
//       fullName.append(userB);
//
//       System.out.println("C1: " + fullName);
//
//       String fullName1 = String.format("%s %s", userA, userB);
//       System.out.println("C2: " + fullName1);
//
//       String fullName2 = "a b";
//       fullName2 = fullName2.replace("a", userA);
//       fullName2 = fullName2.replace("b", userB);
//       System.out.println("C3: " + fullName2);
//
//       String fullname3 = "ha".concat(" ").concat("do");
//        System.out.println("C3: " + fullname3);
//
//    }
    //input: "thao""pham" -> output: noi chuoi khong can dung +

    //C1: dùng String.format
    public static void main(String[] args) {
        String output1 = String.format("%s %s", "thao", "pham");
        System.out.println(output1);

        //C2: dung concat()

        String a = "thao";
        String b = "pham";
        String output2 = a.concat(" ").concat(b);
        System.out.println(output2);

        //C3: dung Stringbuilder

        String x = "thao";
        String y ="pham";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("thao");
        stringBuilder.append(" ");
        stringBuilder.append("pham");

        String outPut3 = stringBuilder.toString();

        System.out.println(outPut3);


    }
}
