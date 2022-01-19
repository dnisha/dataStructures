package array_practice;

import java.util.Scanner;

public class matrixmul {

	public static void main(String[] args) {
	
		 int mat1[][] = {{ 1, 2},{ 4,5}};
		 
		 int mat2[][] = {{ 7,8},{ 9,10}};
		 int ans[][] = new int [2][2] ;
               
	
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				ans[i][j]=0;
				for(int k=0;k<2;k++) {
					ans[i][j] +=	mat1[i][k]*mat2[k][j];
				}
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				
				System.out.print(ans[i][j]+" ");

			}
			System.out.println();
		}

	}

}
