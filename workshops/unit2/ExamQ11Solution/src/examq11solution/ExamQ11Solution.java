package examq11solution;

import java.util.Scanner;

public class ExamQ11Solution {

    public static void main(String[] args) {
        // TODO code application logic here
        int multiplicand = 0;
        int multiplier = 1;
        int product;
        int stop = 12;

        product = 0;
        do {
            System.out.println(" Enter the table want to study ");
            System.out.println(" 0 (zer0) to exit --> ");
            Scanner input = new Scanner(System.in);
            multiplicand = input.nextInt();

            if (multiplicand != 0) {
                System.out.println("Study the tabla of -->" + multiplicand + "<--");
                for (int i = 1; multiplier <= stop; multiplier++) {
                    product = multiplicand * multiplier;
                    System.out.println(multiplicand + " x" + multiplier + " =" + product);
                }
            }
            multiplier = 1;

        } while (multiplicand != 0);
        System.out.println("Godd bye");

    }
    
}
