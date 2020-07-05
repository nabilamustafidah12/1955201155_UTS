     

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan;

/**
 *
 * @author ASUS
 */
public class WHILE {
    public static void main(String[] args) {
        
     int n = 1;
     
   String Lampu =("");
        System.out.println("Mulai");
        System.out.println("Cari lampu yang akan dinyalakan");
        System.out.println("Nyalakan lampu");
       
        String lampu;
        lampu = "nyala";
        System.out.println("apakah lampu sudah menyala");
         if("menyala".equals(lampu)){
        System.out.println("sudah menyala");
        }
         else {
        System.out.println("belum menyala");
         }
        int i = 1;
        while (i<3){
        System.out.println("nyalakan lampu lagi - " + i);
        i++;
        
        System.out.println("Selesai");
        
       }
}
    


}
