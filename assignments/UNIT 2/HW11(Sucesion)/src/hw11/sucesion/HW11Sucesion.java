package hw11.sucesion;

public class HW11Sucesion {
    static final int n = 38;
    static int [] sucesion = new int [n+1];

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Author: Daniel Potosí");
        
        int f = fibonacci(n);
        //enter the succession
        for(int i=0; i<n; i++){
            System.out.println("fibonacci(" + i + ") = " + sucesion[i]);
            
        }
    }
    //enter the variables to calculate
    private static int fibonacci(int n) {
        if(n<2){
            sucesion[n] = n;
            return n;
        } else {
            int f = fibonacci(n-1) + fibonacci(n-2);
            sucesion[n] = f;
            return f;
        }
    }
    
}