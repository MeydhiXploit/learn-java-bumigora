/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8;

/**
 *
 * @author MEYDHIARINUGROHO
 */
public class KesalahanAwal {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            // 1. 1.2.3.4.5
            System.out.print(i++ + ".");
            for (int k = 1; k <= 5; k++) {
                System.out.print(k + " ");
            }
            
            System.out.println();
            //bakalan kebawah
            
            //2 5.4.3.2.1
            System.out.print(i++ + ".");
            
            for (int j = 5; j >= 1; j--) {
                System.out.print(j + " ");
            }
            //
            
            
            //ke bawah
            System.out.println();

            //3 1.3,5,7,8,9
            System.out.print(i++ + ".");
            for (int t = 1; t < 10; t += 2) {
                System.out.print(t + " ");
            }
            //
            
            //kebawah
            System.out.println();

            //4. 2.4.6.8.10
            System.out.print(i++ + ".");
            for (int s = 2; s <= 10; s += 2) {
                System.out.print(s + " ");
            }
            //
            
            //kebawah
            System.out.println();

        }

    }
}
