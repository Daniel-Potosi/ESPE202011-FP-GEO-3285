package ws04logicaloperators;

public class WS04LogicalOperators {

    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        if (x != 10) {
            System.out.println("x is equals to 10");
        } else {
            System.out.println("x is NOT equal to 10");
        }

        boolean y = x != 10;
        System.out.println("x != 10 --> " + (y));
        System.out.println("x == 10 --> " + (x == 10));
        System.out.println("x = 5 -->   " + (x = 5));
        System.out.println("x > 5 -->  " + (x > 5));
        System.out.println("x >= 5 --> " + (x >= 5));

        boolean comparison = false;
        boolean comparison2 = false;
        boolean comparison3 = false;
        comparison = x != 10;
        System.out.println("comparison -> " + comparison);

        comparison2 = x >= 5;
        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);
        System.out.println("comparison2 -> " + comparison2);

        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);

        System.out.println("Daniel Potosi AND TRUTH TEBLE odd numbers -> &&");
        System.out.println("==================================================================");
        
        //Variable
        boolean p;
        boolean q;
        
        p = true;
        q = true;
        
        //operation
        System.out.println(" ( " + p + " ^ " + q + " ) " + (p && q));
        
        //Variable
        boolean p1;
        boolean q1;
        
        p1 = false;
        q1 = false;
        
        //operation
        System.out.println(" ( " + p1 + " ^ " + q1 + " ) " + (p1 && q1));
        
        //Variable
        boolean p2;
        boolean q2;
        
        p2 = false;
        q2 = true;
        
        //operation
        System.out.println(" ( " + p2 + " ^ " + q2 + " ) " + (p2 && q2));
        
        //Variable
        boolean p3;
        boolean q3;
        
        p3 = true;
        q3 = false;
        
        //operation
        System.out.println(" ( " + p3 + " ^ " + q3 + " ) " + (p3 && q3));
        
    }
    
}
