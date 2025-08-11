/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kemasfaris
 */
public class MethodOverLoading {
    public static void main(String[] args){
        
        sayHello();
        sayHello("Eko kurniawan");
        sayHello("Mulyono");
        
        
    }
    
    static void sayHello(){
        System.out.println("Hello");
    }
    
    static void sayHello(String name){
        System.out.println("Hello " + name);
    }
    
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
