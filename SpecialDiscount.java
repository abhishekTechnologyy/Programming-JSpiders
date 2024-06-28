public class SpecialDiscount {
    
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
    
    // Function to count the number of customers eligible for discount
    public static int countCustomersWithDiscount(int[] billAmounts) {
        int count = 0;
        for (int bill : billAmounts) {
            if (isPerfectSquare(bill)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // Example usage:
        int[] billAmounts = {25, 77, 54, 81, 48, 34}; // Sample bill amounts
        int numberOfDiscountedCustomers = countCustomersWithDiscount(billAmounts);
        System.out.println("Number of customers eligible for discount: " + numberOfDiscountedCustomers);
    }
}
