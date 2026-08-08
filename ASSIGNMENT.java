import java.util.Scanner;

public class ASSIGNMENT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] seats = new int[n];

        System.out.println("Enter seat numbers:");
        for (int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            int count = 0;

            // Count occurrences
            for (int j = 0; j < n; j++) {
                if (seats[i] == seats[j]) {
                    count++;
                }
            }

            // Check if already printed
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (seats[i] == seats[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (count > 1 && !alreadyPrinted) {
                System.out.println("Duplicate found: " + seats[i]
                        + ", occurrence: " + count);
            }
        }

        sc.close();
    }
}