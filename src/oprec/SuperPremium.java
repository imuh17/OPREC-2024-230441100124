/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oprec;

/**
 *
 * @author faza
 */
public class SuperPremium {
    String namaPenyewa;
    int hargaKamar;
    String tipeKamar;
    
    SuperPremium(String namaPenyewa, int hargaKamar,String tipeKamar){
        this.namaPenyewa=namaPenyewa;
        this.hargaKamar = 500000;
        this.tipeKamar = "Super Premium";
    }
    
    void tampilkanInfo(int lamaMenginap, int totalHarga, int diskon,int totalHargaDiskon){
        System.out.println("Jenis Kamar = "+tipeKamar);
        System.out.println("Nama Tamu = "+namaPenyewa);
        System.out.println("Lama Menginap = "+ lamaMenginap +"Hari");
        System.out.println("Total harga sebelum diskon = "+ totalHarga);
        System.out.println("Diskon = "+diskon);
        System.out.println("Total harga setelah diskon = "+totalHargaDiskon);
    }
}
