/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1955201155;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        String alamat;
        int umur;
        int tinggi;
        int berat;
        Double ipk;
        Scanner input = new Scanner (System.in);
        //
        System.out.println("=====");
        System.out.println("Nama : ");
        nama = input.next();
        System.out.println("Alamat : ");
        alamat = input.next();
        System.out.println("Umur : ");
        umur = input.nextInt ();
        System.out.println("Tinggi : ");
        tinggi = input.nextInt();
        System.out.println("Berat : ");
        berat = input.nextInt ();
        System.out.println("Ipk : ");
        ipk = input.nextDouble();
        
        //
        System.out.println("Nama Anda "+ nama);
        System.out.println("Alamat Anda"+ alamat);
        System.out.println("Umur Anda"+ umur );
        System.out.println("Tinggi Anda"+ tinggi);
        System.out.println("Berat Anda"+ berat);
        System.out.println("Ipk Anda"+ ipk);
       
        
 
    }
    
}
