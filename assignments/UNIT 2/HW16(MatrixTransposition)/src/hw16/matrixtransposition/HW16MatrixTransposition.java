package hw16.matrixtransposition;

import java.util.Scanner;

public class HW16MatrixTransposition {

    public static void main(String[] args) {
        // TODO code application logic here
        int [][] a = null;
        int [][] b;
        int [][] t;
        int [][] c;
        int m =0;
        int n=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the matrix dimesions");
        System.out.println("\n m->");
        m= input.nextInt();
        
        System.out.println("\n n->");
        n= input.nextInt();
        
        int matrixA [][] = new int[m][n];
        int matrixB [][] = new int[m][n];
        int matrixC [][] = new int[m][n];
        
        t=new int[n][m];
        
        System.out.println("Enter of numbers in the Matrix A: ");
       for(int i = 0; i < m; i++){
           for(int j = 0; j < n; j++){
               matrixA[i][j]=input.nextInt();
           }
       }
       //Enter data of the matrix B
       System.out.println("Enter of numbers in the Matrix B: ");
       for(int i = 0; i < m; i++){
           for(int j = 0; j < n; j++){
               matrixB[i][j]=input.nextInt();
           }
       }
       //Subtraction of MatrixA and MatrixB
       System.out.println("The Matrix of subtraction is: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        for(int i = 0 ; i < m ; i++){
            System.out.println("");
            for (int j = 0 ; j < n ; j++) {
                System.out.print("\t " + matrixC[i][j]);
            }
        }
        System.out.println("");
        
        //Trasposition Matrix
        
        System.out.println("Trasposition Matrix C ");
         prettyPrintMatrix(m, n, matrixC);
            
            transpose(n, m, t, a);
    }
    
    private static void prettyPrintMatrix(int m, int n, int[][] matrixC) {
       for (int i=0; i< m; i++){
            System.out.println("");
            for(int j=0; j< n; j++){
                if(j== 0){
                    if(i== 0){
                     System.out.println("\t");
                    }else if (i == m - 1){
                        System.out.println("\t");
                        
                    }else{
                        System.out.println("\t");
                    }
                }
                System.out.println(matrixC[i][j]);
                if (j > -1 && j < (n - 1)){
                    System.out.println("\t");
                }
                if ( j== (n - 1)){
                    if (i == 0){
                        System.out.println("\t");
                    } else if ( i == m - 1){
                        System.out.println("\t");
                        
                    }else{
                        System.out.println("\t");
                    }
                }
            }
       }
    }

    private static void transpose(int n, int m, int[][] t, int[][] a) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int[][] matrixC = null;
                matrixC[i][j]=a[j][i];
            }
        }
        
    }
}