package potosíd.q11;

import java.util.Arrays;
import java.util.Scanner;

public class PotosíDQ11 {

    public static void main(String[] args) {
        // Enter the data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array of numbers");
        int[] numeros = new int[5];
        int i;
        int numbers=scanner.nextInt();
        for(i=0; i<4; i++){
            System.out.println(numbers);
        }
        System.out.println("Enter the vector");
        int[] vector = {12,23,34,98,87,65,0};
        int numberSearch = scanner.nextInt();
        int positionElementSearch = existInArray(numbers, numberSearch);
        if (positionElementSearch == -1) {
            System.out.println("The element doesn't exist in array");
                } else {
            String positionOfElementSearch = null;
                    System.out.println("Element exists at position: " + positionOfElementSearch);
        }
    }

    private static int existInArray(int numbers, int numberSearch) {
        int positionOfElementSearch = 0;
        if (positionOfElementSearch == -1) {
			System.out.println("The element doesn't exist in array");
		} else {
			System.out.println("Element exists at position: " + positionOfElementSearch);
		}
        return 0;
    }
}