package modularcalculator;

import java.util.Scanner;
import utils.BasicOperation;

public class ModularCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float operand1;
        float operand2;
        float result;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("---------------");
        System.out.println("Enter two numbers: ->");
        operand1 = input.nextFloat();
        operand2 = input.nextFloat();
        
        System.out.println("------Adition------");
        result = BasicOperation.addTwoNumbers(operand1, operand2);
        System.out.println(operand1 + "+" + operand2 + "=" + result);
        
        System.out.println("------Substraction------");
        result = BasicOperation.subtractTwoNumbers(operand1, operand2);
        System.out.println(operand1 + "-" + operand2 + "=" + result);
        
        System.out.println("------Multiplication------");
        result = BasicOperation.multiplicateTwoNumbers(operand1, operand2);
        System.out.println(operand1 + "*" + operand2 + "=" + result);
       
        System.out.println("------Division------");
        result = BasicOperation.dividTwoNumbers(operand1, operand2);
        System.out.println(operand1 + "/" + operand2 + "=" + result);
    }
    
}