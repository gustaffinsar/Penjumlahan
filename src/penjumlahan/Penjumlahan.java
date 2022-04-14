/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjumlahan;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Penjumlahan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah N : ");
        int N = input.nextInt();
        
        int[] arrayy = new int[N];
        
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nilai array [" + i + "]: ");
            arrayy[i] = input.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print("[" + i + "] + 1 = " + (arrayy[i] + 1) + " , ");
        }
        
        int total = 0;
        for (int i = 0; i < N; i++) {
            total += arrayy[i];
        }
        System.out.println("\nTotal = " + total);
          
    }
    
}
