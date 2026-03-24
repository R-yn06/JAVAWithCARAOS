public class CaraosW903 {
    static final double RATE_PER_UNIT = 1500.00;
    public static void main(String[]args){
        int Units = 15;
        double DiscountRate = 0.10;
        double MiscFee = 1000.00;
        double FixedAmount = 18000.00;

        double RegularTuition = calculateTuition(Units);
        double DiscountedTuition = calculateTuition(Units, DiscountRate);
        double DiscountMiscFee = calculateTuition (Units, DiscountRate, MiscFee);
        double FixedTuition = calculateTuition(FixedAmount);

        printTuitionDetails(RegularTuition, DiscountedTuition, DiscountMiscFee, FixedTuition);
    }

    public static void printTuitionDetails(double regular, double discounted, double discountedMisc, double fixed){
        System.out.printf("===  SMART TUITION CALCULATOR ===\n\n");

        System.out.printf("Regular Tuition: $%,.2f\n", regular);
        System.out.printf("With 10% Discount: $%,.2f\n",discounted);
        System.out.printf("With Discount + Misc Fee: $%,.2f\n",discountedMisc);
        System.out.printf("Fixed Tuition: $%,.2f\n",fixed);
        
    }
    public static double calculateTuition(int units){
        return units * RATE_PER_UNIT;
    }
    public static double calculateTuition(int units, double discountRate){
        return units * RATE_PER_UNIT *(1 - discountRate);
    }
    public static double calculateTuition(int units, double discountRate, double miscfee){
        return (units * RATE_PER_UNIT *(1 - discountRate)) + miscfee;
    }
    public static double calculateTuition (double fixedAmount){
        return fixedAmount;
    }
}