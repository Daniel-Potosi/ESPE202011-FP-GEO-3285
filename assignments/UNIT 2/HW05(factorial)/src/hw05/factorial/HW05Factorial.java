package hw05.factorial;

import java.util.Scanner;

public class HW05Factorial {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        System.out.println("enter number:");
        int number = scanner.nextInt();
        for(int i = 1; i <= number; i++){
            factorial = factorial * i;
        }
        System.out.println("the factorial of" + number + "is" + factorial);
        
    }
}