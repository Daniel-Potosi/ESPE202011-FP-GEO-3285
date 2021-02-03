package hw09.embeddedstructures;

import java.util.Scanner;

public class HW09EmbeddedStructures {

    public static void main(String[] args) {
        // DONE
        
        Scanner scanner = new Scanner(System.in);
        int variable1;
        int variable2;
        int result;
        
        System.out.println("Enter the variables 1");
        variable1 = scanner.nextInt();
        System.out.println("Enter the variable 2");
        variable2 = scanner.nextInt();
        
        if (variable1 % 2 == 0 && variable2 % 2 == 0) {
            result = variable1 * variable2;
            System.out.println(variable1 + " * " + variable2 + " = " + result);
        }
        if (variable1 % 3 == 0 && variable2 % 3 == 0) {
            result = variable1 + variable2;
            System.out.println(variable1 + " + " + variable2 + " = " + result);       
        }
        if (variable1 % 7 == 0 && variable2 % 7 == 0) {
            result = variable1 % variable2;
            System.out.println(variable1 + " % " + variable2 + " = " + result);
        }
         if (variable1 % 11 == 0 && variable2 % 11 == 0) {
                for (int i = 1; i <= 12; i++) {
                    System.out.println(variable1 + " * " + i + " = " + (variable1 * i));
        
        }
        if (variable1 != variable2) {
                    for (int i = 1; i <= 12; i++) {
                        System.out.println(variable2 + " * " + i + " = " + (variable2 * i));
                    }
        }
        if (variable1 % 13 == 0 && variable2 % 13 == 0) {
            result = variable1 / variable2;
            System.out.println(variable1 + " / " + variable2 + " = " + result);
        }
    }   
    }
}
