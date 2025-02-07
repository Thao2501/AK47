package ZPractice.HashMap;

import java.util.HashMap;

// .split(ky tu muon tach) -> tach cau thanh tung chu neu ky tu muon tach la ky tu truyen vao
// hi hi he he
// ["hi",...,"he"]
// hien-love-tp
// .split("-")
// String[] ["hien","love","tp"]
public class Bai4 {
    public static void main(String[] args) {
       String input = "This is a test. This test is easy.";
       input = input.replace(".","");
       // "This is a test This test is easy"

       HashMap<String, Integer> hashMap = new HashMap<>();
       String[] splitedArr = input.split(" ");
       // ["This",....,"easy"]
       for (String word: splitedArr ) {
           if (hashMap.containsKey(word)){
               int counter = hashMap.get(word);
               counter++;
               hashMap.put(word,counter);
           }else{
               hashMap.put(word,1);
           }
       }

       System.out.println(hashMap);
    }
}
