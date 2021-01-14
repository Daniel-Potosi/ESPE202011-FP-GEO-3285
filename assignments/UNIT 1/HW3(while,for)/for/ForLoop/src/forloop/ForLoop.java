package forloop;

public class ForLoop {

    public static void main(String[] args) {
        // TODO code application logic here
         //Variable
        
           System.out.println("Multiplication Tables : 32 ");
           int top=12;
           int product=0;
           int table = 32;
           for (int j = 1; j <= top; j++){
               product = table * j;
               System.out.println("32*" + j + " = " + product);
           }
    }
    
}
