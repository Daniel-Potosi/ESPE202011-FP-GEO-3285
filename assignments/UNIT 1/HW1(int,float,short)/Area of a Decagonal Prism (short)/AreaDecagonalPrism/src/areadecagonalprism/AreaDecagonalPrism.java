package areadecagonalprism;

import java.util.Scanner;

public class AreaDecagonalPrism {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        //variable declaration
        
        short n1;
        short n2;
        short height;
        
        //operation
        System.out.println("Please enter the perimeter: ");
        n1 = scanner.nextShort();
        System.out.println("Please enter the apothem: ");
        n2 = scanner.nextShort();
        System.out.println("Please enter the height: ");
        height = scanner.nextShort();
        
        //operation
        System.out.println("The area short of decagonal prism is: " + n1 * (n2 + height));
        
    }
    
}
