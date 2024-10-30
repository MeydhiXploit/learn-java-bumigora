/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author MEYDHIARINUGROHO
 */
public class bangunRuang {

    public static void main(String[] args) {
        int s = 12;

        // jadi variabel luas buat nampung fungsi luas persegi yang di dalamnya mempunyai data
        int luas = luasKubus(s);
        // dan nilainya berasal dari variabel s bersisi 12
        System.out.println(luas);
    }

    //membuat fungsi luas persegi
    static int luasPersegi(int sisi) {
        // variabel sisi ini akan menampungnya nilai s
        return sisi * sisi;
        // 12 di kali 12 
        //144 
    }

    //membuat fungsi luasKubus  
    static int luasKubus(int sisi) {

        //memanggil fungsi luas persegi
        return 6 * luasPersegi(sisi);
//        6 * 144
    }
}
