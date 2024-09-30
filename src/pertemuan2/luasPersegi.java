/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

import java.util.Scanner;

/**
 *
 * @author MEYDHIARINUGROHO
 */
public class luasPersegi {
    public static void main(String[] args) {
        int sisi;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai sisi persegi:");
        sisi = input.nextInt();
        int luasPersegi = sisi * sisi;
        System.out.println("Luas Persegi adalah: " + luasPersegi);
    }
}
