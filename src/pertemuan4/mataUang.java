/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author MEYDHIARINUGROHO
 */
public class mataUang {
    public static void main(String[] args) {
        String mata_uang = "Dollar";
        if (mata_uang.equalsIgnoreCase("rupiah")) {
            System.out.println("Mata uang indonesia");
        }else if(mata_uang.equalsIgnoreCase("dollar")){
            System.out.println("Mata uang amerika");
        }else if(mata_uang.equalsIgnoreCase("ringgit")){
            System.out.println("Mata uang malaysia");
        }else if(mata_uang.equalsIgnoreCase("euro")){
            System.out.println("Mata uang eropa");
        }
    }
}
