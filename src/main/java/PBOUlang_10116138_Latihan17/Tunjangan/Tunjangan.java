/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOUlang_10116138_Latihan17.Tunjangan;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Tunjangan
 * No Running
 */

import java.util.Scanner;
public class Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Double Tunjangan,TotalGaji,GajiPokok;
        
        
        Scanner baca = new Scanner (System.in);
        
        System.out.println(" ============Program Tunjangan===============");
 
        System.out.print("Berapa Gaji Pokok Anda Perbulan?: Rp.");
        GajiPokok = baca.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        String Status = baca.next();
        
        
        if("Menikah".equals(Status)){
            Tunjangan = 0.35 * GajiPokok;
            TotalGaji = GajiPokok + Tunjangan;
        }
        else
        {    
            Tunjangan = 0 * GajiPokok ;
            TotalGaji = GajiPokok + Tunjangan;    
    }
        System.out.println("");
        System.out.println(" ========Hasil Perhitungan Gaji Anda=========");
        System.out.println("Gaji Pokok\t: \t Rp." + GajiPokok);
        System.out.println("Tunjangan\t: \t Rp." + Tunjangan);
        System.out.println("Total  Gaji\t: \t Rp." + TotalGaji);
        
        
    }
    
}      