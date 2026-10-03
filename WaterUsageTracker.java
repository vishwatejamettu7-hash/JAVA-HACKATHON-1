import java.util.Scanner;

public class WaterUsageTracker {

    // Method to calculate total water consumption
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter morning water usage (litres): ");
        int morning = scanner.nextInt();

        System.out.print("Enter evening water usage (litres): ");
        int evening = scanner.nextInt();

        int totalUsage = calculateTotal(morning, evening);

        System.out.println("Total Water Consumption: " + totalUsage + " litres");

        scanner.close();
    }
}