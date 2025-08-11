
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kemasfaris
 */
public class tugas1 {
    public class tugas {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int belajarCount = 0;
        int mainCount = 0;
        
        System.out.println("Masukkan aktivitas ('tidur' untuk berhenti):");
        
        while (true) {
            String aktivitas = scanner.nextLine().toLowerCase();
            
            if (aktivitas.equals("tidur")) {
                break;
            } else if (aktivitas.equals("belajar")) {
                belajarCount++;
            } else if (aktivitas.equals("main")) {
                mainCount++;
            }
        }
        
        System.out.println("Jumlah aktivitas belajar: " + belajarCount);
        System.out.println("Jumlah aktivitas main: " + mainCount);
    
            }

    }
    
}