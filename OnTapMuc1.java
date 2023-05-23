/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ontapmuc1;

/**
 *
 * @author ADMIN
 */
//Câu 1: Cho một số tự nhiên n bất kỳ. Tính tổng s=1+1/2!+1/3!+...+1/n!
//Câu 2: Nhập một số tự nhiên n bất kỳ. Tính tích p=1.2.3.....n
//Câu 3: Cho một dãy số bấy kỳ. In ra các số nguyên tố thuộc dãy đó (nếu có).
//Câu 4: Cho một dãy số bất kỳ. In dãy số theo chiều tăng dần
//Câu 5: Cho một dãy số bất kỳ. In max, min của dãy số đó
//Câu 6: Cho một dãy số bấy kỳ. In ra các số chẵn và số lẽ trên 2 dòng khác nhau. 
//Câu 7: Cho một xâu ký tự bất kỳ. Đếm xem trong xâu có bao nhiêu lần xuất hiện của 
//xâu con “abc”
//Câu 8: Cho xâu S bất kỳ. In xâu S1 là xâu đảo ngược của xâu S
//Câu 9: Cho xâu ký tự là họ tên của bạn. In tách họ và tên bạn.
//Câu 10: Cho 2 xâu s1 và s2. Chèn xâu s1 vào giữa xâu s2. In kết quả ra màn hình
public class OnTapMuc1 {
    public static final int MAX_ARRAY = 20;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ///--------------------------------CÂU 1 -----------------------------------///
        int n = 10;
        System.out.print("n = " + n + "\n");
        
        double cau1 = Cau1.s(n);
        System.out.print("Cau 1: s = " + cau1+ "\n");
        
        ///--------------------------------CÂU 2 -----------------------------------///
        int cau2 = Cau2.p(n);
        System.out.print("Cau 2: p = " + cau2+ "\n");
        
        ///--------------------------------CÂU 3 -----------------------------------///
        int[] input = {3, 5, 7, 8, 19, 334, 5454, 33, 1237};
        int[] output3 = new int[MAX_ARRAY];
        Cau3.kiemTraDaySoNguyenTo(input, output3);
        System.out.print("Cau 3: cac so nguyen to trong day la:" + Cau3.inDaySo(output3) + "\n");
        
        ///--------------------------------CÂU 4 -----------------------------------///
        int[] output4 = new int[MAX_ARRAY];
        Cau4_10.xapSepTang(input, output4);
        System.out.print("Cau 4: day so theo chieu tang dan la:" + Cau3.inDaySo(output4) + "\n");
        
        ///--------------------------------CÂU 5 -----------------------------------///
        int max = Cau4_10.max(input);
        System.out.print("Cau 5: so lon nhat la:" + max + "\n");
        
        int min = Cau4_10.min(input);
        System.out.print("       so be nhat la:" + min + "\n");
        
        ///--------------------------------CÂU 6 -----------------------------------///
        System.out.print("Cau 6: \n");
        Cau4_10.inChanLe(input);
        
        ///--------------------------------CÂU 7 -----------------------------------///
        System.out.print("Cau 7: so lan suat hien chuoi con la: " 
                + Cau4_10.demSoLanSuatHienChuoiCon("abccbgaabcabc", "abc") + "\n");
        
        ///--------------------------------CÂU 8 -----------------------------------///
        System.out.print("Cau 8: dao nguoc sau s la: ");
        Cau4_10.inSauDaoNguoc("abccbgaabcabc");
        System.out.println("");
        ///--------------------------------CÂU 9 -----------------------------------///
        System.out.print("Cau 9: tach ho va ten: \n");
        Cau4_10.inTachHoTen("hoang van thach");
        System.out.println("");
        ///--------------------------------CÂU 10 -----------------------------------///
        System.out.print("Cau 10: chen sau s1 vao s2: \n");
        Cau4_10.chenSauVaoGiua("thach", "DABI CHEN VAO DAY");
        System.out.println("");
    }
    
}
