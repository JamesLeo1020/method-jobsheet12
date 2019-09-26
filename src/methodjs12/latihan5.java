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
public class latihan5 {

    public static void mengurutkan(int e, int f, int g) {
        if (e < f && e > g) {
            System.out.println("Bilangan Terbesar: " + e);
        } else if (f > e && f > g) {
            System.out.println("Bilangan terbesar: " + f);
        } else if (g > e && g > f) {
            System.out.println("Bilangan terbesar: " + g);
        }
    }

    public static void main(String[] args) {
        Scanner cimeng = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        int e = cimeng.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int f = cimeng.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int g = cimeng.nextInt();
        mengurutkan(e, f, g);

    }
}
