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
public class luasSegitiga {
    public static void main(String[] args) {
        int A,T;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai Alas");
        A = input.nextInt();
        System.out.println("Masukkan nilai Tinggi");
        T = input.nextInt();
        int L = (A * T) / 2;
        System.out.println("Hasilnya adalah:" + L);
    }
}
