import java.util.Scanner;

/**
 *
 * @author kemasfaris
 */
public class StudentGradeRange {
    public static void main(String[] args) {
        int nilaiInput;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("===== Nilai Mahasiswa =====");
        System.out.println("Masukkan nilai (0-100): ");
        nilaiInput = keyboard.nextInt();
        
        if (nilaiInput >= 85 && nilaiInput <= 100) {
            System.out.println("A");
        } else if (nilaiInput >= 75 && nilaiInput < 85) {
            System.out.println("B");
        } else if (nilaiInput >= 65 && nilaiInput < 75) {
            System.out.println("C");
        } else if (nilaiInput >= 55 && nilaiInput < 65) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        
        keyboard.close();
    }
}