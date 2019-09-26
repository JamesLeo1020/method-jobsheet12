/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorsederhana;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Kalkulatorsederhana {

    public static int penjumlahan(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int pengurangan(int a, int b) {
        int c = a - b;
        return c;
    }

    public static int perkalian(int a, int b) {
        int c = a * b;
        return c;
    }

    public static double pembagian(double a, double b) {
        double c = a / b;
        return c;
    }

    public static double sisahasilbagi(double a, double b) {
        double c = a % b;
        return c;

    }

    public static void main(String[] args) {
        Scanner cimeng = new Scanner(System.in);

        int a;
        System.out.println("Masukkan angka: ");
        int bil1 = cimeng.nextInt();
        int bil2 = cimeng.nextInt();
        a = penjumlahan(bil1, bil2);
        System.out.println("Hasil penjumlahan: " + a);

        int b;
        System.out.println("========================");
        System.out.println("Masukkan angka: ");
        int masukan1 = cimeng.nextInt();
        int masukan2 = cimeng.nextInt();
        b = pengurangan(masukan1, masukan2);
        System.out.println("Hasil pengurangan : " + b);

        int c;
        System.out.println("========================");
        System.out.println("Masukkan angka: ");
        int angka1 = cimeng.nextInt();
        int angka2 = cimeng.nextInt();
        c = perkalian(angka1, angka2);
        System.out.println("Hasil perkalian: " + c);

        double d;
        System.out.println("========================");
        System.out.println("Masukkan angka: ");
        double input1 = cimeng.nextInt();
        double input2 = cimeng.nextInt();
        d = pembagian(input1, input2);
        System.out.println("Hasil pembagian: " + d);

        double e;
        System.out.println("========================");
        System.out.println("Masukkan angka: ");
        double user1 = cimeng.nextInt();
        double user2 = cimeng.nextInt();
        e = sisahasilbagi(user1, user2);
        if (user1 < user2) {
            System.out.println("\n Hasil Tidak Ditemukan");
        } else {
            if (user1 > user2);
            System.out.println("Hasil sisa pembagian: " + e);

        }
    }

}
