/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kemasfaris
 */
public class continues {
    public static void main(String[] args){
        for (int counter =1; counter <= 100; counter++) {
            if (counter % 2 == 0){
                continue;
            }
            System.out.println("Perulangan Ganjil-" + counter);
        }
    }
}
