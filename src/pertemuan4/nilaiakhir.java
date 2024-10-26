/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author MEYDHIARINUGROHO
 */
public class nilaiakhir {
    public static void main(String[] args) {
        int tugas = 20; // %20
        int uts = 40; // %40
        int uas = 50; // %50
        double nilaiAkhir = (tugas*0.2) + (uts*0.3) + (uas*0.5);
        System.out.println(nilaiAkhir);
        if(nilaiAkhir >= 81 && nilaiAkhir <= 100){
            System.out.println(nilaiAkhir + "dengan Grade A");
        }else if(nilaiAkhir >= 70 && nilaiAkhir <= 80){
            System.out.println(nilaiAkhir + "dengan Grade B");
        }else if(nilaiAkhir >= 60 && nilaiAkhir <= 69){
            System.out.println(nilaiAkhir + "dengan Grade C");
        }else if(nilaiAkhir >= 50 && nilaiAkhir <= 59){
            System.out.println(nilaiAkhir + "dengan Grade D");
        }else{
            System.out.println(nilaiAkhir + "dengan Grade E");
        }
        // tugas buat kondisi else if dangan kasus mata uang dunia
        //switch case menu makanan pakek scanner
    }
}
