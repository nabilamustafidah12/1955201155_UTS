/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1955201155;

/**
 *
 * @author ASUS
 */import javax.swing.JOptionPane;
public class joption {
    
    public static void main(String[] args) {
        
        String nama = JOptionPane.showInputDialog("Nama Anda Siapa ");
        String alamat = JOptionPane.showInputDialog ("Alamat Anda ");
        String merk = JOptionPane.showInputDialog("Merk Barang Yang Dibeli");
        String barang = JOptionPane.showInputDialog("Barang Yang Anda Beli");
        String ukuran = JOptionPane.showInputDialog("Ukuran Yang Dibeli");
        String jumlah = JOptionPane.showInputDialog("Jumlah Barang Yang Dibeli");
        
        
        int Jumlah = Integer.parseInt(jumlah);
        int harga = 200000;
        double total = Jumlah*harga;
        
        System.out.println("Nama Anda Siapa :" + nama);
        System.out.println("Alamat Yang Dikirim :" + alamat);
        System.out.println("Merk Barang Yang Dibeli :" + merk);
        System.out.println("Barang Yang Dibeli :" + barang);
        System.out.println("Ukuran Barang Yang Dibeli :" + ukuran);
        System.out.println("Jumlah Yang Harus Dibayar :" + total);
        
        
    }
    
}
