/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

import java.util.Scanner;

/**
 *
 * @author MEYDHIARINUGROHO
 */
public class volumeBalok {
    public static void main(String[] args) {
        int p,l,t;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai Panjang");
        p = input.nextInt();
        System.out.println("Masukkan nilai Lebar");
        l = input.nextInt();
        System.out.println("Masukkan nilai Tinggi");
        t = input.nextInt();
        int v = p * l * t;
        System.out.println("Hasilnya adalah:" + v);
       
    }
}
