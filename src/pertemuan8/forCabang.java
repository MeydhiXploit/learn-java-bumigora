/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8;


public class forCabang {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            
            System.out.print(i++ + ".");
            //1
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            
            System.out.println();
            
            System.out.print(i++ + ".");
            //2
            for (int k = 5; k >= 1; k--) {
                System.out.print(k + " ");
            }

            System.out.println();
            System.out.print(i++ + ".");
            for (int s = 1; s < 10; s+=2) {
                System.out.print(s + " ");
            }

            System.out.println();
            System.out.print(i++ + ".");
            for (int t = 2; t <= 10; t+=2) {
                System.out.print(t + " ");
            }
            System.out.println();
        }
    }
}
