/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kemasfaris
 */
public class MethodParameter {
    public static void main(String[] args){
        sayHello("Eko","Kurniawan");
        sayHello("Mulyono","");
    }
    
   static void sayHello(String firstName, String lastName){
       System.out.println("Hello " + firstName + " " + lastName);
   }
}
