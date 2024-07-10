/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oprec;
import java.util.Scanner;
/**
 *
 * @author faza
 */
public class Oprec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        boolean run = true;
        
        while(run){
            System.out.println("===Sewa Kamar===");
            System.out.println("Pilih Kamar yang anda inginkan!");
            System.out.println("1. Reguler (Kapasitas 1 orang)");
            System.out.println("Harga = Rp. 100.000");
            System.out.println("2. Double Reguler (Kapasitas 2 orang)");
            System.out.println("Harga = Rp. 200.000");
            System.out.println("3. Premium (Kapasitas 2 orang)");
            System.out.println("Harga = Rp. 250.000");
            System.out.println("4. Deluxe (Kapasitas 2 orang)");
            System.out.println("Harga = Rp. 350.000");
            System.out.println("5. Super Premium (Kapasitas 2 orang)");
            System.out.println("Harga = Rp. 500.000");
            System.out.print("Masukkan Pilihan anda = ");
            int pilihan = inp.nextInt();
            inp.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Nama Anda = ");
                    String namaPenyewa = inp.nextLine();
                    System.out.println("Masukkan umur anda = ");
                    int umur = inp.nextInt();
                    System.out.println("Sewa Kamar Berapa Hari = ");
                    int lamaMenginap = inp.nextInt();
                    inp.nextLine();
                    if(umur < 19){
                        System.out.println("Anda Belum cukup umur");
                        run = false;
                        continue;
                    }
                    
                    int totalHarga = lamaMenginap*100000;
                    int diskon = 0;
                    if(totalHarga>=700000){
                        diskon = 5;
                    }
                    if(totalHarga>=500000){
                        diskon = 3;
                    }
                    
                    int totalHargaDiskon = totalHarga-(totalHarga * diskon /100);
                    Reguler rgl = new Reguler(namaPenyewa,100000,"Reguler");
                    rgl.tampilkanInfo(lamaMenginap,totalHarga,diskon,totalHargaDiskon);
                    break;
                case 2:
                    System.out.println("Masukkan Nama Anda = ");
                    String namaPenyewa1 = inp.nextLine();
                    System.out.println("Masukkan umur anda = ");
                    int umur1 = inp.nextInt();
                    System.out.println("Sewa Kamar Berapa Hari = ");
                    int lamaMenginap1 = inp.nextInt();
                    inp.nextLine();
                    if(umur1 < 19){
                        System.out.println("Anda Belum cukup umur");
                        run = false;
                        continue;
                    }
                    
                    int totalHarga1 = lamaMenginap1*200000;
                    int diskon1 = 0;
                    if(totalHarga1>=700000){
                        diskon1 = 5;
                    }
                    if(totalHarga1>=500000){
                        diskon1 = 3;
                    }
                    
                    int totalHargaDiskon1 = totalHarga1-(totalHarga1 * diskon1 /100);
                    DoubleReguler dbl = new DoubleReguler(namaPenyewa1,200000,"Double Reguler");
                    dbl.tampilkanInfo(lamaMenginap1,totalHarga1,diskon1,totalHargaDiskon1);
                    break;
                case 3:
                    System.out.println("Masukkan Nama Anda = ");
                    String namaPenyewa2 = inp.nextLine();
                    System.out.println("Masukkan umur anda = ");
                    int umur2 = inp.nextInt();
                    System.out.println("Sewa Kamar Berapa Hari = ");
                    int lamaMenginap2 = inp.nextInt();
                    inp.nextLine();
                    if(umur2 < 19){
                        System.out.println("Anda Belum cukup umur");
                        run = false;
                        continue;
                    }
                    
                    int totalHarga2 = lamaMenginap2*250000;
                    int diskon2 = 0;
                    if(totalHarga2>=700000){
                        diskon2 = 5;
                    }
                    if(totalHarga2>=500000){
                        diskon2 = 3;
                    }
                    
                    int totalHargaDiskon2 = totalHarga2-(totalHarga2 * diskon2 /100);
                    Premium pmr = new Premium(namaPenyewa2,250000,"Premium");
                    pmr.tampilkanInfo(lamaMenginap2,totalHarga2,diskon2,totalHargaDiskon2);
                    break;
                case 4:
                    System.out.println("Masukkan Nama Anda = ");
                    String namaPenyewa3 = inp.nextLine();
                    System.out.println("Masukkan umur anda = ");
                    int umur3 = inp.nextInt();
                    System.out.println("Sewa Kamar Berapa Hari = ");
                    int lamaMenginap3 = inp.nextInt();
                    inp.nextLine();
                    if(umur3 < 19){
                        System.out.println("Anda Belum cukup umur");
                        run = false;
                        continue;
                    }
                    
                    int totalHarga3 = lamaMenginap3*350000;
                    int diskon3 = 0;
                    if(totalHarga3>=700000){
                        diskon3 = 5;
                    }
                    if(totalHarga3>=500000){
                        diskon1 = 3;
                    }
                    
                    int totalHargaDiskon3 = totalHarga3-(totalHarga3 * diskon3 /100);
                    Deluxe dxl = new Deluxe(namaPenyewa3,350000,"Deluxe");
                    dxl.tampilkanInfo(lamaMenginap3,totalHarga3,diskon3,totalHargaDiskon3);
                    break;
                case 5:
                    System.out.println("Masukkan Nama Anda = ");
                    String namaPenyewa4 = inp.nextLine();
                    System.out.println("Masukkan umur anda = ");
                    int umur4 = inp.nextInt();
                    System.out.println("Sewa Kamar Berapa Hari = ");
                    int lamaMenginap4 = inp.nextInt();
                    inp.nextLine();
                    if(umur4 < 19){
                        System.out.println("Anda Belum cukup umur");
                        run = false;
                        continue;
                    }
                    
                    int totalHarga4 = lamaMenginap4*500000;
                    int diskon4 = 0;
                    if(totalHarga4>=700000){
                        diskon4 = 5;
                    }
                    if(totalHarga4>=500000){
                        diskon4 = 3;
                    }
                    
                    int totalHargaDiskon4 = totalHarga4-(totalHarga4 * diskon4 /100);
                    SuperPremium spr = new SuperPremium(namaPenyewa4,500000,"Super Premimum");
                    spr.tampilkanInfo(lamaMenginap4,totalHarga4,diskon4,totalHargaDiskon4);
                    break;
                default:
                    System.out.println("Input tidak valid");
                    continue;
            }
            System.out.println("Apakah anda ingin memesan lagi?(y/n)");
            String lagi = inp.nextLine();
            if(lagi.equalsIgnoreCase("n")){
                run = false;
            }
        }
        
    }
    
}
