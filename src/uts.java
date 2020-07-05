/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class uts {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
       
        System.out.println("===========================================");
            System.out.println("||          Danftar              ||");
            System.out.println("========================================");
            System.out.println("o TIKET MASUK      | o HARGA       ");
            System.out.println("1.DEWASA           | Rp. 100.000    ");
            System.out.println("2.ANAK-ANAK        | Rp. 50.000    ");
            System.out.println("3.BALITA           | Rp. 20.000    ");
            System.out.println("======================================");
            

        //Pembayaran & kembalian
        int bayar, kembalian;
        //Harga awal
        int harga  = 0;
        //Harga 
        int D1 = 100000, A2 = 50000,B3 = 20000;
        String Tiket= null;
        
        //Variable Menu
        int DNomor = 0, DJumlah = 0;
        
        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
        System.out.println("_____________________________________");
        //Input No Pesanan pada menu
        System.out.print("Pilih Tiket : ");
        DNomor = scan.nextInt();
        System.out.print("Masukkan Jumlah Tiket : ");
        DJumlah = scan.nextInt();
       
        
            switch (DNomor) {
                case 1:
                    Tiket = " Dewasa";
                    System.out.println("Pilihan anda nomor " +DNomor + " adalah" + Tiket);
                    harga = harga + D1 * DJumlah;
                    break;
                case 2:
                     
                    Tiket = " Anak - Anak ";
                    System.out.println("Pilihan anda nomor " +DNomor + " adalah" + Tiket);
                    harga = harga + A2 * DJumlah;
                    break;
                case 3:
                   
                    Tiket= " Balita";
                    System.out.println("Pilihan anda nomor " +DNomor + " adalah" + Tiket);
                    harga = harga + B3 * DJumlah;
                    break;
                
                    
                default:
                    System.out.println("Nomor pesanan yang dipilih tidak ada pada daftar menu di atas.");
                    break;
            }
            
            System.out.println("Total Yang harus di bayar = Rp."+harga);
            System.out.println("Masukkan Jumlah Uang : ");
            bayar = scan.nextInt();
            kembalian = bayar-harga;
           
            System.out.println("||             LOKET TIKET                ||");
            System.out.println("||                                         ||");
            System.out.println("||                                        ||");
         
            System.out.println("Anda Memesan :                        ");
            System.out.println(" " + Tiket +"   " + "X"+DJumlah +"   " + "Rp"+ harga);
            System.out.println("--------------------------------------");
            System.out.println("Total                " + "Rp" + harga);
            System.out.println("Jumlah Uang          " + "Rp" + bayar);
            System.out.println("Kembalian            " + "Rp" + kembalian);
            System.out.println("======================================");
            System.out.println("||            Terima Kasih          ||");
        
            
            System.out.print("Apakah anda ingin Memesan Lagi? [Y/T] : ");
            i = scan.next();
            
        }
        
    }
    
}
