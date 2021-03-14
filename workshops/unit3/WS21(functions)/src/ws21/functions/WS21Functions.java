package ws21.functions;

import java.util.Scanner;

public class WS21Functions {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner job = new Scanner(System.in);
        
        System.out.println(" Daniel Potosí");
        
        System.out.println("Enter the number of sheets to print");
        int sheets = job.nextInt();
        int colorPrints = job.nextInt();
        float colorInkPercentage = job.nextInt();
        int blackAndWhitePrints = job.nextInt();
        float blackInKPercentage = job.nextInt();
        int option;
        int total;
        
        
        System.out.println("-----Chose an options-----");
        System.out.println("                          ");
        System.out.println("1.- total color and black-and-white prints");
        System.out.println("2.- total black and white  prints");
        System.out.println("3.- total color prints");
        
        System.out.println("Enter you menu option -->");
            option = job.nextInt();

            switch (option) {
                
                case 1:
                    total = sumTwoNumbers(colorPrints, blackAndWhitePrints);
                     System.out.println("total is ->" + colorPrints + "+" + blackAndWhitePrints + "=" + total);
                     
            }
    }

    private static int sumTwoNumbers(int colorPrints, int blackAndWhitePrints) {
        int i = 0;
        {
            i = colorPrints + blackAndWhitePrints;

        }
        return i;
        
      }
}