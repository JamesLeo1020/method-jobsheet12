/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodjs12;

/**
 *
 * @author USER
 */
public class MethodJS12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to SMK Telkom Malang");
        int x = 10;
        int y = 20;
        int v = 30;
        int z = jumlah(x, y);
        double a = jumlah(x,y,v);
        System.out.println("hasil " + z);
        System.out.println("hasil 2 "+ a);
    }

    private static int jumlah(int a, int b) {
        int hasil = a + b;
        return hasil;
    }

    private static double jumlah(int a, int b, int c) {
        double hasil = a + b + c;
        return hasil;
    }

}
