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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;


public class bufferet {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        
        String nama ;
        String alamat ;
        int umur ;
        int tinggi ;
        Double ipk ;
        
        System.out.println("=====");
        
        System.out.println("Siapa Nama Anda :");
        nama = br.readLine();
        System.out.println("Alamat Anda     :");
        alamat = br.readLine();
        System.out.println("Umur Anda       :");
        umur = Integer.parseInt(br.readLine());
        System.out.println("Tinggi Anda     :");
        tinggi = Integer.parseInt(br.readLine());
        System.out.println("Ipk Anda        :");
        ipk = Double.parseDouble(br.readLine());
        
        
        
        System.out.println("Nama Anda   "+ nama);
        System.out.println("Alamat Anda "+alamat);
        System.out.println("Umur Anda"   + umur);
        System.out.println("Tinggi Anda "+ tinggi);
        System.out.println("Ipk Anda    "+ ipk);
        
        
        
        
        
    }
    
}
