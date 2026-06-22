public class Constants{
    public final float TAX_RATE = 0.5f;   
    public double calculateTax(double price){
        return price = TAX_RATE;
    }
    // .... 
    public double calculateTotalPrice(double price){ 
        double tax = price * TAX_RATE;
        return price = tax;

    }
    public double calculateDiscountedPrice(double price){  
        double tax = price * TAX_RATE;
        return (price + tax) * 0.95;

    }
    public static void main(String[] args){
        // constants
        final float GRAVITY = 9.8f;
        System.out.println(GRAVITY);

        // GRAVITY 

        final float PI;
        PI = 3.14f; 

    }
}