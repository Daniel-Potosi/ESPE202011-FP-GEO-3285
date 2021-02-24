package hw15.matrixsubtraction;

import java.util.Scanner;

public class HW15MatrixSubtraction {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
       int matrixA[][] = new int [3][3];
       int matrixB[][] = new int [3][3];
       int matrixC[][] = new int [3][3];
       
       //Enter data of the matrix A
       System.out.println("Enter of numbers in the Matrix A: ");
       for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++){
               matrixA[i][j]=input.nextInt();
           }
       }
       //Enter data of the matrix B
       System.out.println("Enter of numbers in the Matrix B: ");
       for(int i = 0; i <3; i++){
           for(int j = 0; j < 3; j++){
               matrixB[i][j]=input.nextInt();
           }
       }
       //Subtraction of MatrixA and MatrixB
       System.out.println("The Matrix of subtraction is: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + matrixC[i][j]);
            }
        }
    }   
}