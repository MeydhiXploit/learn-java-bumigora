/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

import java.util.Scanner;

/**
 *
 * @author MEYDHIARINUGROHO
 */
public class LoopingForeach {
    public static void main(String[] args) {
        int nilaiAkhir = 0;
        int nilaiAwal = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai awal");
        nilaiAwal = input.nextInt();
        System.out.println("Masukkan nilai akhir");
        nilaiAkhir = input.nextInt();
        for (int i = nilaiAwal; i <= nilaiAkhir; i++) {
            System.out.println(i);
        }
    }
}
