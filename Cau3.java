/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontapmuc1;

/**
 *
 * @author ADMIN
 */
//Câu 3: Cho một dãy số bấy kỳ. In ra các số nguyên tố thuộc dãy đó (nếu có).
public class Cau3 {
    public static String inDaySo(int[] n){
        String daySo = new String();
        for (int i : n){
            if (i != 0)
                daySo = daySo + Integer.toString(i) + " ";
        }
        return daySo;
    }
    
    public static boolean kiemTraSoNguyenTo(int n){
        if (n <= 1) {
           return false;
       }
       for (int i = 2; i <= Math.sqrt(n); i++) {
           if (n % i == 0) {
               return false;
           }
       }
       return true;
    }
    
    public static void kiemTraDaySoNguyenTo(int[] input, int[] output){
        int outputIndex = 0;
        for (int i : input) {
            if (kiemTraSoNguyenTo(i)){
                output[outputIndex++] = i;
            }
        }
    }
}
