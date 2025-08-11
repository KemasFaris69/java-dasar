/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kemasfaris
 */
public class SwitchLambda {
    public static void main(String[]args) {
        var nilai = "A";
        
        switch(nilai) {
            case "A", "AB" -> System.out.println("Wow Anda Lulus Dengan Baik");
            case "B","C","D", "BC" -> System.out.println("Anda Lulus");
            default -> {
                System.out.println("Ada Tidak Lulus");
            }
            
        }
         String ucapan;
         switch(nilai) {
            case "A", "AB" -> ucapan = "Wow Anda Lulus Dengan Baik";
            case "B","C","D", "BC" -> ucapan = "Anda Lulus";
            default -> {
                ucapan = "Ada Tidak Lulus";
            }
            
        }
          System.out.println(ucapan);

    ucapan = switch (nilai) {
      case "A":
        yield "Wow, Anda Lulus Dengan Baik";
      case "B", "C":
        yield "Nilai Anda Cukup Baik";
      case "D":
        yield "Anda Tidak Lulus";
      default:
        yield "Muungkin Anda Salah Jurusan";
    };

    System.out.println(ucapan);
  }
}