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
public class segitigasWhile3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang : ");
        int panjang = input.nextInt();
        int i = 0;
        while (i <= 5) {
            int j = 0;
            while (j <= i) {
                int k = 0;
                while (k <= j) {
                    System.out.print(" * ");
                    k++;
                }
                System.out.println();
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
