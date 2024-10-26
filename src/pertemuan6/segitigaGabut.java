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
public class segitigaGabut {
    public static void main(String[] args) {
        // jadi fungsinya adalah untuk memasukkan nilai yang akan mau di inputkan
        Scanner masuk = new Scanner(System.in);
        System.out.println("Masukkan nilai : ");
        
        // panjang sama dengan masuk next int
        int panjang = masuk.nextInt();
        
        
        for (int i = 1; i <= panjang; i++) { // berapa banyak bintang yang akan di buat baris
            for (int j = 1; j <= i; j++) {
              System.out.print(" * "); //jadi ini bintang di setiap baris itu
            }           
            System.out.println();
        }
    }
}
    