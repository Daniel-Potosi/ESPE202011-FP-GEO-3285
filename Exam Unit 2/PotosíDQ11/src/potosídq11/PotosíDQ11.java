package potosídq11;

import java.util.Scanner;

public class PotosíDQ11 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        int [] value = new int [5];
        int sum = 0;
        
        for (int y = 0; y < 5; y++){
            System.out.println("Enter the number" + y + "->");
            value[y] = scanner.nextInt();
            sum = sum + value[y];
        }
        System.out.println("The sum is" + sum);
    }
    
}
