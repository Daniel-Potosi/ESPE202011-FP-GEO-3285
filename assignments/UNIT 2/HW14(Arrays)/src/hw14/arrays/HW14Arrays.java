package hw14.arrays;

import java.util.Scanner;

public class HW14Arrays {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] Bikes;
        String[]typesBicycles = {"mountain bikes", "road bikes", "bmx"};
        float[] numberBikes ={45F, 14F, 23F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of typesBicycles ->");
        n = input.nextInt();
        
        Bikes =  new int[n];
        //typesBicycles = new String[30]
        //numberBikes = new float[n];
        
        //Bikes[1]=4;
        //Bikes[2]=6;
        //Bikes[3]=8;
        for(int i=0; i<n; i++){
            System.out.println("Enter the number of typesBicycles of the bikes -> " + (i+1) + "->");
            Bikes[i] =input.nextInt();
        }
        for(int typesBycicles : Bikes){
            System.out.println("bikes typesBicycles " + typesBicycles);
        }
        for(int i=0; i<n; i++){
            System.out.println("bikes typesBicycles " + (i+1) + "->" + Bikes[i]);
        }
        for(String typesBicycle:typesBicycles){
            System.out.println("typesBicycles name -> " + typesBicycle);
        }
        for(int i=0; i<numberBikes.length; i++){
            System.out.println("Number of Bikes " + (i+1) + "->" + numberBikes[i]);
        }
    }
    
}
