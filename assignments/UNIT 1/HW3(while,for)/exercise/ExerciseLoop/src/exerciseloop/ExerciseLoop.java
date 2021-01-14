package exerciseloop;

import java.util.Scanner;

public class ExerciseLoop {

    public static void main(String[] args) {
        // TODO code application logic here
        //Variable 
        int a=0, b=0, c=0, end=0;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Range");
        end=read.nextInt();
        
        System.out.println("Enter where it starts");
        b=read.nextInt();
        for(int i=0; i < end; i++){
            c = a + b;
            a = b;
            b = c;
            
            System.out.println(" , " + c);
            
        }
        System.out.println("");
        
    }
    
}
