/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kemasfaris
 */
public class TipeDataArray {
    public static void main(String[] args) {
        String[] StringArray;
        StringArray = new String[3];
        
        StringArray[0] = "eko";
        StringArray[1] = "kurniawan";
        StringArray[2] = "khannedy";
        
        System.out.println(StringArray[0]);
        System.out.println(StringArray[1]);
        System.out.println(StringArray[2]);
        
        StringArray[0] = "budi";
        System.out.println(StringArray[0]);
        
        String[] StringArray2 = new String[3]; 
        
        String[] namaNama = {
            "Eko", "Kurniawan", "Khannedy"
        };
        
        int[] ArrayInt = new int[] {
            1,2,3,4,5,6,7,8,9,10
        };
        
        long[] ArrayLong = {
            10L, 20L, 30L
        };          
        
        ArrayLong[0] = 100;
        
        System.out.println(ArrayLong[0]);
        System.out.println(ArrayLong[1]);
        System.out.println(ArrayLong.length);
        
        
        String[][] Members = {
            {"eko", "kurniawan"},
            {"Budi", "Nugraha"},
            {"joko"}
        };
        System.out.println(Members[0][1]);
        System.out.println(Members[1][0]);
        
    }
}
