/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kemasfaris
 */
public class TipeDataBukanPrimitif {
    public static void main(String []args) {
        Integer iniInteger = 100;
        Long iniLong = 10000L;
        
        Byte iniByte;
        iniByte = 100;
        
        System.out.println(iniByte);
        
        int iniInt = 100;
        
        Integer iniObject = iniInt;
        
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFLoat = iniObject.byteValue();
    }
}
