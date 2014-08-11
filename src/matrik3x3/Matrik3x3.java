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
public class Matrik3x3 {

    /**
     * @param args the command line arguments
     */
    public static double determinan(int b[][], int m) {
       int i,j, c[][] = new int[5][5];
	 	
       double sum = 0;
	 	if(m==2){
			sum = b[0][0]*b[1][1] - b[0][1]*b[1][0];
			return sum;
	  	}
                
	 	for(int p=0;p<m;p++){
		  	int h = 0,k = 0;
		  	for(i=1;i<m;i++){
				for(j=0;j<m;j++){
			 		if(j==p)
			  			continue;
			 		c[h][k] = b[i][j];
			 		k++;
			 		if(k == m-1){
				 		h++;
				 		k = 0;
			  		}
				}
		  	}
		  	sum = sum + b[0][p] * Math.pow(-1,p) * determinan(c,(m-1));
	 	}
	 	return sum;
    }
}
