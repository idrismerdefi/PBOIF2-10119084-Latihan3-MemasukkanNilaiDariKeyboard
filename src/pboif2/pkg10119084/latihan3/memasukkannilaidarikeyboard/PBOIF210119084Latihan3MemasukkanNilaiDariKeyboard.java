/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan3.memasukkannilaidarikeyboard;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program untuk menampilkan memasukkan nilai dari keyboard
 */
public class PBOIF210119084Latihan3MemasukkanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.print("Masukkan nama anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println(" Nama anda adalah "+nama);
    }
    
}
