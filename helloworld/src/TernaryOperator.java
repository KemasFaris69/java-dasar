/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kemasfaris
 */
public class TernaryOperator {
    public static void main(String[]args){
        //Menggunakan If else
        
        var nilai = 75;
//        String ucapan;
//        
//        if(nilai >= 75) {
//            ucapan = "Selamat Anda Lulus";
//        }else{
//            ucapan = "Silahkan coba lagi";
//        }
//        System.out.println(ucapan);
        
        
        //Ternary Operator
        String ucapan = nilai >= 75 ? "Selamat Amda Lulus" : "Silahkan Coba Lagi";
        System.out.println(ucapan);
    }
}
