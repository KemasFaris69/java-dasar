/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kemasfaris
 */
public class SwitchStatement {
    public static void main(String[]args) {
        
        var nilai = "A";
        
        switch (nilai) {
            case "A": 
             System.out.println("Wow Anda Lulus Dengan Baik");
             break;
            case "B":
            case "C":
            case "D":
             System.out.println("Anda Lulus");
             break;
            default:
             System.out.println("Mungkin Anda Salah Jurusan");
        }
    }
}
