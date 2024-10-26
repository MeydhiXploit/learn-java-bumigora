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
public class Penugasan2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai A :");
        int a = input.nextInt();
        System.out.println("Nilai B :");
        int b = input.nextInt();
        
        int pertambahan = b;
        int pengurangan = b;
        int perkalian = b;
        double pembagian = b;
        double sisaBagi = b;
        
        System.out.println("----OUTPUT-----");
        
        pertambahan += a;
        pengurangan -= a;
        perkalian *= a;
        pembagian /= a;
        sisaBagi %= a;
        
        System.out.println("Hasil dari " + "+" + "itu adalah : " + pertambahan);
        System.out.println("Hasil dari " + "-" + "itu adalah : " + pengurangan);
        System.out.println("Hasil dari " + "x" + "itu adalah : " + perkalian);
        System.out.println("Hasil dari " + "/" + "itu adalah : " + pembagian);
        System.out.println("Hasil dari " + "%" + "itu adalah : " + sisaBagi);
    }
}
