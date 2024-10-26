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
public class LoopWhileMulaiNol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal = 0 ;
        int akhir = 0;
        System.out.println("Masukkan");
        awal = input.nextInt();
        System.out.println("Masukkan nilai akhir");
        akhir = input.nextInt();
        int i = awal;
        while (i <= akhir) {            
            System.out.print(i);
            i++;
        }
        
    }
 
}
