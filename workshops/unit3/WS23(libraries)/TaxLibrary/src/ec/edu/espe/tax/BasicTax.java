package ec.edu.espe.tax;

public class BasicTax {
    public static float computeIva(float basePrice, float percentageValue){
        float totalPrice;
        totalPrice = basePrice * percentageValue / 100;
        return totalPrice;
    }
    
}
