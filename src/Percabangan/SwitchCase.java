package Percabangan;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class SwitchCase {
    public static void main(String[] args) {
        
        String tanggal,hari = "";
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nama - nama hari");
        tanggal = scan.nextLine();
        
        switch (tanggal) {
            case "1" :
            hari = "SENIN";
            break;
            
            case "2" :
            hari = "SELASA";
            break;
           
            case "3" :
            hari = "RABU";
            break;
            
            case "4" :
            hari = "KAMIS";
            break;
            
            case "5" :
            hari = "JUM'AT";
            break;
            
            case "6" :
            hari = "SABTU";
            break;
            
            case "7" :
            hari = "MINGGU";
            break;
           default: System.out.println("Input salah,coba lagi");
        }
        System.out.println("Nama hari : " + hari);
    }
}
