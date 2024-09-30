/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author MEYDHIARINUGROHO
 */
public class Pertemuan2 {
    public static void main(String[] args) {
     
        String nama = "Meydhi Ari Nugroho";
            int umur = 20;
            String myHobby = "Turu";
            String gender = "Laki-laki";
            String tanggalLahir = "18-05-2006";
            String golonganDarah = "B";
            double beratBadan = 61.2;
            double tinggiBadan = 200;
            String country = "Indonesia";
            String agama = "Islam";
            String alamat = "Praya";
            String tempatLahir = "Sidoarjo";
            String asalSekolah = "SMKN 1 PRAYA TENGAH";
            String universitas = "ITS";
            String peliharaan = "iguana"    ;
            String namaPeliharaan = "combet";
        
            Scanner input = new Scanner(System.in);
        
        System.out.println("--------INPUT----------");
        System.out.println("masukkan nama :");
        nama = input.next();
        
        System.out.println("Masukkan umur :");
        umur = input.nextInt();
        
        System.out.println("Masukkan Hobby :");
        myHobby = input.next();
        
        System.out.println("Masukkan tanggal lahir :");
        tanggalLahir = input.next();
        
        System.out.println("Masukkan golongan darah :");
        golonganDarah = input.next();
        
        System.out.println("Masukkan berat badan :");
        beratBadan = input.nextDouble();
        
        System.out.println("Masukkan tinggi badan :");
        beratBadan = input.nextDouble();
        
        System.out.println("Masukkan country :");
        country = input.next();
        
        System.out.println("Masukkan agama :");
        agama = input.next();
        
        System.out.println("Masukkan alamat :");
        alamat = input.next();
        
        System.out.println("Masukkan tempat lahir :");
        tempatLahir = input.next();
        
        System.out.println("Masukkan asal sekolah :");
        asalSekolah = input.next();
        
        System.out.println("Masukkan asal universitas :");
        universitas = input.next();
        
        System.out.println("Masukkan asal peliharaan :");
        peliharaan = input.next();
        
        System.out.println("Masukkan asal nama peliharaan :");
        namaPeliharaan = input.next();
        
        
        
        System.out.println("----------OUTPUT--------");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Hobby : " + myHobby);
        System.out.println("jenis kelamin : " + gender);
        System.out.println("tanggal lahir : " + tanggalLahir);

        System.out.println("golongan darah : " + golonganDarah);
        System.out.println("berat badan : " + beratBadan);
        System.out.println("tinggi badan : " + tinggiBadan);
        System.out.println("negara : " + country);
        System.out.println("agama : " + agama);

        System.out.println("alamat : " + alamat);
        System.out.println("tempat lahir : " + tempatLahir);
        System.out.println("asal sekolah :" + asalSekolah);
        System.out.println("kampus di : " + universitas);
        System.out.println("peliharaan : " + peliharaan);
        System.out.println("nama peliharaan : " + namaPeliharaan);
    }
}   
