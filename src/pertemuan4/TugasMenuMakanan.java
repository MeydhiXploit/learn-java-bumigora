/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author MEYDHIARINUGROHO
 */
public class TugasMenuMakanan {
    public static void main(String[] args) {
        String makanan = "burger";
        
        switch(makanan) {
            case "burger":
                System.out.println("Anda memilih menu makanan burger");
                break;
                
            case "pecel":
                System.out.println("Anda memilih pecel");
                break;
                
            case "nasi goreng":
                System.out.println("Anda memilih nasi goreng");
                break;
                
            case "tahu tek":
                System.out.println("Anda memilih tahu tek");
                break;
            
                
            default:
                throw new AssertionError();
        }
    }
}
