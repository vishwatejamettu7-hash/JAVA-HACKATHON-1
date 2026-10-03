import java.util.Scanner;

public class HouseholdDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int familyMembers = 4;
        double waterConsumed = 450.50; // decimal value
        int houseNumber = 102;
        char usageStatus = 'N'; // e.g., 'N' for Normal, 'H' for High

        System.out.println("House Number: " + houseNumber);
        System.out.println("Family Members: " + familyMembers);
        System.out.println("Water Consumed (Litres): " + waterConsumed);
        System.out.println("Usage Status: " + usageStatus);

        scanner.close();
    }
}
