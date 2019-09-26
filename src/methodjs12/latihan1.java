/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodjs12;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class latihan1 {
    static void ucapin(String ucapan){
        System.out.println(ucapan); 
    }

    public static void hitung(int a, int b) {
        System.out.println("Hasil " + (a + b));
    }

    public static void main(String[] args) {
        System.out.println("SMK Telkom Malang");
        ucapin("Selamat Datang di WELCOME :D selamat berhitung");
        ucapin("JAGUNG MANIS");
        ucapin("Halo dunia");
        ucapin("Selamat Mencoba");
        Scanner cimeng = new Scanner(System.in);

        System.out.println("Masukkan Bilangan I : ");
        int bil1 = cimeng.nextInt();

        System.out.println("Masukkan bilangan II : ");
        int bil2 = cimeng.nextInt();

        hitung(bil1, bil2);
        
        ucapin("TERIMA KASIH, JANGAN KEMBALI LAGI :|");
        ucapin("AKU TUH GK BISA DIGINIIN TERUS");

    }

}
