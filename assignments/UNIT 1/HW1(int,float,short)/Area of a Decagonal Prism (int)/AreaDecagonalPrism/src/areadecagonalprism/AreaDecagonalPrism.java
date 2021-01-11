package areadecagonalprism;

import java.util.Scanner;

public class AreaDecagonalPrism 
{
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
// TODO code application logic here
        // Variable declaration
        int n1;
        int n2;
        int height;
        
        //Operation
        System.out.println("Please enter the perimeter: ");
        n1 = scanner.nextInt();     
        System.out.println("Please enter the apothem: ");
        n2 = scanner.nextInt();
        System.out.println("Please enter the height: ");
        height = scanner.nextInt();
        
        //Operation
        System.out.println("The area of decagonal prism is: " 
                + n1 * (n2 + height) );
        
    }
    
}
