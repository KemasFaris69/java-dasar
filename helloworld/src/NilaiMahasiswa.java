import java.util.Scanner;

class NilaiMahasiswa {
    public static void main(String[] args) {
        int nilaiInput;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("===== Nilai Mahasiswa =====");
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