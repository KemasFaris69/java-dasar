import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kemasfaris
 */
public class NilaiMahasiswas {
 public static void main(String[] args) {
        int nilaiInput;
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("===== Nilai Mahasiswa =====");
            System.out.println("Jumlah Masukkan :");
            System.out.println("Masukkan nilai : ");
            nilaiInput = keyboard.nextInt();
        }
        String grade = switch (nilaiInput) {
            case -5 -> "A";
            case -10 -> "B";
            case -15 -> "C";
            case -20 -> "D";
            default -> "F";
        };
        System.out.println(grade);

        }

}
    

