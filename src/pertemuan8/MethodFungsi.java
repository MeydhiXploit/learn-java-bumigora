/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8;

import java.util.Scanner;
import pertemuan2.volumeBalok;

/**
 *
 * @author MEYDHIARINUGROHO
 */
public class MethodFungsi {
    public static void main(String[] args) {
        MethodFungsi tes = new MethodFungsi();
        System.out.println(tes.luasSegitiga(2,4));
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang: ");
        int panjang = input.nextInt();
        System.out.println("Masukkan lebar : ");
        int lebar = input.nextInt();
        System.out.println("Masukkan tinggi ");
        int tinggi = input.nextInt();
        System.out.println(tes.volumeBalok(lebar, lebar, tinggi));     
    }
    
    public double luasSegitiga(int alas,int tinggi){ //fungsi
        double luas = 0.5*alas*tinggi;
        return luas;
    }
    
    public int volumeBalok(int p,int l,int t){
        int volume = p * l * t;
        return volume;
    }
    
    public void bangunRuang() {
        int alas = 3;
        int tinggi = 3;
        
        double luasSegitiga = 0.5 * alas * tinggi;
        System.out.println(luasSegitiga);
        System.out.println("--------------");
        int p = 2;
        int l = 4;
        int t = 5;
        
        int volumeBalok = p * l * t;
        
    }
   
}
