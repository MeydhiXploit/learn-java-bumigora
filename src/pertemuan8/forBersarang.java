/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8;

import java.util.Scanner;

/**
 *
 * @author MEYDHIARINUGROHO
 */
public class forBersarang {

    public static void main(String[] args) {

       for (int i = 1; i < 4; i++) {
            System.out.println("Nilai i: " + i);
            
            // Pertama, cetak i + S dengan S mulai dari 1 hingga 5
            for (int S = 1; S <= 5; S++) {
                System.out.print(i + S + " ");
            }
            System.out.println(); // Untuk pindah baris

            // Perbaikan: perulangan j seharusnya dari 5 ke 1, jadi kondisi harus j > 0
            for (int j = 5; j > 1; j--) {
                System.out.print(i + j + " ");
            }
            System.out.println(); // Pindah baris setelah perulangan j

            // Perulangan t dari 5 ke 2
            for (int t = 5; t > 1; t--) {
                System.out.print(i + t + " ");
            }
            System.out.println(); // Pindah baris setelah perulangan t

            // Perulangan k dengan increment 1 sampai kurang dari 10
            for (int k = 1; k < 10; k++) {
                System.out.print(i + k + " ");
            }
            System.out.println(); // Pindah baris setelah perulangan k

            // Perulangan b dengan increment 2 sampai kurang dari 10
            for (int b = 2; b < 10; b += 2) {
                System.out.print(i + b + " ");
            }
            System.out.println(); // Pindah baris setelah perulangan b

            System.out.println(); // Tambahkan baris kosong untuk memisahkan setiap nilai i
        }
    }

    }

