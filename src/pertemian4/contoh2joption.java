/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemian4;

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
        
public class contoh2joption {
    public static void main(String[] args) {
         String Minuman = JOptionPane.showInputDialog("Pesan Minum Apa");
         String rasa = JOptionPane.showInputDialog("Rasa Apa");
         String tempat = JOptionPane.showInputDialog("Berapa Nomer Tempat Duduk ");
        String jumlah = null;
         
         
         
         int Jumlah = Integer.parseInt(jumlah);
         int harga  = 50000;
         double total = Jumlah*harga;
         
         System.out.println("Pesan Minum Apa :" + Minuman );
         System.out.println("Rasa  :" +rasa);
        // System.out.println("Jenis Barang  :"+ jenis);
         System.out.println("Duduk dimana  :"+ tempat);
         System.out.println("Total yang Harus Dibayar :"+total);
         
         
         
                
                
        
    }
}
