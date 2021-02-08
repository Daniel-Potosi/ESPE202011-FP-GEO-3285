package hw11.sucesion;

public class HW11Sucesion {
    static final int n = 38;
    static int [] sucesion = new int [n+1];

    public static void main(String[] args) {
        // TODO code application logic here
        int f = fibonacci(n);
        
        for(int i=0; i<n; i++){
            System.out.println("fibonacci(" + i + ") = " + sucesion[i]);
            
        }
    }

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