package hw4.menu;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class HW4Menu {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        
        
        do {
            System.out.println("Calculator");
            System.out.println("1. -> Module");
            System.out.println("2. -> Square Root");
            System.out.println("3. -> power");
            System.out.println("4. -> Exit");
            
            System.out.println("Enter your menu option --> ");
            option=input.nextInt();
            
            switch(option) {
                
                case 1:
                    int addend1, addend2, module;
                    System.out.println("enter addend 1 -> ");
                    addend1=input.nextInt();
                    System.out.println("enter addend 2 -> ");
                    addend2=input.nextInt();
                    module=addend1 % addend2;
                    System.out.println("the module is --> " + module);
                    break;
                case 2:
                    System.out.println("calculate square root");
                    int addend3;
                    System.out.println("enter addend 3 -> ");
                    addend3=input.nextInt();
                    double result = sqrt(addend3);
                    System.out.println("the square root of " + addend3 + " is " + result);
                    break;
                case 3:
                    System.out.println("calculate power");
                    int num, elevate;
                    System.out.println("enter num -> ");
                    num=input.nextInt();
                    System.out.println("enter elevate -> ");
                    elevate=input.nextInt();
                    int result1 = (int) Math.pow(num, elevate);
                    System.out.println("the power of " + num + elevate + "is" + result1);
                    break;
                case 4:
                    System.out.println("Good Bye Sir");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid option");
                    
            }
            
            option = input.nextInt();
        } while(option > 5);
    }
    
}