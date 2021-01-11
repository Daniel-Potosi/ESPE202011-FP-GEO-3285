package areadecagonalprism;

import java.util.Scanner;

public class AreaDecagonalPrism {
    
    static Scanner scanner = new Scanner(System.in);
   
    public static void main(String[] args) {
        // TODO code application logic here
        //Variable declaration
        
        float n1;
        float n2;
        float height;
        
        //opertion
        System.out.println("Please enter the perimeter: ");
        n1 = scanner.nextFloat();
        System.out.println("Please enter the apothem: ");
        n2 = scanner.nextFloat();
        System.out.println("Please enter the height: ");
        height = scanner.nextFloat();
        
        //operation
        System.out.println("The area float of the decagonal prism is: " + n1 * (n2 + height));
        
    }
    
}
