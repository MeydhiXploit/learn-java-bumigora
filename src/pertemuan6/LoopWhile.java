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
public class LoopWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai Awal");
        int nilaiAwal = input.nextInt();
        System.out.println("Masukkan Nilai Akhir");
        int nilaiAkhir = input.nextInt();
        int i = nilaiAwal;
        while (i <= nilaiAkhir) {            
            System.out.println(i);
            // ini akan menghasilkan nilai dari input terkecil sampe nilai awalnya
            i++;
        }
        
    }
}
