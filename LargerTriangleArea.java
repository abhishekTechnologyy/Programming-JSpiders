import java.util.Scanner;

public class LargerTriangleArea {
    
    // Function to calculate the area of a triangle
    public static double calculateArea(double base, double height) {
        return (base * height) / 2;
    }
    
    // Function to find the larger area between two triangles
    public static double findLargerArea(double base1, double height1, double base2, double height2) {
        double area1 = calculateArea(base1, height1);
        double area2 = calculateArea(base2, height2);
        
        if (area1 > area2) {
            return area1;
        } else {
            return area2;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the base and height of the first triangle:");
        double base1 = scanner.nextDouble();
        double height1 = scanner.nextDouble();
        
        System.out.println("Enter the base and height of the second triangle:");
        double base2 = scanner.nextDouble();
        double height2 = scanner.nextDouble();
        
        double largerArea = findLargerArea(base1, height1, base2, height2);
        
        System.out.println("Area of the larger triangle: " + largerArea);
        
        scanner.close();
    }
}
