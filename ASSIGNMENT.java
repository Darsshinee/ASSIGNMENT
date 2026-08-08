import java.util.Scanner;

public class ASSIGNMENT {

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {

        int totalA = 0;
        int totalB = 0;

        // Calculate totals
        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            totalB += sectionB[i];
        }

        // Find highest quantity and its index
        int highest = sectionA[0];
        int highestIndex = 0;

        for (int i = 0; i < sectionA.length; i++) {

            if (sectionA[i] > highest) {
                highest = sectionA[i];
                highestIndex = i;
            }

            if (sectionB[i] > highest) {
                highest = sectionB[i];
                highestIndex = i;
            }
        }

        // Print totals and status
        System.out.print("Section A Total: " + totalA);
        System.out.print(" | Section B Total: " + totalB);

        if (totalA == totalB) {
            System.out.print(" | Status: Balanced");
        } else {
            System.out.print(" | Status: Not Balanced");
        }

        System.out.println(" | Highest Quantity: " + highest
                + " (Section index: " + highestIndex + ")");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] sectionA = new int[n];
        int[] sectionB = new int[n];

        System.out.println("Enter Section A quantities:");
        for (int i = 0; i < n; i++) {
            sectionA[i] = sc.nextInt();
        }

        System.out.println("Enter Section B quantities:");
        for (int i = 0; i < n; i++) {
            sectionB[i] = sc.nextInt();
        }

        analyzeInventory(sectionA, sectionB);

        sc.close();
    }
}