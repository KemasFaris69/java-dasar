import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int belajarCount = 0;
        int mainCount = 0;

        System.out.println("Masukkan aktivitas ('tidur' untuk berhenti):");

        while (true) {
            String aktivitas = scanner.nextLine().toLowerCase();

            if (aktivitas.equals("tidur")) {
                break; // ✅ keluar dari loop
            } else if (aktivitas.equals("belajar")) {
                belajarCount++;
            } else if (aktivitas.equals("main")) {
                mainCount++;
            }
        }

        scanner.close(); // ✅ ini sekarang bisa diakses

        System.out.println("Jumlah aktivitas belajar: " + belajarCount);
        System.out.println("Jumlah aktivitas main: " + mainCount);
    }
}

