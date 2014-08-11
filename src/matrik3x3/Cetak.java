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

/**
 *
 * @author aerdy
 */
public class Cetak{
    
    public static void cetak(int b[][], int m){
	 	for(int i=0;i<m;i++){
	  		System.out.print(" ");
	  		for(int j=0;j<m;j++)
				System.out.print(b[i][j]+" ");
			System.out.print("\n");
	 	}
	}
    
}
