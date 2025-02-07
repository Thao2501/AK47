package ZPractice.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

// Check key ton tai hay chua
// Chua ton tai -> tao moi key, value
// Ton tai roi -> lay ra add value -> put lai
public class Bai5 {
//    Input: ["cat", "dog", "elephant", "bee", "tiger"]
//    Output: {3=["cat", "dog", "bee"], 5=["tiger"], 8=["elephant"]}

    public static void main(String[] args) {
        String[] list = {"cat", "dog", "elephant", "bee", "tiger"};

        // B0.khoi tao hashmap <integer, arraylist<String>>
        // key: integer - do dai word
        // value: arrayList - ds cac word co cung do dai
        // B1.Di tung word  {
        // - create wordLength = word.length // "dog".length
        // - neu hashMap contain key: <wordLength> thi:
        // + Exist:
        //    .hashmap.get(wordLength) -> se co array list cu
        //    .lay arraylist do, add word vao
        //    .put vao lai hasmap
        // + Not Exist:
        //    .create a arrayList, add vao word
        //    .hashMap.put(wordLength, arrayList) // {3: ["cat"]}
        // }
        // B2. In ket qua

        //    Input: ["cat", "dog", "elephant", "bee", "tiger"]
        //    Output: {3=["cat", "dog", "bee"], 5=["tiger"], 8=["elephant"]}

        HashMap<Integer, ArrayList<String>> listAnimal = new HashMap<>();

        for (String word : list){
            int wordLength = word.length();
            if (listAnimal.containsKey(wordLength)){
                ArrayList<String> arrayList= listAnimal.get(wordLength);
                arrayList.add(word);
                listAnimal.put(wordLength,arrayList);

            }else {
                ArrayList<String > arrayList = new ArrayList<>();
                arrayList.add(word);
                listAnimal.put(wordLength,arrayList);
            }
        }
        System.out.println(listAnimal);
    }
}

