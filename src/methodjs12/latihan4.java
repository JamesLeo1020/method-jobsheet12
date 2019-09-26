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
public class latihan4 {
    
    public static double kecepatan(double a, double b){
        double c = a / b;
        return c;
    }
    public static void main(String[] args) {
        Scanner cimeng = new Scanner(System.in);
        
        double a;
        System.out.println("Masukkan Jarak: ");
        double input1 = cimeng.nextInt();
        System.out.println("Masukkan Waktu: ");
        double input2 = cimeng.nextInt();
        a = kecepatan(input1, input2);
        System.out.println("Kecepatan: " + a + "km/jam");
    }
    
}
