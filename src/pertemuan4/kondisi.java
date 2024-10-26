/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author MEYDHIARINUGROHO
 */
public class kondisi {
    public static void main(String[] args) {
        String mata_uang = "IndoneSia";
        // kalau string di sarankan memakaia equals
        // equals signore case jika value itu memakai camel case
        if(mata_uang.equalsIgnoreCase("indonesia")){
            System.out.println("Benar mata uang indonesia adalah rupiah");
        }else{
            System.out.println("Salah mata uang indonesia adalah rupiah");
        }
    }
}
