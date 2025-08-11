/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kemasfaris
 */
public class ForEach {
    public static void main(String[] args){
        String[] names = {
            "Eko", "Kurniawan", "Khannedy",
            "Programmer", "Zaman", "Now"
        };
        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
            
            System.out.println("ForEach");
          
        for(var name: names){
            System.out.println(name);
        }
        }
    }
}
