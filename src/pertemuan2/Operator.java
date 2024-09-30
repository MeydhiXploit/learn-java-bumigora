/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

import java.util.Scanner;


public class Operator {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("-------OUTPUT--------");
        System.out.println("input number a :");
        a = input.nextInt();
        System.out.println("input number a :");
        b = input.nextInt();
        int penjumlahan = a + b;
        System.out.println("hasil dari pertambahan adalah :" + penjumlahan);
        int pengurangan = a - b;
        System.out.println("hasil dari pengurangan adalah :" + pengurangan);
        int perkalian = a * b;
        System.out.println("hasil dari perkalian adalah :" + perkalian);
        int pembagian = a / b;
        System.out.println("hasil dari pembagian adalah :" + pembagian);
        int sisa_bagi = a % b;
        System.out.println("hasil dari sisa bagi adalah :" + sisa_bagi);
//            tugass luas segitiga
//                    volume balok
//                            luas persegi
    }
}
