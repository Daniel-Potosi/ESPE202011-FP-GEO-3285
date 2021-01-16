package ws07menus;

import java.util.Scanner;

public class WS07Menus {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Addition");
            System.out.println("2. -> Subtraction");
            System.out.println("3. -> Multiplication");
            System.out.println("4. -> Division");
            System.out.println("5. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int addend1;
                    int addend2;
                    int sum;
                    System.out.println("enter addend 1 -> ");
                    addend1 = input.nextInt();
                    System.out.println("enter addend 2 -> ");
                    addend2 = input.nextInt();
                    sum = addend1 + addend2;
                    System.out.println(" the sum is --> " + sum);
                    break;
                case 2:
                    int addend3;
                    int addend4;
                    int substraction;
                    System.out.println("enter addend 3 -> ");
                    addend3 = input.nextInt();
                    System.out.println("enter addend 4 -> ");
                    addend4 = input.nextInt();
                    substraction = addend3 - addend4;
                    System.out.println("The subtraction is --> " + substraction);
                    break;
                case 3:
                    int addend5;
                    int addend6;
                    int multiplication;
                    System.out.println("enter addend 5 -> ");
                    addend5 = input.nextInt();
                    System.out.println("enter addend 6 -> ");
                    addend6 = input.nextInt();
                    multiplication = addend5 * addend6;
                    System.out.println("The multiplcation is --> " + multiplication);
                    break;
                case 4:
                    int addend7;
                    int addend8;
                    int division;
                    System.out.println("enter addend 7 -> ");
                    addend7 = input.nextInt();
                    System.out.println("enter addend 8 -> ");
                    addend8 = input.nextInt();
                    division = addend7 / addend8;
                    System.out.println("The division is -> " + division);
                    break;
                case 5:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }

}
