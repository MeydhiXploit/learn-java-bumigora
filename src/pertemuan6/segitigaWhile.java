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
public class segitigaWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai panjang segitiganya : ");
        int panjang = input.nextInt();
        int i = 0;
        while(i <= panjang) {       
            int j = 0;
            while (j <= i) {                
               System.out.print(" * ");
               j++;
            }
            System.out.println();
            i++;
        }
    }
}
