package potosídanielq11;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class PotosíDanielQ11 {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        
        
        do {
            System.out.println("Calculator");
            System.out.println("1. -> Table of 2");
            System.out.println("2. -> Table of 4");
            System.out.println("3. -> Table of 6");
            System.out.println("4. -> Exit");
            
            System.out.println("Enter your menu option --> ");
            option=input.nextInt();
            
            switch(option) {
                
                case 1:
                    int n1;
                    System.out.println("Enter a whole number: ");                                                         
                    n1 = input.nextInt();
                    System.out.println("Table of 2 " + n1);
                    for(int i = 1; i<=12; i++){
                    System.out.println(n1 + " * " + i + " = " + n1*i);
                    break;
                case 2:
                    int n2;
                    System.out.println("Enter a whole number: ");                                                         
                    n2 = input.nextInt();
                    System.out.println("Table of 4 " + n1);
                    for(int i = 1; i<=12; i++){
                    System.out.println(n2 + " * " + i + " = " + n2*i);
                    break;
                case 3:
                    int n2;
                    System.out.println("Enter a whole number: ");                                                         
                    n2 = input.nextInt();
                    System.out.println("Table of 6 " + n3);
                    for(int i = 1; i<=12; i++){
                    System.out.println(n3 + " * " + i + " = " + n3*i);
                    break;
                case 4:
                    System.out.println("Good Bye Sir");
                    System.exit(0);
                    break;
                default:
            
                    System.out.println("invalid option");

    }
    
}
