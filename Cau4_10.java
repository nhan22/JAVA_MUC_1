/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontapmuc1;

/**
 *
 * @author ADMIN
 */
//Câu 4: Cho một dãy số bất kỳ. In dãy số theo chiều tăng dần
public class Cau4_10 {
    public static void xapSepTang(int[] input, int[] output){
        int indexOutput = 0;
        for (int i : input){
            output[indexOutput++] = i;
        }
        for(int i = 0; i<output.length;i++){
            for(int j = i + 1; j < output.length; j++){
                if(output[i] > output[j]){
                    // Hoan vi 2 so a[i] va a[j]
                    int tg = output[i];
                    output[i] = output[j];
                    output[j] = tg;        
                }
            }
        }
    }
    
    public static int max(int[] input){
        int temp = input[0];
        for (int i : input){
            if (i > temp) temp = i;
        }
        return temp;
    }
    
    public static int min(int[] input){
        int temp = input[0];
        for (int i : input){
            if (i < temp) temp = i;
        }
        return temp;
    }
    
    public static void inChanLe(int[] input){
        System.out.print("Cac phan tu Chan trong day: ");
        for (int i : input){
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println("");
        System.out.print("Cac phan tu Le trong day: ");
        for (int i : input){
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    public static int demSoLanSuatHienChuoiCon(String input, String con){
        int dem = 0;
        for (int i = 0; i<=input.length()-con.length(); i++){
            //System.out.println(input.substring(i, i+con.length()));
            if (input.substring(i, i+con.length()).equals(con)){
                dem++;
            }
        }
        return dem;
    }
    
    public static void inSauDaoNguoc(String input){
        StringBuffer str = new StringBuffer(input);
        System.out.print(str.reverse().toString());
    }
    
    public static void inTachHoTen(String input){
        input = input.trim(); //xóa khoảng trắng đầu và cuối
        int index = 0;
        for (int i = input.length()-1; i>0; i--){
            if (input.charAt(i) == ' '){
                index = i;
                break;
            }
        }
        System.out.println("Ho: " + input.substring(0, index));
        System.out.println("Ten: " + input.substring(index+1));
    }
    
    public static void chenSauVaoGiua(String sauChen, String sauBiTren){
        int viTriChen = (int) sauBiTren.length()/2;
        StringBuffer str = new StringBuffer(sauBiTren);
        str.insert(viTriChen, sauChen);
        System.out.println(str);
    }
}
