/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author MEYDHIARINUGROHO
 */
public class switchcase {
    public static void main(String[] args) {
     String golonganDarah = "A";
        switch (golonganDarah) {
            case "A":
                System.out.println("golongan darah anda A");
                break;
             case "B":
                System.out.println("golongan darah anda B");
                break;   
             case "C":
                System.out.println("golongan darah anda C");
                break;
            case "O":
                System.out.println("golongan darah anda O");
                break;
            case "AB":
                System.out.println("golongan darah anda AB");
                break;
            default:
                System.out.println("golongan darah anda tidak di temukan");
                break;
        }
    }
}
