/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/* Nama : anna arthdi putra
 * NIM  : 10030035
 * 
 * 
 */
package matrik3x3;

import java.io.IOException;

/**
 *
 * @author aerdy
 */
public class getDeterminan extends Matrik3x3{
    
        Tulis tl = new Tulis(); // Menginstansikan kembali class Tulis
        Cetak ct = new Cetak(); // Menginstansikan class cetak
     public static void getDeterminan(int d) throws IOException{
    	int a[][] = new int[d][d]; // Array Untuk 3x3
		double result;
	 	Tulis.tulis(a, d); // Memanggil method tulis pada Class Tulis
	 	Cetak.cetak(a, d); // Memanggil method cetak pada class cetak
	 	result = determinan(a, d); // memanggil method determinan dari class Matrik3x3
		System.out.println("Hasil matriks diatas adalah : "+result); // menampilkan hasil
    }
    
}
