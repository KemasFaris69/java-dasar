/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author kemasfaris
 */
public class Break {
    public static void main(String[] args){
        var counter = 1;
        
        while(true){
            System.out.println("perulangan " + counter);
            counter++;
            
            if(counter > 10){
                break;
            }
        }
        System.out.println("Perulangan berhenti");
            
    }
}
