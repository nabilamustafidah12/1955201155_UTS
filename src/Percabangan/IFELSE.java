/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percabangan;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class IFELSE {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int pin;
        String Atm;
        
    System.out.println("======================");
        System.out.println("     ATM BATI BOSS    ");
        System.out.println("======================");
        System.out.println("Masukkan Kartu ATM");
        System.out.println("Masukkan PIN ATM =");
        pin = input.nextInt();
if (pin < 6){
    System.out.println("Selamat , Anda Telah Masuk");
}
        System.out.println("Coba Masukkan Pin Lagi");
    
}
    }

