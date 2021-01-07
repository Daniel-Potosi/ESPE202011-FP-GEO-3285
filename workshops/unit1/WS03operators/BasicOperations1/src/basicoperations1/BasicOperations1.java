/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations1;

/**
 *
 * @author Andres Ruiz
 */
public class BasicOperations1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variable declaration
        int sum;
        int addend1;
        int addend2;
        
        int minuend;
        int subtrahend;
        int diference;
        
        minuend = -23;
        subtrahend = -6;
        
        int multiplying;
        int multiplier;
        int product;
    
        multiplying = 14;
        multiplier = 25;
        
        int dividend;
        int divider;
        int residue;
        
        dividend = 81;
        divider = 8;
        
        int dividend1;
        int divider2;
        int residue3;
        
        dividend1 = 25;
        divider2 = 4;
        
        //initialization
        addend1 = 5;
        addend2 = 18;
        
        //ooperation
        sum = addend1 + addend2;
        
        System.out.println(" The adition of " + addend1 + " + " + addend2 +
               " is equal to --> " + sum);
        
        ++sum;
        System.out.println(" sum is equal to --> " + sum);
        
        sum++;
        System.out.println(" sum is equal to --> " + sum);
        
        System.out.println(" adding one to sum " + (sum++));
        
        System.out.println(" adding one to sum "  + (++sum));
        
        System.out.println(" the substraction of " + minuend + " - " + subtrahend +
                " is equal to " + (minuend - subtrahend));
        
        System.out.println(" the multiplication of " + multiplying + 
                " * " + multiplier + " is equal to " + (multiplying * multiplier));
        
        System.out.println(" the module of " + dividend + " % " + divider + 
                " is equal to " + (dividend % divider));
        
        System.out.println(" the division of " + dividend1 + " / " + divider2 + 
                " is equal to " + (dividend1 / divider2));
    }
    
}