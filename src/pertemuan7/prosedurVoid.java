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
public class prosedurVoid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang : ");
        int panjang = input.nextInt();
        prosedurVoid tes = new prosedurVoid();
        tes.segitiga(0);
        
    }
    
    void segitiga(int panjang){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
}
