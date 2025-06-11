package com.giaolang.util.mathutil.core;

public class MathUtility {

    //CLASS NÀY DÙNG CUNG CẤP CÁC HÀM TÍNH TOÁN TOÁN HỌC
    //BẮT CHƯỚC CLASS MATH. TRONG JDK
    //VÌ NHỮNG TÍNH TOÁN NÀY, TÍNH XONG RỒI TRẢ RA, KO CẦN LƯU TRỮ LẠI
    //DO ĐÓ TA THIẾT KẾ NÓ DẠNG STATIC

    //TA LÀM HÀM TÍNH N! = 1.2.3.4...N
    //QUY ƯỚC:
    //0! = 1 (CỦA BÊN TOÁN HỌC)
    //KO CÓ GIAI THỪA SỐ ÂM, -5! KO HỢP LỆ
    //20! VỪA ĐỦ KIỂU LONG, 21! KO DÙNG LONG ĐC
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 and 20");
            //nếu đưa data n cà chớn, ném ra ngoại lệ, ném câu thông báo, ko có giá trị trả về
        }

        if (n == 0) {
            return 1;
        }

        //cpu chạy đc đến đây tức là n = 1, 2, 3... 19, 20
        //tính n! = 1.2.3.4... thuật toán con heo đất, ốc bu nhồi thịt, nhân dồn, cộng dồn tích luỹ
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;  //i = 1 nhân 1, i = 2 nhân 2; i = 3 nhân 3, dồn vào result
        }                //đang có bao nhiêu nhân tiếp
        return result;
    }


}
