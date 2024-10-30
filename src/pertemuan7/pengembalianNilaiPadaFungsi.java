/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

import java.util.Scanner;

/**
 *
 * @author MEYDHIARINUGROHO
 */
public class pengembalianNilaiPadaFungsi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama = input.next();
        System.out.print("Masukkan umur : ");
        int age = input.nextInt();
        identitas(nama, age);
    }

    static void identitas(String nama, int age) {
        System.out.println("Nama : " + nama + "\nUmur : " + age);
    }
}
