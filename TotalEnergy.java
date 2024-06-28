import java.util.Scanner;

public class TotalEnergy {
    
    // Function to calculate the total energy produced
    public static double calculateTotalEnergy(double initialEnergy, double rateOfChange, int seconds) {
        double totalEnergy = initialEnergy;
        
        // Iterate through each second of the reaction
        for (int i = 0; i < seconds; i++) {
            // Add the rate of change to the total energy for each second
            totalEnergy += rateOfChange;
        }
        
        return totalEnergy;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the initial energy (X):");
        double initialEnergy = scanner.nextDouble();
        
        System.out.println("Enter the rate of change (R):");
        double rateOfChange = scanner.nextDouble();
        
        System.out.println("Enter the number of seconds (N):");
        int seconds = scanner.nextInt();
        
        double totalEnergy = calculateTotalEnergy(initialEnergy, rateOfChange, seconds);
        
        System.out.println("Total energy produced after " + seconds + " seconds: " + totalEnergy);
        
        scanner.close();
    }
}
