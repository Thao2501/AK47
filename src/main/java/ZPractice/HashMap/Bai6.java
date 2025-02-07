package ZPractice.HashMap;

import java.util.HashMap;

public class Bai6 {
//    Viết chương trình để tìm giá trị lớn nhất trong một HashMap
//    lưu thông tin điểm thi (key là mã học sinh, value là điểm số).
// in ra ma sv - diem cua nguoi co diem lon nhat
// {"SV1" : 3, "SV2": 6, "SV3": 10}

    //B1. Create hashmap
    // - key: String - maSV
    // - value: Integer - score
    //B2. Create String maxScoreSVKey = null
    //B3. Di tung key trong keySet:
    // - if (maxScoreKey == null) {
    // maxScoreSVKey = key
    // } else {
    //    if hashmap.get(key) > hashmap.get(maxScoreKey) {
    //      maxScoreKey = key
    //    }
    // }
    //
    // In ra hasmap.get(maxScoreSVKey)

    //  Viết chương trình để tìm giá trị lớn nhất trong một HashMap
    //    lưu thông tin điểm thi (key là mã học sinh, value là điểm số).
    public static void main(String[] args) {
        HashMap<String, Integer> listSV = new HashMap<>();
        listSV.put("001", 9);
        listSV.put("002", 10);
        listSV.put("003", 8);

        String maSVMax = null;
        var dsMaSV = listSV.keySet();
        for (String maSV : dsMaSV) {
            if (maSVMax == null) {
                maSVMax = maSV;
            } else {
                int diemSVHienTai = listSV.get(maSV);
                int diemSVMax = listSV.get(maSVMax);
                if (diemSVHienTai > diemSVMax){
                    maSVMax = maSV;
                }
            }
        }System.out.println("SV co diem cao nhat: " + maSVMax + " co diem la "+ listSV.get(maSVMax));


    }
}
