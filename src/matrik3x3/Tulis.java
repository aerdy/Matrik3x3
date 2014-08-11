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

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author aerdy
 */
public class Tulis{
    
    public static void tulis(int b[][], int m) throws IOException{
		DataInputStream input = new DataInputStream(System.in);
	 	for(int i=0;i<m;i++){
	  		for(int j=0;j<m;j++){
	  			System.out.print("Elemen ke ["+(i+1)+","+(j+1)+"]"+" : ");
	  			b[i][j] = Integer.parseInt(input.readLine());
	  		}
	 	}
	}
    
}
