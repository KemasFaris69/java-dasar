/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kemasfaris
 */
public class Scope {
    public static void main(String[] args){
        sayHello("Eko");
    }
    
    static void sayHello(String name) {
        String Hello = "Hello " + name;
        if (!name.isBlank()) {
            String hi = "HI " + name;
            System.out.println(hi);
        }
        
        System.out.println(Hello);
//        System.out.println(hi); // error karena diluar scope if
    }
}
