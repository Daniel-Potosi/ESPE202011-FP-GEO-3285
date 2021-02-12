package hw12.taxes;

import java.util.Scanner;

public class HW12Taxes {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in); 
       
       //CALCULATION OF VAT
       float base = 0.0F;
       final float percentage = 12.0F;
       float total;
       float vat;
       vat = obtainIva (base, percentage);
       
       System.out.println("The VAT is ");
       System.out.println("Enter base ->");
       base = input.nextInt();
       vat = base * percentage / 100;
        
       System.out.println(" VAT --> " + vat);
        
       total = base + vat;
        
       System.out.println("Base: " + base);
       System.out.println("VAT: " + vat);
       System.out.println("Total: " + total);
       
      //Currency outflow tax
       
       float amount = 0.0F;
       final float limitquantity = 1200.0F;
       float remaining;
       final float tax = 0.05F;
       float value;
       
       value = outflowtax (amount, limitquantity);
       
       System.out.println("The Value is ");
       System.out.println("Enter is amount ->");
       amount = input.nextInt();
       
       value = (amount - limitquantity) * 0.05F;
       
       System.out.println(" Value --> " + value);
       //Income tax calculation
       //basic fraction $0   Excess up to $11212
       float baseimp = 0.0F;
       final float basicfraction = 0.0F;
       float surplusfraction = 0.0F;
       float tax1 = 0.0F;
       float value1;
       
       value1 = Incometax (baseimp, basicfraction, surplusfraction,tax1);
       
       System.out.println("The Income tax is");
       System.out.println("Enter baseimp -> ");
       baseimp = input.nextInt();
       
       value1 = ((baseimp - basicfraction)* surplusfraction)+ tax1 ;
       
        System.out.println(" Value1 --> " + value1);
       
       //basic fraction $11212   Excess up to $14285
       float baseimp2 = 0.0F;
       final float basicfraction2 = 11212F;
       final float surplusfraction2 = 0.05F;
       final float tax2 = 0.0F;
       float value2;
       
       value2 = Incometax2 (baseimp2, basicfraction2, surplusfraction2,tax2);
       
       System.out.println("The Income tax is");
       System.out.println("Enter baseimp -> ");
       baseimp2 = input.nextInt();
       
       value2 = ((baseimp2 - basicfraction2)* surplusfraction2)+ tax2 ;
       
       System.out.println(" Value2 --> " + value2);
       
       //basic fraction $14285 excess up to $17854
       float baseimp3 = 0.0F;
       final float basicfraction3 = 14285F;
       final float surplusfraction3 = 0.10F;
       final float tax3 = 154.0F;
       float value3;
       
       value3 = Incometax3 (baseimp3, basicfraction3, surplusfraction3,tax3);
       
       System.out.println("The Income tax is");
       System.out.println("Enter baseimp3 -> ");
       baseimp3 = input.nextInt();
       
       value3 = ((baseimp3 - basicfraction3)* surplusfraction3)+ tax3 ;
       
       System.out.println(" Value3 --> " + value3);
        
       //basic fraction $17854 excess up to $21442
       float baseimp4 = 0.0F;
       final float basicfraction4 = 17854F;
       final float surplusfraction4 = 0.12F;
       final float tax4 = 511.0F;
       float value4;
       
       value4 = Incometax4 (baseimp4, basicfraction4, surplusfraction4,tax4);
       
       System.out.println("The Income tax is");
       System.out.println("Enter baseimp -> ");
       baseimp4 = input.nextInt();
       
       value4 = ((baseimp4 - basicfraction4)* surplusfraction4)+ tax4 ;
       
       System.out.println(" Value4 --> " + value4);
       
       //basic fraction $21442   Excess up to $42874
       float baseimp5 = 0.0F;
       final float basicfraction5 = 21442F;
       final float surplusfraction5 = 0.15F;
       final float tax5 = 941F;
       float value5;
       
       value5 = Incometax5 (baseimp5, basicfraction5, surplusfraction5,tax5);
       
       System.out.println("The Income tax is");
       System.out.println("Enter baseimp -> ");
       baseimp5 = input.nextInt();
       
       value5 = ((baseimp5 - basicfraction5)* surplusfraction5)+ tax5 ;
       
       System.out.println(" Value5 --> " + value5);
       
       
       //basic fraction $42874   Excess up to $64297
       float baseimp6 = 0.0F;
       final float basicfraction6 = 42874.0F;
       final float surplusfraction6 = 0.20F;
       final float tax6 = 4156.0F;
       float value6;
       
       value6 = Incometax6 (baseimp6, basicfraction6, surplusfraction6,tax6);
       
       System.out.println("The Income tax is");
       System.out.println("Enter baseimp -> ");
       baseimp6 = input.nextInt();
       
       value6 = ((baseimp6 - basicfraction6)* surplusfraction6)+ tax6 ;
       
       System.out.println(" Value6 --> " + value6);
       
       //basic fraction $64297   Excess up to $85729
       float baseimp7 = 0.0F;
       final float basicfraction7 = 64297.0F;
       final float surplusfraction7 = 0.25F;
       final float tax7 = 8440.0F;
       float value7;
       
       value7 = Incometax7 (baseimp7, basicfraction7, surplusfraction7, tax7);
       
       System.out.println("The Income tax is");
       System.out.println("Enter baseimp -> ");
       baseimp7 = input.nextInt();
       
       value7 = ((baseimp7 - basicfraction7)* surplusfraction7)+ tax7 ;
       
       System.out.println(" Value7 --> " + value7);
       
       //basic fraction $85729   Excess up to $114288
       float baseimp8 = 0.0F;
       final float basicfraction8 = 85729.0F;
       final float surplusfraction8 = 0.30F;
       final float tax8 = 13798.0F;
       float value8;
       
       value8 = Incometax8 (baseimp8, basicfraction8, surplusfraction8,tax8);
       
       System.out.println("The Income tax is");
       System.out.println("Enter baseimp -> ");
       baseimp8 = input.nextInt();
       
       value8 = ((baseimp8 - basicfraction8)* surplusfraction8)+ tax8 ;
       
       System.out.println(" Value1 --> " + value8);
       
       //basic fraction $114288   Excess up to -----
       float baseimp9 = 0.0F;
       final float basicfraction9 = 114288F;
       final float surplusfraction9 = 0.35F;
       final float tax9 = 22366.0F;
       float value9;
       
       value9 = Incometax9 (baseimp9, basicfraction9, surplusfraction9,tax9);
       
       System.out.println("The Income tax is");
       System.out.println("Enter baseimp -> ");
       baseimp9 = input.nextInt();
       
       value9 = ((baseimp9 - basicfraction9)* surplusfraction9)+ tax9 ;
       
       System.out.println(" Value1 --> " + value9);
       
       
       
       
    }
       public static float obtainIva(float base, float percentage) {
       float vat = 0.0F;
                vat = (float) base * (float) percentage / 100;
           return vat;
           
    
       
       
       }
       public static float outflowtax (float amount, float limitquantity) {
         
       float value = 0.0F;
             value = ((float)amount - (float)limitquantity) * 0.05F;
             
             return value;
             
       }
       public static float Incometax (float baseimp, float basicfraction, float surplusfraction, float tax1 ){
            float value1 = 0.0F;
            
            
                   value1 = ((((float) baseimp - (float) basicfraction))* (float)surplusfraction)+ (float)tax1 ;
            
                   return value1;
        }
       public static float Incometax2 (float baseimp2, float basicfraction2, float surplusfraction2, float tax2 ){
            float value2 = 0.0F;
            
            
                   value2 = ((((float) baseimp2 - (float) basicfraction2))* (float)surplusfraction2)+ (float)tax2 ;
            
                   return value2;
        }
       public static float Incometax3 (float baseimp3, float basicfraction3, float surplusfraction3, float tax3 ){
            float value3 = 0.0F;
            
            
                   value3 = ((((float) baseimp3 - (float) basicfraction3))* (float)surplusfraction3)+ (float)tax3 ;
            
                   return value3;    
        }
       public static float Incometax4 (float baseimp4, float basicfraction4, float surplusfraction4, float tax4 ){
            float value4 = 0.0F;
            
            
                   value4 = ((((float) baseimp4 - (float) basicfraction4))* (float)surplusfraction4)+ (float)tax4 ;
            
                   return value4; 
        }
       public static float Incometax5 (float baseimp5, float basicfraction5, float surplusfraction5, float tax5 ){
            float value5 = 0.0F;
            
            
                   value5 = ((((float) baseimp5 - (float) basicfraction5))* (float)surplusfraction5)+ (float)tax5 ;
            
                   return value5;
         }
       public static float Incometax6 (float baseimp6, float basicfraction6, float surplusfraction6, float tax6 ){
            float value6 = 0.0F;
            
            
                   value6 = ((((float) baseimp6 - (float) basicfraction6))* (float)surplusfraction6)+ (float)tax6 ;
            
                   return value6; 
                   }
       public static float Incometax7 (float baseimp7, float basicfraction7, float surplusfraction7, float tax7 ){
            float value7 = 0.0F;
            
            
                   value7 = ((((float) baseimp7 - (float) basicfraction7))* (float)surplusfraction7)+ (float)tax7 ;
            
                   return value7;
                   }
       public static float Incometax8 (float baseimp8, float basicfraction8, float surplusfraction8, float tax8 ){
            float value8 = 0.0F;
            
            
                   value8 = ((((float) baseimp8 - (float) basicfraction8))* (float)surplusfraction8)+ (float)tax8 ;
            
                   return value8;
                   }
       public static float Incometax9 (float baseimp9, float basicfraction9, float surplusfraction9, float tax9 ){
            float value9 = 0.0F;
            
            
                   value9 = ((((float) baseimp9 - (float) basicfraction9))* (float)surplusfraction9)+ (float)tax9 ;
            
                   return value9;
    }
    
}