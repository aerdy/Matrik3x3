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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aerdy
 */
public class Main extends getDeterminan{  // Merupakan class utama dari seluruh class
    
    public static void main(String[] args) {
        
        
    DataInputStream inputs = new DataInputStream(System.in);
    getDeterminan gt = new getDeterminan();  //Menginstansikan class getDeterminan
        try {
            getDeterminan(3); //Memanggil method getDeterminan Untuk di eksekusi
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
	
    }	
    
			
		
    
}
