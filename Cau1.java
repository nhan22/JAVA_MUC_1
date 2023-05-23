/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontapmuc1;

/**
 *
 * @author ADMIN
 */
///Tính tổng s=1+1/2!+1/3!+...+1/n!
public class Cau1 {
    public static int giaiThua(int n){
        int gt = 1;
        for (int i = 1; i <=n; i++) {
            gt *=i;
        }
        return gt;
    }
    
    public static double s(int n){
        double tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += (double) 1/giaiThua(i);
        }
        return tong;
    }
}
