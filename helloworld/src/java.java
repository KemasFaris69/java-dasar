import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author kemasfaris
 */
public class java {
    public static void main(String[] args) {
        int nilaiInput;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("===== Nilai Mahasiswa =====");
        System.out.println("Jumlah Masukkan :");
        System.out.println("Masukkan nilai : ");
        nilaiInput = keyboard.nextInt();
        switch (nilaiInput) {
            case -5:
                System.out.println("A");
                break;
            case -10:
                System.out.println("B");
                break;
            case -15:
                System.out.println("C");
                break;
            case -20:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}
