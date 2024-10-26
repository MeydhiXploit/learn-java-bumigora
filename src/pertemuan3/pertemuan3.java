/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

import java.util.Scanner;

/**
 *
 * @author MEYDHIARINUGROHO
 */
public class pertemuan3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai A :");
        int a = input.nextInt();
        System.out.println("Nilai B :");
        int b = input.nextInt();
        System.out.println("----OUTPUT-----");
        int TAMBAH = a+b;
        int KURANG = a-b;
        double BAGI = a/b;
        int KALI = a*b;
        double sisaBagi = a % b;
        System.out.println("Hasil dari pertambahan itu adalah : " + TAMBAH);
        System.out.println("Hasil dari kurang itu adalah : " + KURANG);
        System.out.println("Hasil dari bagi itu adalah : " + BAGI);
        System.out.println("Hasil dari PERKALIAN itu adalah : " + KALI);
        System.out.println("Hasil dari SISA BAGI itu adalah : " + sisaBagi);
    }
}
