package matrixlibraries;

import java.util.Scanner;
import matrixUtils.MatrixOperation;

public class MatrixLibraries {

    public static void main(String[] args) {
        // TODO code application logic here
       
        int matrixA[][] = new int[3][3];
        int matrixB[][] = new int[3][3];
        int matrixResult[][] = new int[3][3];
        
        Scanner input  = new Scanner(System.in);
        
        System.out.println("--- Enter Data of the Arrays ---");                
        System.out.println("Enter Matrix A");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrixA[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter Matrix B");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){                
                matrixB[i][j] = input.nextInt();
            }
        }
        System.out.println("--- Check the Data of the Arrays ---");
        
        System.out.println("Matrix A");
        
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + matrixA[i][j]);
            }
        }
        
        System.out.println("Matrix B");
        
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + matrixB[i][j]);
            }
        }
        
        System.out.println("-----------------------------------");
        System.out.println("------Adition------");
        matrixResult = MatrixOperation.addArrays(matrixA, matrixB);
        System.out.println(matrixA + "+" + matrixB + "=" + matrixResult);
        
        System.out.println("-----------------------------------");
        System.out.println("------Subtraction------");
        matrixResult = MatrixOperation.subtracArrays(matrixA, matrixB);
        System.out.println(matrixA + "-" + matrixB + "=" + matrixResult);
        
        System.out.println("-----------------------------------");
        System.out.println("------Multiplication------");
        matrixResult = MatrixOperation.multiplyArrays(matrixA, matrixB);
        System.out.println(matrixA + "*" + matrixB + "=" + matrixResult);
       
    }
    
}