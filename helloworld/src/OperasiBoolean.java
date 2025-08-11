/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kemasfaris
 */
public class OperasiBoolean {
    public static void main(String[]args) {
        var absen =75;
        var nilaiAkhir = 80;
        
        boolean lulusAbsen = absen >= 75;
        boolean lulusNilaiAkhir = nilaiAkhir >= 75;
        
        boolean lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
        
    }
}
