package array_practice;

import java.util.Scanner;

public class tmatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows of 1st matrix : ");
		int r1 = sc.nextInt();
		System.out.println("Enter no of rows of 1st matrix : ");
		int c1 = sc.nextInt();
		
		int mat1[][] = new int [r1][c1];
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
			
				System.out.println("Enter value at rows "+i+" and column "+j+" : ");
				mat1[i][j] = sc.nextInt();
			}
		}
		System.out.println("transposed matrix : ");
		for(int i=0;i<c1;i++) {
			for(int j=0;j<r1;j++) {
				System.out.print(mat1[j][i]+" ");
			}
			System.out.println();
			}


	}

}
