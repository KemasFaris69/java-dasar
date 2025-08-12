/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kemasfaris
 */
public class test {
     public static void main(String[] args) {
        // Contoh masukan
        String hujan = "tidak"; // "ya" atau "tidak"
        String membawaPayung = "tidak"; // "ya" atau "tidak"

        // Panggil prosedur untuk menentukan keputusan
        tentukanKeputusan(hujan, membawaPayung);
    }

    // Prosedur untuk menentukan keputusan
    public static void tentukanKeputusan(String hujan, String membawaPayung) {
        if (hujan.equalsIgnoreCase("ya") && membawaPayung.equalsIgnoreCase("ya")) {
            System.out.println("berangkat");
        } else {
            System.out.println("diam di rumah");
}
}

}
