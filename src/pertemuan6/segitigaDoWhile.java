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
public class segitigaDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai awal :");
        int panjang = input.nextInt();
        int i = 0;
        do {            
            System.out.println();
            i++;
            int k = 0;
            do {                
                System.out.print(" * ");
                k++;
            } while (k <= i);
        } while (i <= panjang);
    }
}
