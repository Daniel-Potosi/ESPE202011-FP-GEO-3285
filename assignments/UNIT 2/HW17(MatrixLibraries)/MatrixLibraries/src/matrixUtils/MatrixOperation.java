package matrixUtils;

public class MatrixOperation {

    private static int[][] matrixResult;
    //addition,substraction,multiplication of arrays
    public static int addArrays(int[][] matrixA, int[][] matrixB){
        int matrixResult=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            matrixResult[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return matrixResult;
    }
    public static int subtracArrays(int matrixA[][], int matrixB[][]){
        int matrixResult=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            matrixResult[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return matrixResult;
    }
    public static int multiplyArrays(int matrixA[][], int matrixB[][]){
        int matrixResult=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            matrixResult[i][j] = matrixA[i][j] * matrixB[i][j];
            }
        }
        return matrixResult;
    }
}