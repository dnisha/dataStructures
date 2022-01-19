package array_practice;

import java.util.Scanner;

public class matrix {

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

		System.out.println("Enter no of rows of 2st matrix : ");
		int r2 = sc.nextInt();
		System.out.println("Enter no of rows of 2st matrix : ");
		int c2 = sc.nextInt();
		
		int mat2[][] = new int [r2][c2];
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
			
				System.out.println("Enter value at rows "+i+" and column "+j+" : ");
				mat2[i][j] = sc.nextInt();
			}
		}
        System.out.println("Addition of matrix : ");
	
		 int ans[][] = new int [r1][c1] ;
                
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				ans[i][j] = mat1[i][j]+mat2[i][j];
			}
		}
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				
				System.out.print(ans[i][j]+" ");

			}
			System.out.println();
		}

	}

}
