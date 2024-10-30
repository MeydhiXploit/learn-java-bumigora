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
public class biodata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama : ");
        String nama = input.next();
        
        System.out.print("Masukkan alamat : ");
        String alamat = input.next();
        
        System.out.println("------ OUTPUT-------");
        String biodata = "Nama : " + Name(nama) + "\n" + "Alamat : " + Alamat(alamat) + "\n";
        System.out.print(biodata);
    }
    
    static String Name(String name){
       return name;   
    }
    static String Alamat(String alamat){
        return alamat;
    }
}