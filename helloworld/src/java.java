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
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("===== Nilai Mahasiswa =====");
            System.out.println("Jumlah Masukkan :");
            System.out.println("Masukkan nilai : ");
            nilaiInput = keyboard.nextInt();
            switch (nilaiInput) {
                case -5 -> System.out.println("A");
                case -10 -> System.out.println("B");
                case -15 -> System.out.println("C");
                case -20 -> System.out.println("D");
                default -> System.out.println("F");
            }
        }
    }
}
