package ws13.task;

import java.util.Scanner;

public class WS13Task {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
         int option=0;
        do{
            System.out.println();
            System.out.println();
            System.out.println(" ======== OPTION MENU ========= ");
            System.out.println(" ======== 1. Diamond         ========= ");
            System.out.println(" ======== 2. Rhombiod      ========= ");
            System.out.println(" ======== 3. Trapeze      ========= ");
            System.out.println(" ___________________________________ ");
            System.out.println(" ENTER A OPTION ");
            option = input.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter the Major Diagonal");
                    int Diagonal_Ma=input.nextInt();
                    System.out.println("Enter the Minor Diagonal");
                    int Diagonal_Mi=input.nextInt();
                    System.out.println(" The Area of Diamond is :"+areadiamond(Diagonal_Ma,Diagonal_Mi));
                    break;
                case 2:
                    System.out.println("Enter base");
                    int base_r =input.nextInt();
                    System.out.println("Enter height");
                    int height_r =input.nextInt();
                    System.out.println(" The Area of Rhomboid is :"+arearhomboid(base_r,height_r));
                    break;
                case 3:
                    System.out.println("Enter the Major Base");
                    int base_ma=input.nextInt();
                    System.out.println("Enter the Minor Base");
                    int base_mi=input.nextInt();
                    System.out.println("Enter Height");
                    int height_t=input.nextInt();
                    System.out.println(" The Area of the Trapeze is :"+areatrapeze(base_ma,base_mi,height_t));
                    break;

            }
        } while(option!=4);
    }
        private static int areadiamond(int D, int d) {
            return(D*d)/2;
        }

        private static int arearhomboid(int b, int h) {
            return b*h;
        }

        private static int areatrapeze(int B, int b, int h) {
            return ((B+b)/2)*h;
        }
}    