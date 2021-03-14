package taxdeclaration;

import ec.edu.espe.tax.BasicTax;
import java.util.Scanner;

public class TaxDeclaration {

    public static void main(String[] args) {
        float price;
        float totalPrice = 0;
        final float ivaPercentage = 12;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("-----Daniel Potosí Taxes-----");
        System.out.println(" IVA : ->");
        System.out.println("Enter the price of your products: ");
        
        BasicTax.computeIva(totalPrice, ivaPercentage);
        
    }
    
}
