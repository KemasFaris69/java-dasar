/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kemasfaris
 */
public class konversiNumber {
    public static void main(String [] args) {
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;

        System.out.println("Nilai byte: " + iniByte);
        System.out.println("Nilai short: " + iniShort);
        System.out.println("Nilai int: " + iniInt);
        System.out.println("Nilai byte setelah konversi: " + iniByte2);
    }
}
